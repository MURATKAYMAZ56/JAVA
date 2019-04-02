package main;

import java.util.Comparator;

import model.Student;

public class NumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getStudentID().compareTo(o2.getStudentID());
	}

}
