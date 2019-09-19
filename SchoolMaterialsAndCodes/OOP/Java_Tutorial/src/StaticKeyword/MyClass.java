package StaticKeyword;

//the idea is whenebver u wanna reach static vallue of another calss use its class name but non static value u can use instance of class
/*
 * What does static key word do?
 * */
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello hello= new Hello();
	//hello.doSomethingStatic("hello class with static");//gives warnng
		Hello.doSomethingStatic("Hi ulann");
		// this willnot work since method is deeclared as a static you should call by its class name not instannce name
		hello.doSomethingWithoutStaticMethod("hello non static");
		
		
		
		
		
		//// now letsee Student Class notice how the default constructor work
		
		Student mark=new Student();
		System.out.println(mark.getNUmberOfStudent());
		Student john=new Student();
		Student Hans=new Student();
		System.out.println(Student.getNUmberOfStudent());
		
		
	}

}
