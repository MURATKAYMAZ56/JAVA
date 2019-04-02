package factorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void test() {
//		Arrange
		int value=6;
		int expected=720;
		FactorialClass f= new FactorialClass();
		
//		Activate
		int actual= f.factorial(value);
		
		
		
		
//		Assert
		assertEquals(expected, actual);
		
	}
	@Test
	public void TestLoop() {
		int value=6;
		int expected=720;
		FactorialClass f= new FactorialClass();
		int actualB=f.factorialWithLoop(value);
		assertEquals(expected, actualB);
	}
	@Test
	public void exponentTestBase2Power3() {
		FactorialClass f= new FactorialClass();
		int base= 2;
		int  power=3;
		int expected=8;
		int actual = f.exponent(base,power);
		assertEquals(expected, actual);
	}
	@Test
	public void exponentTestBase2Power0() {
		FactorialClass f= new FactorialClass();
		int base= 2;
		int  power=0;
		int expected=1;
		int actual = f.exponent(base,power);
		assertEquals(expected, actual);
	}
	@Test
	public void exponentTestBase0Power3() {
		FactorialClass f= new FactorialClass();
		int base= 0;
		int  power=3;
		int expected=0;
		int actual = f.exponent(base,power);
		assertEquals(expected, actual);
	}
	//@Test
//	public void exponentTestBase0Power0() {
//		FactorialClass f= new FactorialClass();
//		int base= 0;
//		int  power=0;
//		int expected=0;
//		int actual = f.exponent(base,power);
//		assertEquals(expected, actual);
//	}
//	
	@Test
	public void fibonacciTest() {
		FactorialClass f= new FactorialClass();
		long value=6;
		long expected=8;
		long actual= f.fibonacci(value);
		assertEquals(expected, actual);
		
		
	}

}
