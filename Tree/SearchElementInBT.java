package Tree;

public class SearchElementInBT {
	
	public static boolean searchElementInBT(BinaryTreeNode root, int target) {
		if(root == null) {
			return false;
		}
		if(root.data == target) {
			return true;
		}
		return( searchElementInBT(root.left, target) || searchElementInBT(root.right, target));
	}
	
	public static void main(String[] args) {
		BinaryTreeNode root = BinaryTreeNode.setUpTree();
		LevelOrderTraversal.levelOrderTraversal(root);
		boolean isElementAvailable = searchElementInBT(root, 17);
		System.out.println();
		System.out.println("Is target available? "+isElementAvailable);
		
	}
}
