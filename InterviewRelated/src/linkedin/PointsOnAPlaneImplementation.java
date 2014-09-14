package linkedin;

import java.util.*;

import leetcode.Point;

public class PointsOnAPlaneImplementation implements PointsOnAPlane{
    private Collection<Point> points = new ArrayList<Point>();	
	/**
     * Stores a given point in an internal data structure
     */
    public void addPoint(Point point){
    	this.points.add(point);
    }
    
    public int dist(Point a, Point b){
    	return (a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y);
    }

    public class PointComparator implements Comparator<Point>{
    	private Point center;
    	PointComparator(Point center){
    		this.center = center;
    	}
    	public int compare(Point a, Point b){
    		int dist_a = dist(a,center);
    		int dist_b = dist(b,center);
    		return dist_a-dist_b;
    	}
    }
    
    public Collection<Point> findNearest(Point center, int m){
    	if(points.size()<=m) return points;
    	Collection<Point> ret = new ArrayList<Point>();
    	PriorityQueue<Point> pq = new PriorityQueue(m, new PointComparator(center));
    	for(Point p:points){
    		if(pq.size()<m)
    			pq.offer(p);
    		else{
    			Point max = pq.peek();
    			if(dist(max,center)>dist(p,center)){
    				pq.poll();
    				pq.offer(p);
    			}
    		}
    	}
    	while(pq.size()!=0){
    		ret.add(pq.poll());
    	}
    	return ret;
    }
    
    public static void main(String[] args){
    	PointsOnAPlaneImplementation plane = new PointsOnAPlaneImplementation();
    	plane.addPoint(new Point(0,1));
    	plane.addPoint(new Point(0,2));
    	plane.addPoint(new Point(0,3));
    	plane.addPoint(new Point(0,4));
    	plane.addPoint(new Point(0,5));
    	Collection<Point> ret = plane.findNearest(new Point(0,0), 3);
    	for(Point p:ret)
    		System.out.println(String.valueOf(p.x) + String.valueOf(p.y));
    }
}
