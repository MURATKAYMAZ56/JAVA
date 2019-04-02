package nl.hva.miw.datastructuren.tentamen.opdracht4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public Main() {
		super();
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	private void run() {
		ArrayList<Integer> values = new ArrayList<Integer>();
		for (int i=0; i<10; i++) {
			values.add(i);
		}
		Collections.shuffle(values);
		BinaryTree<Integer> tree = new BinaryTree<Integer>(values);
		tree.printTree();
		
		System.out.println();
		System.out.println("Hoogte van deze boom is " + tree.getHeight(null));
	}
}
