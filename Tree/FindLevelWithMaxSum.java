package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class FindLevelWithMaxSum {

	public static int levelWithMaxSum(BinaryTreeNode root){
				
		if(root == null) {
			return 0;
		}
		
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		
		queue.offer(root);
		queue.offer(null);
		int maxSum = 0;
		
		int localSum = 0;
		
		while (!queue.isEmpty()) {
			root = queue.poll();
			if (root == null) {
				if (!queue.isEmpty()) {
					queue.offer(null);
				}
				if(localSum > maxSum) {
					maxSum = localSum;
				}
				
				localSum = 0;
				
			}else {
				if (root.left != null) {
					queue.offer(root.left);
				}
				if (root.right != null) {
					queue.offer(root.right);
				}
				localSum = localSum + root.data;
			}
			
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode root = BinaryTreeNode.setUpTree();
		LevelOrderTraversal.levelOrderTraversal(root);
		System.out.println();
		System.out.println(levelWithMaxSum(root));
	}
}
