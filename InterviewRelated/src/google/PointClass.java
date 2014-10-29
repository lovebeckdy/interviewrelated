/*
 * implement equals and hashcode method for a simple point class
 */

package google;

public class PointClass {
	private final int x, y;
	public PointClass(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int hashCode(){
		return (Integer.toString(x)+","+Integer.toString(y)).hashCode();
	}
	
	public boolean equals(Object other){
		if(this==other) return true;
		if(!(other instanceof PointClass)) return false;
		PointClass otherPoint = (PointClass) other;
		return otherPoint.getX()==x && otherPoint.getY()==y;
	}
}
