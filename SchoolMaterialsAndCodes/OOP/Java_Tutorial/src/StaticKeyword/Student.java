package StaticKeyword;

public class Student {
	String name;
	int age;
	static int numberOfStudent=0;
	Student(){
		numberOfStudent++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//static Method
	public static int getNUmberOfStudent() {
		return numberOfStudent;
	}

}
