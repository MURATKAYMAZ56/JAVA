package binaryTreeBook;

import nl.hva.miw.datastructuren.tentamen.opdracht4.TreeNode;

class TreeNode<E> {
	protected E element;
	protected TreeNode<E> left;
	protected TreeNode<E> right;
	TreeNode<E> root;

	public TreeNode(E e) {

		element = e;

	}

//searchin element in BST
	public boolean searchElementInBST(E element) {
//TreeNode<Integer> root=new TreeNode<>(60);
		TreeNode<E> current = root;
		while (current != null) {
			if (element < current.element) {
				current = current.left;// go left

			} else if (current > current.element) {
				current = current.right; // go right

			} else
				return true;

		}
		return false;

	}

	// inserting an element inti BST
	public boolean insert(E element) {

		if (root == null) {
			root = new TreeNode<>(element);

		}else  {
			TreeNode<E> node= root;
			TreeNode<E> parent= null;
			
			
			
		}
		return true;

	}

	public static void main(String[] args) {
		// create the root node
		TreeNode<Integer> root = new TreeNode<>(60);
		// create left child
		root.left = new TreeNode<Integer>(55);
		root.right = new TreeNode<>(100);

	}
}
