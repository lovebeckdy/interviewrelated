package airbnb;
import java.util.*;

public class FindBiggestSquare {
	private static int largestSquareArea(int[] height){
		if(height==null || height.length==0) return 0;
		Stack<Integer> s = new Stack<Integer>();
		int max = 0;
		for(int i=0;i<=height.length;i++){
			int cur = (i==height.length)? 0:height[i];
			if(s.empty() || cur>height[s.peek()])
				s.push(i);
			else{
				int tmp = s.pop();
				int cur_max = Math.min(height[tmp],(s.empty()?i:i-s.peek()-1));
				max = Math.max(max, cur_max*cur_max);
				i--;
			}
		}
		return max;
	}
	
	public static int maximalSquare(int[][] matrix){
		if(matrix==null) return 0;
		int max = 0;
		int m = matrix.length, n = matrix[0].length;
		int[] hist = new int[n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(matrix[i][j]==0) hist[j] = 0;
				else hist[j]++;
			}
			max = Math.max(max,largestSquareArea(hist));
		}
		return max;
	}
	
	public static void main(String[] args){
		int[] height = {2,1,5,6,2,3};
		System.out.println(largestSquareArea(height));
		int[][] matrix = {{1,0,1,0,1,0}, {1,0,1,1,1,1}, {0,1,1,1,1,1}, {0,0,1,1,1,1}, {1,1,1,1,1,1}};
		System.out.println(maximalSquare(matrix));
	}
}
