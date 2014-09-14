package others;

import java.util.Arrays;

public class test {
	public static void main(String[] args){
		char[] tmp = {'a','b','c','d'};
		System.out.println(new String(tmp));
		System.out.println(Arrays.toString(tmp));
		
		String s = Arrays.toString(tmp);
		System.out.println(s);
	}
}
