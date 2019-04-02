package nl.hva.miw.datastructuren.hertentamen.opdracht3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordLineFinder {
	

	/**
	 * Read a file with a given name.
	 * 
	 * For each word found, it will call a method processWord( word, linenr ) that
	 * will process the word.
	 * 
	 * No need to change this method, it already works.
	 * 
	 * @param inputFile
	 * @throws FileNotFoundException
	 */
	public void readFile(String inputFile) throws FileNotFoundException {
		
		int linenr = 1;   // Start at linenr 0, since we did not read any lines yet.
		Scanner scanner = new Scanner( new File( inputFile ));

		// Read the file line by line, keep track of linenumbers.
		while ( scanner.hasNextLine() ) {
			String line = scanner.nextLine();
			linenr++;  // We just read another line, increase linenr
			
//			System.out.println("Line [" + line + "]");
			
			// Get each word from the line by splitting it into words (skip anything that is not a letter or number)
			for ( String word : line.split("[^a-zA-Z0-9]+")) {
				
				// Skip empty words
				if ( word.isEmpty() ) continue;

//				System.out.println("   word [" + word + "]" + " linenr " + linenr);

				// Process the word
				processWord( word, linenr );
			}
		}
	}

	/**
	 * This method processes a word read from the file. linenr is the linenr where the word was read.
	 * 
	 * @param word
	 * @param linenr
	 */
	private void processWord(String word, int linenr) {
		// Opdracht 2b: fill in your answer.

	}


	/**
	 * This method prints an overview of the words for each word a list of linenrs where those
	 * words were found in the text.
	 * 
	 * The words are printed in alphabetical order.
	 */
	public void printOverview() {
		// Opdracht 2c: fill in your answer.

	}
}