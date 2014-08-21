package iterator;
import leetcode.*;
import java.util.*;

public class BinaryTreePreorderIterator {
	private TreeNode next;
	private Stack<TreeNode> s;
	
	public BinaryTreePreorderIterator(TreeNode root){
		next = root;
		s = new Stack<TreeNode>();
		if(next!=null){
			s.push(next);
		}
	}
	
	public boolean hasNext(){
		return !s.empty();
	}
	
	public TreeNode next(){
		if(!hasNext()) return null;
		next = s.pop();
		if(next.right!=null) s.push(next.right);
		if(next.left!=null) s.push(next.left);
		return next;
	}
}
