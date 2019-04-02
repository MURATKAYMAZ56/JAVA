package Constructor;

public class Main {

	public static void main(String[] args) {
		//we create Cube object here or instance it is also called
		
		Cube cube1= new Cube();
		System.out.println("created onject by deafult values-->"+cube1.getCubeVolume());//it uses default values
		
		Cube cube2=new Cube(20,20,5);
		System.out.println("created objectby assigned values-->"+cube2.getCubeVolume());

	}

}
