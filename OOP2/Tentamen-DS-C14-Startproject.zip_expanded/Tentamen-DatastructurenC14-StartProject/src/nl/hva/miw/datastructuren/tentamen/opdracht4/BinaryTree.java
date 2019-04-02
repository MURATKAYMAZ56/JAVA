package nl.hva.miw.datastructuren.tentamen.opdracht4;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> {
	
	TreeNode<T> root;
	
	public BinaryTree() {
		super();
		root = null;
	}
	
	public BinaryTree(ArrayList<T> values) {
		super();
		for (T val: values) {
			insert(val);
		}
	}
	
	public void insert(T value) {
		if ( root == null ) {
			root = new TreeNode<T>(value);
		} else {
			TreeNode<T> node = root;
			TreeNode<T> parent = null;
			while ( node != null && node.getValue().compareTo(value) != 0 ) {
				parent = node;
				node = (value.compareTo(node.getValue()) < 0 ? node.getLeft() : node.getRight());
			}
			if ( parent != null && value.compareTo(parent.getValue()) < 0 ) {
				parent.setLeft(new TreeNode<T>(value));
			} else if ( parent != null && value.compareTo(parent.getValue()) > 0 ) {
				parent.setRight(new TreeNode<T>(value));
			}
		}
	}
	
	private void printTree(TreeNode<T> node, int indent) {
		if ( node != null ) {
			printTree(node.getRight(), indent+1);
			for (int i=0; i<indent; i++) {
				System.out.print("\t");
			}
			System.out.println(node.getValue());
			printTree(node.getLeft(), indent+1);
		} else {
			for (int i=0; i<indent; i++) {
				System.out.print("\t");
			}
			System.out.println("*");
		}
	}
	
	public void printTree() {
		printTree(root, 0);
	}

	/**
	 * Returns the height of the tree.
	 * @return
	 */
	public int getHeight( TreeNode<T> root) {
		// Implement this code here...
		''
	        if (root == null) {
	          return 0;
	        }
	        return Math.max(getHeight(root.getLeft()), getHeight(root.getRight())) + 1;
	    
		
	}
}