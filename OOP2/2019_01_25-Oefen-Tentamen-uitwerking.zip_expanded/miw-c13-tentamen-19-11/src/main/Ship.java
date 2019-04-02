package main;

import java.util.*;

import products.Laptop;

public class Ship {
	private String name;
	private int constructionYear;
	private int length; // in meters
	private int maxCargo; // in containers
	private List<Container> cargo;
	
	public Ship(String name, int constructionYear, int length, int maxCargo) {
		cargo = new ArrayList<>();
		this.constructionYear = constructionYear;
		this.name = name;
		this.length = length;
		this.maxCargo = maxCargo;
	}
	
	/**
	 * returns a String representation of the cargo in following format:
	 * []
	 * @return
	 */
	public String listCargo() {
		return cargo.toString();
	}
	
	// opgave 1
	public void load(Container container) {
		if (containerCount() <  getMaxCargo()) {
			cargo.add(container);
		}
	}
	
	public int containerCount() {
		return cargo.size();
	}

	public String getName() {
		return name;
	}

	public int getConstructionYear() {
		return constructionYear;
	}

	public int getLength() {
		return length;
	}

	public int getMaxCargo() {
		return maxCargo;
	}

}
