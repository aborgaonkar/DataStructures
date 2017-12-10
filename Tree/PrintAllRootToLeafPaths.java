package Tree;

import java.util.ArrayList;

public class PrintAllRootToLeafPaths {
	
	public static void printAllRootToLeafPaths(BinaryTreeNode root, ArrayList<Integer> path) {
		if (root == null) {
			return;
		}
		path.add(root.data);
		
		if (root.left == null && root.right == null) {
			System.out.println(path);
		}else {
			printAllRootToLeafPaths(root.left,new ArrayList<>(path));
			printAllRootToLeafPaths(root.right,new ArrayList<>(path));
		}
		
	}

	public static void main(String[] args) {
		BinaryTreeNode root = BinaryTreeNode.setUpTree();
		LevelOrderTraversal.levelOrderTraversal(root);
		System.out.println();
		ArrayList<Integer> path = new ArrayList<>();
		printAllRootToLeafPaths(root,path);
	}
}
