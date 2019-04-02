package Interface;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		Customer customer= new Customer();
		
		student.log();
		customer.log();
		
		IDatabase database1= new Student();
		IDatabase database2= new Customer();
		database1.log();
		database2.log();

	}

}
