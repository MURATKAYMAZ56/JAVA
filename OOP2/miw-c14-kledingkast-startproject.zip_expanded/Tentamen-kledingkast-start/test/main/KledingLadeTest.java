package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KledingLadeTest {
	KledingLade kledingLade;
	Kleding tShirt = new Kleding("tshirt", "blue", 3);
	Kleding pant = new Kleding("pant", "yellow", 1);
	Kleding cap = new Kleding("cap", "red", 4);

	@Before
	public void setUp() {
		// kledi
		kledingLade = new KledingLade("cloth", 5);
	}

	@After
	public void tearDown() {
		kledingLade = null;
	}
//this test is for to check wheter the item is added as long as max weight is not reached
	@Test
	public void gewichtMaxNotReached() {
		kledingLade.legKledingInLade(tShirt);
		kledingLade.legKledingInLade(pant);

		// 2 items should be added
		assertEquals(2, kledingLade.aantalKledingStukken());

	}

	// checks if total gewicht is more than maxGewicht;
	@Test
	public void gewichtMaxReached() {
		kledingLade.legKledingInLade(tShirt);
		kledingLade.legKledingInLade(cap);

		// only tshirt can be added, cap will not because maxGewicht is reached
		assertEquals(1, kledingLade.aantalKledingStukken());

	}

}
