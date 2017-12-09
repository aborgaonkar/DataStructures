package Tree;

import java.util.LinkedList;
import java.util.Queue;


public class FindHeightOfBTIteratively {

	public static int heightOfBT(BinaryTreeNode root) {
		
		if (root == null) {
			return 0;
		}
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.offer(root);
		queue.offer(null);
		int height = 0;
		while (!queue.isEmpty()) {
			root = queue.poll();
			if (root == null) {
				if (!queue.isEmpty()) {
					queue.offer(null);
				}
				height++;
			}else {
				if (root.left != null) {
					queue.offer(root.left);
				}
				if (root.right != null) {
					queue.offer(root.right);
				}
			}
		}
		return height;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode root = BinaryTreeNode.setUpTree();
		LevelOrderTraversal.levelOrderTraversal(root);
		System.out.println();
		int height = heightOfBT(root);
		System.out.println("Height of BT: "+height);
	}
}
