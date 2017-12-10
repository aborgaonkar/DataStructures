package Tree;

public class LowestCommonAncestorInBT {

	public static BinaryTreeNode lca(BinaryTreeNode root, BinaryTreeNode n1, BinaryTreeNode n2) {
		
		if (root == null) {
			return null;
		}
		
		if (root == n1 || root == n2) {
			return root;
		}
		
		BinaryTreeNode left = lca(root.left, n1, n2);
		BinaryTreeNode right = lca(root.right, n1, n2);
		
		if (left != null && right != null) {
			return root;
		}
		
		if (left == null && right == null) {
			return null;
		}
		
		return left != null ? left : right;
	}
	
	public static void main(String[] args) {
//		BinaryTreeNode root = BinaryTreeNode.setUpTree();
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
		BinaryTreeNode n1 = current;
		current.setRight(new BinaryTreeNode(21));
		current = current.right;
		current.setRight(new BinaryTreeNode(19));
		current = current.right;
		BinaryTreeNode n2 = current;
		LevelOrderTraversal.levelOrderTraversal(root);
		System.out.println();
		BinaryTreeNode lca = lca(root, n1, n2);
		System.out.println("LCA is: "+lca.data);
	}
}
