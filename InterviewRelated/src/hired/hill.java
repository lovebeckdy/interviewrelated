package hired;
import java.util.*;

public class hill {
	public static void hill(Integer[] v) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
		int cur = v[0];
		int max = 0;
		for(int i=1;i<v.length;i++){
			cur = Math.max(cur+1,v[i]);
			max = Math.max(max,cur-v[i]);
		}
		System.out.println((int)(max/2.0));
    }
}




