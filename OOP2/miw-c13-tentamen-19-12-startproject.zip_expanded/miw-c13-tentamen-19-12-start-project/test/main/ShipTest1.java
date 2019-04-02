package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShipTest1 {
	/*
	 * Make at least two useful unit tests for the load method. Think carefully
	 * about the most important situations. The Ship class has a containerCount
	 * method that you can use with it to test. Use a method to initialize a Ship
	 * object for each test. Use a method to clean up this Ship object after each
	 * test. Also remember to separate the production and test code.
	 */
	@Test
	public void test() {
		Ship ship= new Ship("KaraMurat",2018,12,4);
		
		ship.load();
		

	}

}
