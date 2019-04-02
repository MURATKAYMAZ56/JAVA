package main;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestKleadingLade {

	private static KledingLade kledingLade;
	private static Kleding kleding1, kleding2, kleding3;
	
	@BeforeClass
	public static void setup() {
		kledingLade = new KledingLade("Test", 3);

		kleding1 = new Kleding("type 1", "name 1", 12);
		kleding2 = new Kleding("type 2", "name 21", 10);
		kleding3 = new Kleding("type 3", "name 31", 8);
	}
	
	@Test
	public void checkAdd() {
		
		kledingLade.legKledingInLade(kleding1);
		kledingLade.legKledingInLade(kleding2);
		kledingLade.legKledingInLade(kleding3);
		
		assertEquals(3, kledingLade.aantalKledingStukken());
	}
	
	@Test
	public void checkTotalWeight() {
		
		kledingLade.legKledingInLade(kleding1);
		kledingLade.legKledingInLade(kleding2);
		kledingLade.legKledingInLade(kleding3);
		
		double total = kleding1.getGewicht() + kleding2.getGewicht() + kleding3.getGewicht();

		assertEquals(total, kledingLade.getTotaalGewicht(), 0);
	}

}
