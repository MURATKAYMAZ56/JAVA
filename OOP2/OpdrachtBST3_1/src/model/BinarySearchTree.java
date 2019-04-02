package model;

public class BinarySearchTree {
	/*
	 * +search(int v): boolean +searchRecursive(int v): boolean +insert(int v):
	 * boolean +insertRecursive(int v): void +toString():
	 * -postorderTraversalString(Node node): String
	 */

	private Node root;
	protected int size = 0;

	@Override
	public String toString() {
		return "BinarySearchTree: " + postorderTraversalString(root);
	}

	private String postorderTraversalString(Node node) {
		if (node == null)
			return "";
		return postorderTraversalString(node.left) + postorderTraversalString(node.right) + node.value;
	}

	public boolean insert(int value) {
		if (root == null)
			root= new Node(value);
			 // Create a new root
		else {
			// Locate the parent node
			Node parent = null;
			Node current = root;
			while (current != null)
				if (Integer.valueOf(value).compareTo(current.value) < 0) {
					parent = current;
					current = current.left;
				} else if (Integer.valueOf(value).compareTo(current.value) > 0) {
					parent = current;
					current = current.right;
				} else
					return false; // Duplicate node not inserted
			// Create the new node and attach it to the parent node
			if (Integer.valueOf(value).compareTo(parent.value) < 0)
				parent.left = new Node(value);
			else
				parent.right = new Node(value);
		}

		size++;
		return true; // Element inserted successfully
	}
}
