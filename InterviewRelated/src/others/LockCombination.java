package others;
import java.util.*;

public class LockCombination {
	public static Set<String> getcomb(char[][] board){
		Set<String> ret = new HashSet<String>();
		StringBuilder s = new StringBuilder();
		int m = board.length;
		int n = board[0].length;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				find(board, i, j, s, 0, ret);
			}
		}
		return ret;
	}
	
	private static void find(char[][] board, int i, int j, StringBuilder s, int index, Set<String> ret){
		if(index==5){
			ret.add(s.toString());
			return;
		}
		if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]=='#')
			return;
		s.append(board[i][j]);
		char tmp = board[i][j];
		board[i][j] = '#';
		find(board,i-1,j,s,index+1,ret);
		find(board,i+1,j,s,index+1,ret);
		find(board,i,j-1,s,index+1,ret);
		find(board,i,j+1,s,index+1,ret);
		s.deleteCharAt(s.length()-1);
		board[i][j] = tmp;
		
	}
	
	public static void main(String[] args){
		char[][] board = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		char[][] board2 = {{'1','2','3'},{'4','5','6'}};
		Set<String> ret = getcomb(board2);
		for(String s:ret)
			System.out.println(s);
		System.out.println(ret.size());
	}
}
