package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.GradeCompare;
import model.Sort;
import model.Student;
import util.Shuffler;

public class SortingStudentsLauncher {

	public static void main(String[] args) {
//		to do: write code to test the Student class and the sort methods in the Sort class
		Student student = new Student();
		Student[] studentenLijst = student.generateStudents(100);
		Shuffler.shuffleArray(studentenLijst);
		System.out.println(Arrays.toString(studentenLijst));
		
		Arrays.sort(studentenLijst);
		System.out.println(Arrays.toString(studentenLijst));
		
		Shuffler.shuffleArray(studentenLijst);
		Sort.selectionSort(studentenLijst, new GradeCompare());
		System.out.println(Arrays.toString(studentenLijst));
		
		Shuffler.shuffleArray(studentenLijst);
		Sort.insertionSort(studentenLijst);
		System.out.println(Arrays.toString(studentenLijst));
		
		Shuffler.shuffleArray(studentenLijst);
		Sort.insertionSort(studentenLijst, new GradeCompare());
		System.out.println(Arrays.toString(studentenLijst));

	}

}
