package nl.hva.miw.datastructures.grades;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Grades {
	
	public static final String GRADES_FILE = "grades.txt";
	
	private Map<Integer, List<Integer>> map = new HashMap<>();

	private void readfromFile( String file ) throws FileNotFoundException {
		try ( Scanner scanner = new Scanner( new File( file ))) {
			while ( scanner.hasNext() ) {
				int id = scanner.nextInt();
				int grade = scanner.nextInt();
				
				voegToe( id, grade );
			}
		}
	}

	/**
	 * Add (id, grade) to the HashMap. The Hashmap has a List<Integer> as Value,
	 * so we must add the grade to a list. But we have to create it first, if it
	 * does not exist.
	 * @param id
	 * @param grade
	 */
	private void voegToe(int id, int grade) {
		List<Integer> list = map.get( id );
		
		// If the id does not exist in the map yet, then list will be null
		if ( list == null ) {
			// First create a list and put it in the hashmap under the key id.
			list = new ArrayList<Integer>();
			map.put( id,  list);
		}

		// Add the grade to the list.
		list.add( grade );
		
		// No need to put the list in the hashmap again, the hashmap stores a reference to the list
		// and the get() method returned this reference to the list. So we are actually changing
		// the same list that is referred to by the hashmap.
	}

	private void printList() {
		for ( Map.Entry< Integer, List<Integer>> entry : map.entrySet() ) {
			int id = entry.getKey();
			List<Integer> l = entry.getValue();
				
			System.out.printf("%10d %5d %.2f\n", id, l.size(), getAverage(l));
		}
	}


	private double getAverage(List<Integer> list) {
		int sum = 0;
		for ( int grade : list ) {
			sum += grade;
		}
		
		return (double)sum / (double)list.size();
	}

	public static void main(String[] args) {
		Grades grade = new Grades();
		
		try {
			grade.readfromFile(GRADES_FILE);
			
			grade.printList();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
