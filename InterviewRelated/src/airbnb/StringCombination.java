package airbnb;
import java.util.*;

public class StringCombination {
	public static Set<String> stringCombination(String s){
		Set<String> cur = new HashSet<String>();
		Set<String> next = new HashSet<String>();
		Set<String> swap;
		cur.add(Character.toString(Character.toLowerCase(s.charAt(0))));
		cur.add(Character.toString(Character.toUpperCase(s.charAt(0))));		
		for(int i=1;i<s.length();i++){
			Iterator<String> it = cur.iterator();
			while(it.hasNext()){
				String tmp = it.next();
				next.add(tmp+Character.toLowerCase(s.charAt(i)));
				next.add(tmp+Character.toUpperCase(s.charAt(i)));
			}
			swap = cur;
			cur = next;
			next = swap;
			next.clear();
		}
		return cur;
	}
}
