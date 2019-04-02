package exception;

public class ExceptionLecture {

	public static void main(String[] args) {
		try {
			double result = quotient(4, 0);
			System.out.println(result+"it is fone");
		} catch (Exception e) {
			System.out.println("You should not divide a number by zero");

		}

	}

	public static double quotient(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception();
		}
		return a / b;

	}

}
