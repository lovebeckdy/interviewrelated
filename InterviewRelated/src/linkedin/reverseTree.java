/*
Given a binary tree where all the right nodes are leaf nodes, flip it 
upside down and turn it into a tree with left leaf nodes.
*
* for example, turn these:
*
*        1                1
*       /               / 
*      2   3            2   3
*     / 
*    4   5
*   / 
*  6   7
*
* into these:
*
*        1               1
*       /               /
*      2---3           2---3
*     /
*    4---5
*   /
*  6---7
*
* where 6 is the new root node for the left tree, and 2 for the right tree.
* oriented correctly:
*
*     6                  2
*    /                 / 
*   7   4              3   1
*      / 
*     5   2
*        / 
*       3   1
*/



package linkedin;
import leetcode.*;

public class reverseTree {
	public static TreeNode reverse(TreeNode root){
		if(root==null || (root.left==null && root.right==null)) return root;
		TreeNode cur = root, left = root.left, right = root.right;
		while(left!=null && right!=null){
			TreeNode tmp1 = left.left, tmp2 = left.right;
			left.left = right;
			left.right = cur;
			if(cur.left==left) cur.left = null;
			if(cur.right==right) cur.right = null;
			cur = left;
			left = tmp1;
			right = tmp2;
		}
		return cur;
	}
	
	public static void main(String[] argv){
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		TreeNode reversed1 = reverse(root1);
		TreeNode s1 = new TreeNode(2);
		s1.left = new TreeNode(3);
		s1.right = new TreeNode(1);
		SameTree test = new SameTree();
		System.out.println(test.isSameTree(reversed1, s1));
		
		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		root2.left.left = new TreeNode(4);
		root2.left.right = new TreeNode(5);
		root2.left.left.left = new TreeNode(6);
		root2.left.left.right = new TreeNode(7);
		TreeNode reversed2 = reverse(root2);
		TreeNode s2 = new TreeNode(6);
		s2.left = new TreeNode(7);
		s2.right = new TreeNode(4);
		s2.right.left = new TreeNode(5);
		s2.right.right = new TreeNode(2);
		s2.right.right.left = new TreeNode(3);
		s2.right.right.right = new TreeNode(1);
		System.out.println(test.isSameTree(reversed2, s2));
		
	}
}
