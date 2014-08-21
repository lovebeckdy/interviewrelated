package airbnb;
import java.util.Set;
import java.util.*;

import leetcode.*;

public class FindString {
	public Set<String> findString(Set<String> dict, String target){
		EditDistance dist = new EditDistance();
		Iterator<String> it = dict.iterator();
		Set<String> ret = new HashSet<String>();
		while(it.hasNext()){
			String cur = it.next();
			if(dist.minDistance(cur, target)<=1){
				ret.add(cur);
			}
		}
		return ret;
	}
}
