package main;

public interface ShipWriter {

	/**
	 * Adds a ship to be written to teh datasource
	 * @param ship
	 */
	void addShip(Ship ship);

	/**
	 * Writes a List of ships to a datasource
	 */
	void write();

}