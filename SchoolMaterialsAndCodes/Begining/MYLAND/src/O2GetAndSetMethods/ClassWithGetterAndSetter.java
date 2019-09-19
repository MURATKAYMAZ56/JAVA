package O2GetAndSetMethods;

public class ClassWithGetterAndSetter {

	public static void main(String[] args) {
		Student Mark=new Student();
		Mark.setId(1);
		Mark.setName("Mark");
		Mark.setAge(28);
		Student Murat = new Student();
		Murat.setId(2);
		Murat.setName("Murat");
		Murat.setAge(29);
		
		System.out.println(Murat.getName()+" is declaered by getter and setter ."+ " And the id is "
		+Murat.getId()+" and age is "+Murat.getAge()+" .");
		
		
	}

}
