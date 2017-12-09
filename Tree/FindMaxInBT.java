package Tree;

public class FindMaxInBT {
	
	private static int maxInBT( BinaryTreeNode root) {
		
		int max = Integer.MIN_VALUE;
		
		if (root != null) {
			
			int leftMax = maxInBT(root.left);
			int rightMax = maxInBT(root.right);
			
			if(leftMax > rightMax) {
				max = leftMax;
			}else {
				max = rightMax;
			}
			if(root.data > max) {
				max= root.data;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeNode.setUpTree();
		int maxValue = maxInBT(root);
		LevelOrderTraversal.levelOrderTraversal(root);
		System.out.println();
		System.out.println("Max value is: "+ maxValue);
	}
	
	
}
