package model;

public class Room {
	private int roomNumber;
	private String roomCategory;
	private int maxPersons;
	private double price;
	
	public Room(int roomNumber, String roomCategorie, int maxPersons, double price) {
		super();
		this.roomNumber = roomNumber;
		this.roomCategory = roomCategorie;
		this.maxPersons = maxPersons;
		this.price = price;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomCategorie() {
		return roomCategory;
	}

	public void setRoomCategorie(String roomCategorie) {
		this.roomCategory = roomCategorie;
	}

	public int getMaxPersons() {
		return maxPersons;
	}

	public void setMaxPersons(int maxPersons) {
		this.maxPersons = maxPersons;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return String.format("[%d, %s, %d, %2f]", this.roomNumber, this.roomCategory, this.maxPersons, this.price) ;
		
	}
	
}
