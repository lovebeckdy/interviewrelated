/*
 * 
 *  Given an unsorted array of integers, you need to return maximum possible n such that the array consists at least n values greater than or equals to n. 
 *  Array can contain duplicate values.
 *  
 *  Sample input : [1, 2, 3, 4] -- output : 2 
 *  Sample input : [900, 2, 901, 3, 1000] -- output: 3
 * 
 */

package google;

public class MaxNElemNoLessThanN {
	public static int solve(int[] num){
		int[] count = new int[num.length+1];
		for(int i:num){
			if(i>=num.length) count[num.length]++;
			else if(i>0) count[i]++;
		}
		
		int total = 0;
		for(int i=num.length;i>0;i--){
			total += count[i];
			if(total>=i)
				return i;
		}
		return 0;
	}
	
	public static void main(String[] args){
		int[] num = {1,2,3,4};
		System.out.println(solve(num));
		int[] num1 = {900, 2, 901, 3, 1000};
		System.out.println(solve(num1));
	}
}
