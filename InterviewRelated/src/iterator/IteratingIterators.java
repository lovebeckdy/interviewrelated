/*
 * Given a list of iterators, print the elements in different iterators one after another
 * for example,
 * [1,2,3]  [4,5,6] [7,8] -> [1,4,7,2,5,8,3,6]
 */

package iterator;

import java.util.*;

public class IteratingIterators {
	public static List<String> robin(List<Iterator<String>> list) {
		List<String> ret = new ArrayList<String>();
		int i = 0;
		while (list.size() > 0) {
			Iterator<String> itr = list.get(i);
			if (itr.hasNext()) {
				ret.add(itr.next());
				i++;
			} else {
				list.remove(i);
			}
			if(list.size()==0) break;
			i = i%list.size();
		}
		return ret;
	}
	
	public static void main(String[] args){
		List<Iterator<String>> list = new ArrayList<Iterator<String>>();
		list.add(Arrays.asList("1","2","3").iterator());
		list.add(Arrays.asList("4","5").iterator());
		list.add(Arrays.asList("6","7","8","9").iterator());
		list.add(Arrays.asList("10").iterator());
		
		List<String> ret = IteratingIterators.robin(list);
		for(String s:ret){
			System.out.print(s);
			System.out.print(',');
		}
	}
}
