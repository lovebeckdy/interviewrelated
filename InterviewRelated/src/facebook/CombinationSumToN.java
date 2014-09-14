/*
Given a number N, write a program that returns all possible combinations 
of numbers that add up to N, as lists. (Exclude the N+0=N) 

For example, if N=4 return {{1,1,1,1},{1,1,2},{2,2},{1,3}}

*/

package facebook;
import java.util.*;

public class CombinationSumToN {
	public static List<List<Integer>> CombSumToN(int n){
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		List<Integer> sol = new ArrayList<Integer>();
		getComb(ret,sol,0,1,n);
		return ret;
	}
	
	public static void getComb(List<List<Integer>> ret, List<Integer> sol, int sum, int start, int n){
		if(sum>n || start==n) return;
		if(sum==n){
			ret.add(new ArrayList<Integer>(sol));
			return;
		}
		for(int i=start;i<=n;i++){
			sol.add(i);
			getComb(ret,sol,sum+i,i,n);
			sol.remove(sol.size()-1);
		}
	}
	
	public static void main(String[] args){
		List<List<Integer>> ret = CombSumToN(4);
		for(int i=0;i<ret.size();i++){
			for(int tmp:ret.get(i)){
				System.out.print(tmp);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
