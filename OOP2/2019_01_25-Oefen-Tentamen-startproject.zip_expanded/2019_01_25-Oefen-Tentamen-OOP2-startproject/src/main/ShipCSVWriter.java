package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ShipCSVWriter implements ShipWriter {
	private File file;
	private List<Ship> shipList;

	public ShipCSVWriter(String fileName) {
		this.file = new File(fileName);
		shipList = new ArrayList<>();

	}

	@Override
	public void addShip(Ship ship) {
		shipList.add(ship);

	}

	@Override
	public void write() {
		try {
			PrintWriter pw = new PrintWriter(file);
			System.out.println("printing to the file" + file.getName());
			pw.println("Name, Construction Year, Length, Max Cargo, Cargo List");
			for (Ship ship : shipList) {
				pw.print(ship.getName());
				pw.print(ship.getConstructionYear());
				pw.print(ship.getLength());
				pw.print(ship.getMaxCargo());
				pw.print(ship.listCargo());
			}
		} catch (FileNotFoundException e) {
			System.out.println("file could not find");
			e.printStackTrace();
		}
	}

	public Ship getLongest(Ship ship) {
		Ship longestShip = null;
		if (shipList.size() > 0) {
			longestShip = shipList.get(0);
		}

		return getLongest(longestShip, 0);
	}

	private Ship getLongest(Ship longestShip, int index) {
		if (index >= shipList.size()) {
			return longestShip;
		}
		Ship currentShip = shipList.get(index);

		if (currentShip.getLength() > longestShip.getLength()) {
			longestShip = currentShip;
		}
		System.out.println("index" + index + ", length  " + longestShip.getLength());
		return getLongest(longestShip, ++index);

	}

}
