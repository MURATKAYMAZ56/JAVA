package main;

import java.util.*;

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
	/*
	 * Create the load method for the Ship class. • This method adds a Container
	 * object to the list cargo. • Only a container may be added if the maximum is
	 * not yet available reached. In the event that the maximum is reached, nothing
	 * happens.
	 */

	/**
	 * returns a String representation of the cargo in following format: [item,
	 * item, item]
	 * 
	 * @return
	 */
	
	
	public String listCargo() {
		return cargo.toString();
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

	public void load(Container item) {
		if (getMaxCargo() > containerCount()) {
			this.cargo.add(item);
		}

	}

}
