/* 
 * Given a NxN matrix which contains all distinct 1 to n^2 numbers, write code 
 * to print sequence of increasing adjacent sequential numbers. 
 * ex: 
 * 1 5 9 
 * 2 3 8 
 * 4 6 7 
 * 
 * should print
 * 6 7 8 9

*/

package google;

public class SequenceOfIncreasingNumber {
	public static void printNum(int[][] matrix){
		int n = matrix.length;
		boolean[] adj = new boolean[n*n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int val = matrix[i][j];
				boolean found = false;
				if(i>0 && matrix[i-1][j]==val+1) found |= true;
				if(i<n-1 && matrix[i+1][j]==val+1) found |= true;
				if(j>0 && matrix[i][j-1]==val+1) found |= true;
				if(j<n-1 && matrix[i][j+1]==val+1) found |= true;
				if(found)
					adj[val-1] = true;
			}
		}
		
		int maxlen = 0, maxstart = 0, i=0;
		while(i<adj.length){
			while(i<adj.length && !adj[i]) i++;
			if(i==adj.length) break;
			int start = i;
			while(i<adj.length && adj[i]) i++;
			if(i-start>maxlen){
				maxlen = i-start;
				maxstart = start;
			}
		}
		
		for(int j=maxstart+1;j<=maxstart+maxlen+1;j++)
			System.out.println(j);
	}
	
	public static void main(String[] args){
		int[][] matrix = {{1,5,9},{2,3,8},{4,6,7}};
		printNum(matrix);
	}
}
