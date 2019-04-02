package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShipTest {

	private Ship ship;

	@Before
	public void setUp() {
		// Arrange max load is 3 containers
		ship = new Ship("", 0, 0, 3); // ship attributes other than maxCargo are irrelevant
	}

	@After
	public void tearDown() {
		ship = null;
	}

	@Test
	public void loadMaxNotReached() {
		ship.load(new Container("Bananen"));
		// count should be at 1

		assertEquals(1, ship.containerCount());
	}

	@Test
	public void loadMaxReached() {
		// Arrange max load is 3 containers
		ship.load(new Container("Bananen"));
		ship.load(new Container("Bananen"));
		ship.load(new Container("Bananen"));
		ship.load(new Container("Bananen")); // shouldn't be added
		// count should be at 3, not 4

		assertEquals(3, ship.containerCount());
	}

}
