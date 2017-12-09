package Tree;

public class BinaryTreeNode {
	
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	public BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	
	public BinaryTreeNode getLeft() {
		return this.left;
	}
	
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	
	public BinaryTreeNode getRight() {
		return this.right;
	}
	
	public static int sizeOfBT(BinaryTreeNode root) {
		if(root == null) {
			return 0;
		}
		int leftSize = sizeOfBT(root.left);
		int rightSize = sizeOfBT(root.right);
		
		return 1 + leftSize + rightSize;
	}
	public static BinaryTreeNode setUpTree() {
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
		current = current.right;
		return root;
	}
}
