package others;
import java.util.*;


public class PriorityQueueFundamentals {
	
	static public class IntComparator implements Comparator<Integer>{
		public int compare(Integer a, Integer b){
			return b-a;
		}
	}
	
	
	public static void main(String[] args){
		int[] num = {3,1,4,5,7,4,8,9,10};
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
		for(int i:num){
			minheap.offer(i);
			//System.out.println(minheap.peek());
		}
		
		while(minheap.size()!=0){
			System.out.println(minheap.poll());
		}
		
		PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(num.length, new IntComparator());
		for(int i:num)
			maxheap.offer(i);
		
		while(maxheap.size()!=0)
			System.out.println(maxheap.poll());
		
		PriorityQueue<Integer> maxheap1 = new PriorityQueue<Integer>(num.length, Collections.reverseOrder());
		for(int i:num)
			maxheap1.offer(i);
		
		while(maxheap1.size()!=0)
			System.out.println(maxheap1.poll());
	}
}
