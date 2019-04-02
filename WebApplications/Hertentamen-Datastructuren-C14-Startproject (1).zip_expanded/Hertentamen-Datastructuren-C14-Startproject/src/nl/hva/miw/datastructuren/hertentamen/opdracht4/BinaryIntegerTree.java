package nl.hva.miw.datastructuren.hertentamen.opdracht4;

import java.util.List;

public class BinaryIntegerTree {
	
	TreeNode<Integer> root;
	
	public BinaryIntegerTree() {
		super();
		root = null;
	}
	
	public BinaryIntegerTree(List<Integer> values) {
		super();
		for (Integer val: values) {
			insert(val);
		}
	}
	
	public void insert(Integer value) {
		if ( root == null ) {
			root = new TreeNode<Integer>(value);
		} else {
			TreeNode<Integer> node = root;
			TreeNode<Integer> parent = null;
			while ( node != null && node.getValue().compareTo(value) != 0 ) {
				parent = node;
				node = (value.compareTo(node.getValue()) < 0 ? node.getLeft() : node.getRight());
			}
			if ( parent != null && value.compareTo(parent.getValue()) < 0 ) {
				parent.setLeft(new TreeNode<Integer>(value));
			} else if ( parent != null && value.compareTo(parent.getValue()) > 0 ) {
				parent.setRight(new TreeNode<Integer>(value));
			}
		}
	}
	
	private void printTree(TreeNode<Integer> node, int indent) {
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
	 * Retourneert het aantal leaf nodes in de boom
	 * 
	 * @return
	 */
	public int countLeafNodes() {
		// Opdracht 3a: implementeer deze methode
		
		return -9999;
	}


	/**
	 * 
	 * Retourneert de som van de waardes in alle nodes in de boom
	 * 
	 * @return
	 */
	public int sumAllNodes() {
		// Opdracht 3b: implementeer deze methode
		 
		 return -9999;
	}
}