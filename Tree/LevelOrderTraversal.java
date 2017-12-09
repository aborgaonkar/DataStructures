package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void levelOrderTraversal(BinaryTreeNode root) {
		if(root == null) {
			return;
		}
		
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.offer(root);
		
		while (!q.isEmpty()) {
			root = q.poll();
			System.out.print(" "+root.data);
			if(root.left != null) {
				q.offer(root.left);
			}
			if(root.right != null) {
				q.offer(root.right);
			}
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(10);
		BinaryTreeNode current = root;
		current.setLeft(new BinaryTreeNode(9));
		current = current.left;
		current.setLeft(new BinaryTreeNode(11));
		current = current.left;
		current.setRight(new BinaryTreeNode(15));
		current = root;
		current.setRight(new BinaryTreeNode(-10));
		current = current.right;
		current.setLeft(new BinaryTreeNode(16));
		current = current.left;
		current.setLeft(new BinaryTreeNode(18));
		current = root.right;
		current.setRight(new BinaryTreeNode(21));
		current = current.right;
		current.setRight(new BinaryTreeNode(19));
		
		levelOrderTraversal(root);
		int sizeOfBT = BinaryTreeNode.sizeOfBT(root);
		System.out.println();
		System.out.println("Size of BT: "+sizeOfBT);
		
	}
}
