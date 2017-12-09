package Tree;

import java.util.LinkedList;
import java.util.Stack;

import java.util.Queue;

public class ReverseLevelOrder {
	
	public static void reverseLevelOrderTraversal(BinaryTreeNode root) {
		
		if (root == null) {
			return;
		}
		
		Stack<BinaryTreeNode> s = new Stack<>();
		Queue<BinaryTreeNode> q = new LinkedList<>();
		
		q.offer(root);
		while (!q.isEmpty()) {
			root = q.poll();
			s.push(root);
			if(root.left != null) {
				q.offer(root.left);
			}
			if(root.right != null) {
				q.offer(root.right);
			}
		}
		while(!s.isEmpty()) {
			System.out.print(" "+s.pop().data);
		}
		
	}
	
	public static void main(String[] args) {
		BinaryTreeNode root = BinaryTreeNode.setUpTree();
		LevelOrderTraversal.levelOrderTraversal(root);
		System.out.println();
		reverseLevelOrderTraversal(root);
	}
}
