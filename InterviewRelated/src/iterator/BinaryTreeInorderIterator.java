package iterator;
import leetcode.*;
import java.util.*;

public class BinaryTreeInorderIterator {
	private TreeNode next;
	private Stack<TreeNode> s;
	
	public BinaryTreeInorderIterator(TreeNode root){
		next = root;
		if(next==null) return;
		s = new Stack<TreeNode>();
		while(next!=null){
			s.push(next);
			next = next.left;
		}
		next = s.pop();
	}
	
	public boolean hasNext(){
		return next!=null;
	}
	
	public TreeNode next(){
		if(!hasNext()) return null;
		TreeNode ret = next;
		if(next.right!=null){
			next = next.right;
			while(next!=null){
				s.push(next);
				next = next.left;
			}
		}
		if(!s.empty())
			next = s.pop();
		else
			next = null;
		return ret;
	}
}
