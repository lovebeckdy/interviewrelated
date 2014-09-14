package facebook;
import java.util.*;

public class KthClosest {
	public static void main(String[] args){
		Point[] myList = new Point[10];
		myList[0] = new Point(1,1);
		myList[1] = new Point(2.1,3);
		myList[2] = new Point(5,7.5);
		myList[3] = new Point(3.2,0.5);
		myList[4] = new Point(6,10);
		myList[5] = new Point(-1.3,1);
		myList[6] = new Point(0.7,2.4);
		myList[7] = new Point(1.9,4.1);
		myList[8] = new Point(-2.8,1.2);
		myList[9] = new Point(2,0.1);
		Point[] result = closestk2(myList, 3);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
		System.out.println();
		for(int i=0;i<myList.length;i++){
			System.out.print(myList[i]+" ");
		}
	}
	
	public static Point[] closestk2(Point myList[], int k) {
		Point[] result = new Point[k];
		PriorityQueue<Point> q = new PriorityQueue<Point>(k, new Comparator<Point>(){
            public int compare(Point p1, Point p2){
                if(distance(p1)>distance(p2)) return -1;
                else if(distance(p1)==distance(p2)) return 0;
                else return 1;
            }
        });
		int index = 0;
		for(;index<k;index++){
			q.offer(myList[index]);
		}
		for(;index<myList.length;index++){
			Point cur = myList[index];
			if(distance(cur)<distance(q.peek())){
				q.poll();
				q.offer(cur);
			}
		}
		for(int i=0;i<k;i++){
			result[k-i-1] = q.poll();
		}
		return result;
	}
	
	public static Point[] closestk(Point myList[], int k) {
		select(myList, 0, myList.length-1, k);
		Point[] result = new Point[k];
		for(int i=0;i<k;i++){
			result[i] = myList[i];
		}
		return result;
	}
	
	public static void select(Point[] a, int start, int end, int k){
		if(end-start<1) return;
		Point pivot = a[start];
		int split = partion(a, start, end, pivot);
		a[split] = pivot;
		if(split==k-1) return;
		else if(split>k-1) select(a, start, split, k);
		else select(a, split+1, end, k);
	}
	
	public static int partion(Point[] a, int start, int end, Point pivot){
		int i=start;
		int j=end;
		while(i<j){			
			while(distance(a[j])>=distance(pivot)&&i<j){
				j--;
			}
			if(i<j){
				a[i++] = a[j];
			}
			while(distance(a[i])<=distance(pivot)&&i<j){
				i++;
			}
			if(i<j){
				a[j--]=a[i];
			}
		}
		return i;
	}
	
	public static double distance(Point p){
		return p.x*p.x+p.y*p.y;
	}
}


class Point {
    public double x;
    public double y;
    public Point(double a, double b){
    	x = a;
    	y = b;
    }
    public String toString(){
    	return "x="+x+"y="+y;
    }
}