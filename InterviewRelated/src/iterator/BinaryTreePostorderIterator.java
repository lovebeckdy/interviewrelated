package iterator;
import leetcode.*;
import java.util.*;

public class BinaryTreePostorderIterator {
	private TreeNode next, pre;
	private Stack<TreeNode> s;
	
	public BinaryTreePostorderIterator(TreeNode root){
		next = root;
		pre = null;
		if(next==null) return;
		s = new Stack<TreeNode>();
		s.push(next);
	}
	
	public boolean hasNext(){
		return !s.empty();
	}
	
	public TreeNode next(){
		TreeNode ret = null;
		while(!s.empty()){
			next = s.peek();
			if(pre==null || pre.left==next || pre.right==next){
				if(next.left!=null) s.push(next.left);
				else if(next.right!=null) s.push(next.right);
				else{
					ret = s.pop();
					pre = next;
					break;
				}
			}
			else if(next.left==pre){
				if(next.right!=null) s.push(next.right);
				else{
					ret = s.pop();
					pre = next;
					break;
				}
			}
			else{
				ret = s.pop();
				pre = next;
				break;
			}
			pre = next;
		}
		return ret;		
	}
}
