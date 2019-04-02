package nl.hva.miw.datastructures.opdracht14;

import java.util.Arrays;

import nl.hva.miw.datastructures.opdracht12.ExperimentalNumberList;

public class Opdracht14Launcher {

	private void run() {
		int size = 10000;
		
		for ( int i=0; i < 5; i++ ) {
			doTest(size);
			
			size *= 2;
		}
	}
	
	private void doTest(int size) {
		ExperimentalNumberList l = new ExperimentalNumberList(size);
		l.generateNumbers(-1000000, 1000000);
		
		System.out.println("-----SIZE " + size + " -----");
		Stopwatch sw = new Stopwatch();
		sw.start();
		System.out.print("CountPositives " + l.countPositives() );
		sw.stop();
		System.out.println(" time " + sw.getTime());

		sw.start();
		System.out.print("Sum positives " + l.sumPositives() );
		sw.stop();
		System.out.println(" time " + sw.getTime());

		sw.start();
		System.out.print("Find max " + l.maxValue() );
		sw.stop();
		System.out.println(" time " + sw.getTime());

		sw.start();
		System.out.print("Nr of different " + l.numberOfDifferentValues() );
		sw.stop();
		System.out.println(" time " + sw.getTime());

		sw.start();
		System.out.print("FindLocalMax " + Arrays.toString(l.locationOfLocalMaximum()) );
		sw.stop();
		System.out.println(" time " + sw.getTime());

		sw.start();
		System.out.print("NrOfLocalMax " + l.numberOfLocalmaximum() );
		sw.stop();
		System.out.println(" time " + sw.getTime());
		
		
		System.out.println("-----END SIZE " + size + " -----\n\n\n");
	}

	public static void main(String[] args) {
		new Opdracht14Launcher().run();
	}


}
