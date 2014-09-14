/* 
 * Output top N positive integer in string comparison order. 
 * For example, let's say N=1000, then you need to output in string comparison order as below: 
 * 1, 10, 100, 1000, 101, 102, ... 109, 11, 110, ...
 */

package google;

public class NumberInStringComparisonOrder {
	public static void printRec(String s, int n){
		if(Integer.parseInt(s)>n) return;
		System.out.println(s);
		for(int i=0;i<10;i++)
			printRec(s+i,n);
	}
	
	public static void main(String[] args){
		for(int i=1;i<10;i++)
			printRec(""+i,1000);
	}
}
