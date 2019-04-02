package geometry;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RechthoekTestTest {
	private Rechthoek deTestrecthoek;

	@Before // before each test
	public void setup() {
		deTestrecthoek = new Rechthoek(3, 5);
	}

	@BeforeClass // before all class just not before each test

	@AfterClass // not after each test

	@After // after each test
	public void cleanup() {
		deTestrecthoek = null;
	}

	@Test
	public void omtrekPoaitiveDimensions() {

		Rechthoek r = new Rechthoek(3, 5);

		int expected = 16;
		int actual = r.omtrekt();

		assertEquals(expected, actual);

	}

	@Test
	public void oppervlakte() {
		Rechthoek r = new Rechthoek(3, 5);
		Rechthoek r2 = new Rechthoek(3, 5);
		double expected = 15;
		double actual = r.oppervlakte();
		assertEquals(expected, actual, 0.001);
		int verleng = 4;

		r2.verleng(verleng);
		double expected2 = 35;
		double actual2 = r.oppervlakte();
		assertEquals(expected2, actual2, 0.001);
	}

	@Test
	public void verlengDimension() {
		int verleng = 3;
		// Punt p = new Punt(2, 4);
		Rechthoek r = new Rechthoek(3, 5);
		int expected = 6;
		r.verleng(verleng);
		assertEquals(expected, r.getLengte());

	}
	// @Test
//	public void verBreed() {
//		int verBreed=3;
//		//Punt p = new Punt(2, 4);
//		Rechthoek r = new Rechthoek(3, 5);
//	int expected = 8;
//		int actual = r.verBreed(verBreed);
//		assertEquals(expected, actual);
//		
//		
//	}

}
