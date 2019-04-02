package main;

import java.io.*;
import java.util.*;

public class ShipCSVWriter implements ShipWriter {

	private static final String DELIMITER = ", ";
	private File file;
	private List<Ship> shipList;

	public ShipCSVWriter(String fileName) {
		shipList = new ArrayList<>();
		this.file = new File(fileName);
	}

	/**
	 * Adds a ship to be written to the data source
	 * 
	 * @param ship
	 */
	@Override
	public void addShip(Ship ship) {
		shipList.add(ship);
	}

	/**
	 * Writes a List of ships to a data source
	 */
	@Override
	public void write() {
		try (PrintWriter pw = new PrintWriter(file)) { // PrintWriter is buffered
			System.out.println("Printing to file: " + file.getName());
			// print header
			pw.println("Name, Construction Year, Length, Max Cargo, Cargo List");
			// print ship on every new line including cargo
			for (Ship ship : shipList) {
				//
				pw.print(ship.getName());
				pw.print(DELIMITER);
				pw.print(ship.getConstructionYear());
				pw.print(DELIMITER);
				pw.print(ship.getLength());
				pw.print(DELIMITER);
				pw.print(ship.getMaxCargo());
				pw.print(DELIMITER);
				// print the cargo list as well
				pw.print(ship.listCargo());
				pw.println();
			}

		} catch (FileNotFoundException e) {
			System.out.println("Something went wrong printing the file: ");
			e.printStackTrace();
		}

	}

	public Ship getLongest() {
		// --
		Ship longestShip = null;
		if (shipList.size() > 0)
			longestShip = shipList.get(0);
		return getLongest(longestShip, 0);
	}

	private Ship getLongest(Ship longestShip, int index) {
	
		// base case, if index reached size,
		// we are one step further then list bounds and we should stop
		if (index >= shipList.size()) {
			return longestShip;
		}
		// check passed in ship length with ship length at current position
		Ship current = shipList.get(index);
		if (current.getLength() > longestShip.getLength()) {
			longestShip = current;
		}
		
		System.out.println("index: " + index + ", length:  " + longestShip.getLength());

		return getLongest(longestShip, ++index);
	}

}
