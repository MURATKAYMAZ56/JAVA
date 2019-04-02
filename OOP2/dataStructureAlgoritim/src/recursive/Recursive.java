package recursive;

public class Recursive {

	public static void main(String[] args) {
		int fact = fact(4);
		System.out.println("faktoriel is : " + fact);

	}

	/////////////// faktoriel///////////
	public static int fact(int n) {
		if (n >= 1) {
			return n * fact(n - 1);
		} else
			return 1;
	}

	////////// fibonacci ///1,1,2,3,5,8,13....//// f(n)=f(n-1)+f(n-2) // n->index
	public static int fibonacci(int n) {
		if (n >= 3) {
			return fibonacci(n - 1) + fibonacci(n - 2);
		} else
			return 1;

	}

}
