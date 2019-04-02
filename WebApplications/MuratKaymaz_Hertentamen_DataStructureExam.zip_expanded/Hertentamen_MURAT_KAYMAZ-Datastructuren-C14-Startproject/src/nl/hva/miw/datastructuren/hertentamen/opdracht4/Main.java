package nl.hva.miw.datastructuren.hertentamen.opdracht4;

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
		BinaryIntegerTree tree = new BinaryIntegerTree(values);
		tree.printTree();
		
		System.out.println();
		System.out.println("Aantal leaves in deze boom is " + tree.countLeafNodes());

		System.out.println();
		System.out.println("Som van de waardes in deze boom is " + tree.sumAllNodes());
	}
}
