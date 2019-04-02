package main;

import products.Laptop;

/**
 * The Sandbox area: use to experiment
 */
public class HarbourLauncher {

	public static void main(String[] args) {
		Ship ship1 = new Ship("Black Jack", 2000, 12, 3);
		Container fruit = new Container("fruit");
		fruit.addProduct("apple");
		fruit.addProduct("banana");
		ship1.load(fruit);
		ship1.load(new Container("Clothe"));
		ship1.load(new Container("Car"));
		ship1.load(new Container("Toy"));// cannot be added
		
		
		////create ship with generic class
		Ship shipGen= new Ship("White Lady",2019,24,8);
		ContainerGeneric<Laptop> laptopContainer= new ContainerGeneric<>("laptops");
		laptopContainer.addProduct(new Laptop());
		//shipGen.load(laptopContainer);//wont add ship classs is not gen

		System.out.println("ship is loaded");
		System.out.println(ship1.getName() + "loads" + ship1.listCargo());
		
		ShipCSVWriter writer= new ShipCSVWriter("ships.CSV");
		writer.addShip(ship1);

	}

}
