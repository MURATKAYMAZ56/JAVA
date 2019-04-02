package main;

public interface ShipWriter {

	/**
	 * Adds a ship to be written to the data source
	 * @param ship
	 */
	void addShip(Ship ship);

	/**
	 * Writes a List of ships to a data source
	 */
	void write();

}