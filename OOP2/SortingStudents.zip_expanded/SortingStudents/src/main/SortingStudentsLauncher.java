package main;

import java.util.Arrays;

import model.GradeCompare;
import model.Sort;
import model.Student;
import util.Shuffler;

public class SortingStudentsLauncher {

	public static void main(String[] args) {
//		to do: write code to test the Student class and the sort methods in the Sort class
		Student student = new Student();
		
		 Student sts[]=student.generateStudents(1000);
		 Shuffler.shuffleArray(sts);
		 System.out.println(Arrays.toString(sts));
		 Arrays.toString(sts);
		 System.out.println(Arrays.toString(sts));
		 
		 Arrays.sort(sts);
		 System.out.println(Arrays.toString(sts));
		 
		// a. Import the Eclipse project SortingStudents. Make a list of 1000 students,
			// shake the
//			// list and print the list.
//		for (int i = 0; i < sts.length; i++) {
//		System.out.println(sts[i]);
//
//		}
		
		//b. You must be able to sort the list of students by student number 
		//and you must be able to list them
		//sort by number, but by the same number on student number. 
		//Ensure implementation of the
		//Comparable and the Comparator interfaces so that these sortings are possible.
		 Shuffler.shuffleArray(sts);
		 Sort.selectionSort(sts,new GradeCompare());
		 System.out.println(Arrays.toString(sts));

	}

}
