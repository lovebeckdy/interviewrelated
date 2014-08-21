package iterator;

import java.util.*;

public class iteratorBasic {
	public static void main(String[] argv) {
		// iterator
		Set<String> strs = new HashSet<String>();
		strs.add("ace");
		strs.add("bark");
		strs.add("choose");
		strs.add("dog");
		strs.add("echo");
		Iterator<String> itr = strs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}

		itr = strs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		// listiterator
		List<String> strs1 = new ArrayList<String>();
		strs1.add("ace");
		strs1.add("bark");
		strs1.add("choose");
		strs1.add("dog");
		strs1.add("echo");
		ListIterator<String> it = strs1.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
			if(it.hasNext()){
				System.out.println(it.next());
				System.out.println(it.previous());
			}
		}
		
	}

}
