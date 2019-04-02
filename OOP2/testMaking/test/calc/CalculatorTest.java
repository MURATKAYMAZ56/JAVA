package calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void additionTwoPositiveIntegers() {
		// Arrange
		int a = 4;
		int b = 5;
		int expected = 9;
		int c = 4;
		int d = 5;
		int expectedB = 9;

		Calculator instance = new Calculator(a, b);
		Calculator instanceB = new Calculator(c, d);
		// Activate

		int result = instance.addition();
		int resultB = instanceB.addition();

		// Assert
		assertEquals(expected, result);
		assertEquals(expectedB, resultB);
	}

	@Test
	public void twoNwgativeIntegrs() {
		int a = -3;
		int b = -5;
		int expected = -8;
		Calculator instance = new Calculator(a, b);
		int actual = instance.addition();
		assertEquals(expected, actual);
	}

	@Test
	public void dividingTwoIntegers() {
		int a=10;
		int b=4;
		double expected=2.5;
		Calculator instance = new Calculator(a, b);
		double actual= instance.deel();
		assertEquals(expected, actual,0.001);
	
		
		
		
	}

}
