package binaryTree;

public class BinaryTree {
//Then, let’s add the starting node of our tree, usually called root:
	Node root;
public static void main(String[] args) {
	
}
	private BinaryTree createBinaryTree() {
		BinaryTree bt = new BinaryTree();

		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);

		return bt;
	}

	private Node addRecursive(Node current, int value) {

		if (current == null) {
			return new Node(value);
		}
		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		}
		if (value > current.value) {
			current.right = addRecursive(current.right, value);
		}
		return current;

	}

	public void add(int value) {
		root = addRecursive(root, value);
	}

	private boolean containsNodeRecursive(Node current, int value) {
		if (current == null) {
			return false;
		}
		if (value == current.value) {
			return true;
		}
		return value < current.value ? containsNodeRecursive(current.left, value)
				: containsNodeRecursive(current.right, value);
	}

	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value);
	}

}
