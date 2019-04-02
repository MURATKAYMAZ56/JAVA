package nl.hva.miw.datastructuren.hertentamen.opdracht3;

import java.io.FileNotFoundException;

public class WordLineFinderLauncer {

	private static final String INPUT_FILE = "english.txt";

	public static void main(String[] args) {
		WordLineFinder wlf = new WordLineFinder();

		try {
			wlf.readFile(INPUT_FILE);

			wlf.printOverview();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


