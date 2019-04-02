package nl.hva.miw.oop2.cohort12.tentamen;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTest {

	@Test
	public void testCompareTo1() {
		Matrix<Integer> m1 = new Matrix<>(2);
		Matrix<Integer> m2 = new Matrix<>(3);
		
		int actual = m1.compareTo(m2);
		
		assertTrue( actual < 0 );
	}

	@Test
	public void testCompareTo2() {
		Matrix<Integer> m1 = new Matrix<>(2);
		Matrix<Integer> m2 = new Matrix<>(2);
		
		try {
			m1.addElement(0, 0, 1);
			m1.addElement(0, 1, 2);
			m1.addElement(1, 0, 3);
			m1.addElement(1, 1, 4);
			
			m2.addElement(0, 0, 1);
			m2.addElement(0, 1, 2);
			m2.addElement(1, 0, 7);
			m2.addElement(1, 1, 8);
		} catch (OngeldigeMatrixPositieException e) {
			System.out.println("Error: " + e);
		}
		
		int actual = m2.compareTo(m1);
		
		assertTrue( actual > 0 );
	}

	@Test
	public void testCompareTo3() {
		Matrix<String> m1 = new Matrix<>(2);
		Matrix<String> m2 = new Matrix<>(2);
		
		try {
			m1.addElement(0, 0, "aap");
			m1.addElement(0, 1, "noot");
			m1.addElement(1, 0, "mies");
			m1.addElement(1, 1, "boom");
			
			m2.addElement(0, 0, "aap");
			m2.addElement(0, 1, "noot");
			m2.addElement(1, 0, "mies");
			m2.addElement(1, 1, "boom");
		} catch (OngeldigeMatrixPositieException e) {
			System.out.println("Error: " + e);
		}
		int expected = 0;
		int actual = m1.compareTo(m2);
		
		assertEquals( expected, actual );
	}
	
	@Test (expected = OngeldigeMatrixPositieException.class)
	public void testException() throws OngeldigeMatrixPositieException {
		Matrix<Integer> m = new Matrix<>(2);
		
		m.getElement(3,4);
	}
}
