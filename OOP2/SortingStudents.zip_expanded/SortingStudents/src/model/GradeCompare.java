package model;

import java.util.Comparator;

public class GradeCompare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(Double.compare(o1.getMark(), o2.getMark())==0) {
			return o1.compareTo(o2);
		}
		return Double.compare(o1.getMark(), o2.getMark()) ;
	}

}
