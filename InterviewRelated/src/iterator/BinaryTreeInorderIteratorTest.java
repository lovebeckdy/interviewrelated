package iterator;

import static org.junit.Assert.*;
import leetcode.TreeNode;

import org.junit.Test;

public class BinaryTreeInorderIteratorTest {

	@Test
	public void test() {
		/*
		 *       1
		 *     2  3
		 *   4  5 6  7 
		 * 
		 */
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		BinaryTreeInorderIterator test = new BinaryTreeInorderIterator(root);
		while(test.hasNext()){
			System.out.println(test.next().val);
		}
	}

}
