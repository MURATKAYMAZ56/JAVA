package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShipCSVWriterTest {

	@Test
	public void getLongest() {
		Ship ship1 = new Ship("Amsterdam", 1996, 100, 20);
		Ship ship2 = new Ship("HMS Dinges", 2000, 500, 12);
		Ship ship3 = new Ship("HMS Dinges", 1600, 90, 12);
		
		ShipCSVWriter writer = new ShipCSVWriter("ships.txt");
		
		writer.addShip(ship1);
		writer.addShip(ship2);
		writer.addShip(ship3);
		
		System.out.println(writer.getLongest().getName());
		assertEquals(ship2, writer.getLongest());
	}
	
	@Test
	public void getLongestNoList() {
		
		ShipCSVWriter writer = new ShipCSVWriter("ships.txt");

		assertNull(writer.getLongest());
	}

}
