package linkedin;
import java.util.*;

public class ValidStirngRepOfBinayTree {
	public static int find_depth(String s){
		if (s.length() == 0) return -1;
		int par = 0;
		int zero = 0;
		int max = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				par++;
				max = Math.max(max, par - 1);
			}
			else if (c == '0') {
				if (par == 0 || zero > par) return -1;
				zero++;
			}
			else if (c == ')') {
				if (par == 0 || zero < 2) return -1;
				par--;
				zero--;
			}
			else
				return -1;
		}
		
		if (par != 0 || zero != 1) {
			return -1;
		}
		else {
			return max;
		}
	}


	
	
	public static void main(String[] args){
		System.out.println(find_depth("(00)"));
		System.out.println(find_depth("((00)0)"));
		System.out.println(find_depth("((00)(00))"));
		System.out.println(find_depth("((00)(0(00)))"));
		System.out.println(find_depth("((00)(0(0(00))))"));
		System.out.println(find_depth("x"));
		System.out.println(find_depth("0"));
		System.out.println(find_depth("()"));
		System.out.println(find_depth("(0)"));
		System.out.println(find_depth("(00)x"));
		System.out.println(find_depth("(0p)"));
	}
}
