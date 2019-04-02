package factorial;

public class FactorialClass {
	int fac = 1;

	public int factorial(int value) {
		if (value == 1 || value == 0) {
			return 1;
		}
		return value * factorial(value - 1);
	}

	public int factorialWithLoop(int value) {
		if (value != 0) {
			while (value > 1) {
				fac = fac * value;
				value = value - 1;

			}
			return fac;

		} else {
			return fac;
		}

	}

	// another way
	public int facWithForLoop(int n) {
		for (; n > 0; n--) {
			fac *= n;

		}
		return 0;
	}

	public int exponent(int base, int power) {
		if(power==0) {
			return 1;
		}
			return base * exponent(base, power - 1);
		}
	
	public  long fibonacci(long value) {
		if(value==0||value==1) {
			return value;
		}
		return fibonacci(value-1)+fibonacci(value-2);
	}

	
		
	}

	/*
	 * while
	 */


