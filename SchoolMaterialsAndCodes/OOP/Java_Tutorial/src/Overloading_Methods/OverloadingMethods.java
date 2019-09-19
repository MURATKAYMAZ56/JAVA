package Overloading_Methods;

public class OverloadingMethods {
// watch out that you write method out of the main 
	// you do call method in the main
	public static void main(String[] args) {
		// it is about different method but with the same name
		System.out.println(Add(1, 2));
		// java will now this is int and which method to go and so on
		System.out.println(Add(2.3, 2.4));
		System.out.println(Add("Murat", "K"));
	}

	public static int Add(int a, int b) {
		return (a + b);
	}

	public static double Add(double a, double b) {
		return (a + b);
	}

	public static String Add(String a, String b) {
		return (a + b);
	}

}
