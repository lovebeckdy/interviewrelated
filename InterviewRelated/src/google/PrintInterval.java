/*
Given a sorted array without duplicates and all numbers are in the range from 0 to 99, inclusive. 
Print the rest of numbers in the following way.

Input:£º [0,1,3,50,75]
Output£º [2,4-49,51-74,76-99]

*/

package google;

public class PrintInterval {
	public static void printInterval(int[] num, int start, int end){
		if(start>end) return;
		int s = start, e = start, i = 0;
		while(i<num.length){
			while(e+1<num[i] && e!=end) e++;
			if(s==e){
				if(e!=num[i]) System.out.println(s);
			}else{
				System.out.print(s);
				System.out.print('-');
				System.out.print(e);
				System.out.println();
			}
			s = num[i]+1;
			e = s;
			i++;
		}
		if(s==end) System.out.println(s);
		if(s<end){
			System.out.print(s);
			System.out.print('-');
			System.out.print(end);
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		int[] num = {0,1,3,50,75};
		printInterval(num,0,99);
	}
}
