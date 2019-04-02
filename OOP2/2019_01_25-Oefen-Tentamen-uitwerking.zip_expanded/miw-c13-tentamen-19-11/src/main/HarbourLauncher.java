package main;

import products.Bananas;
import products.Laptop;

public class HarbourLauncher {

	public static void main(String[] args) {
		
		// ship 1
		//
		Ship ship1 = new Ship("HMS Dinges", 200, 50, 3);
		Container c = new Container("boxes");		
		c.addProduct("toy");
		
		ship1.load(c);
		ship1.load(new Container("bicycles"));
		ship1.load(new Container("segways"));
		ship1.load(new Container("cars")); // is not loaded
		
		System.out.println(" ");
		System.out.println(ship1.getName() + " loads " + ship1.listCargo());

		
		// ship 2
		//
		Ship ship2 = new Ship("De Rotterdam", 1996, 100, 20);
		
		GenericContainer<Laptop> laptopContainer = new GenericContainer<>("laptops");
		laptopContainer.addProduct(new Laptop());			

		//ship1.load(laptopContainer);	// this container is not loaded unto a ship
		
		ship2.load(new Container("Bananen"));
		ship2.load(new Container("Appels"));
		ship2.load(new Container("Laptops"));
		ship2.load(new Container("Auto's"));
		System.out.println(ship2.getName() + " loads " + ship2.listCargo());
//		
//		// ship 3
//		//
		Ship ship3 = new Ship("De Vliegende Hollander", 1600, 50, 12);
		System.out.println(ship3.getName() + " loads " + ship3.listCargo());
//
//		
//		// write ships to a file
		//
		System.out.println(" ");
		ShipCSVWriter writer = new ShipCSVWriter("ships.csv");
		
		writer.addShip(ship1);
		//writer.addShip(ship2);		
		writer.addShip(ship3);		
		writer.write();
//		
//		
//		// find the longest ship
//		//
		System.out.println(" ");
		Ship longestShip = writer.getLongest();
		System.out.println(" ");
		System.out.println("longest ship has cargo: " + longestShip.listCargo());
	}

}
