package scracth;

public class Student implements Comparable<Student> {
	 int number;
	 String name;
	 int age;

	public Student(int number, String name, int age) {
		this.number = number;
		this.name = name;
		this.age = age;

	}

	@Override
	public int compareTo(Student st) {
		if (age == st.age) {
			return 0;
		} else if (age > st.age) {
			return 1;
		} else
			return -1;
	}
	
	
	public String toString() {
		 
		return String.format("%s %d %d ",this.name,this.age,this.number);
		
	}

}
