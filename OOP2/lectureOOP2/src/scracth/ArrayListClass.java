package scracth;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
	// private Point pointList;

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Mercedes");
		cars.add("BMW");
		cars.add("FORD");

		ArrayList<Integer> intSet = new ArrayList<>();
		intSet.add(5);
		intSet.add(2);
		intSet.add(6);

		ArrayList<Double> doubleSet = new ArrayList<>();
		doubleSet.add(1.5);
		doubleSet.add(2.5);
		doubleSet.add(3.5);
		
		ArrayList<Student> student= new ArrayList<Student>();
		student.add(new Student(1,"Murat",29));
		student.add(new Student(2,"Witho",39));
		student.add(new Student(3,"Arend",35));
		

		Collections.sort(cars);
		System.out.printf(" Cars After sorting with Collections.sort(): \n " + cars + "\n");
		Collections.sort(intSet);
		System.out.printf("intSet After sorting with Collections.sort(): \n " + intSet+"\n");

		Collections.sort(doubleSet);
		System.out.printf(" doubleSet After sorting with Collections.sort(): \n " + doubleSet + "\n");
		
//		System.out.println(" student before sort"+student+"\n");
//		Collections.sort(student);
//		System.out.printf(" student After sorting with Collections.sort(): \n " + student + "\n");
		Collections.sort(student);  
		
		for(Student st:student){  
		System.out.println(st.number+" "+st.name+" "+st.age);  
		} 
		
		//same with printing toString()
		//System.out.println(student.toString());
		System.out.println("withString to compare \n"+student.toString());
		


	}
	


}
