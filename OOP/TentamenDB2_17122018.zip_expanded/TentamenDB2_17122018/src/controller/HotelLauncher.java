package controller;

import java.util.List;

import javadb.DBaccess;
import javadb.RoomDAO;
import model.Official;
import model.Room;


public class HotelLauncher {

	private DBaccess db;
	private RoomDAO rdao;

	public HotelLauncher() {
		super();
		db = new DBaccess();
		rdao = new RoomDAO(db);
	}
	
	public static void main(String[] args) {
		HotelLauncher myself = new HotelLauncher();
		myself.run();
	}
	
	private void run() {
		
		try {
			db.openConnection();
			System.out.println("Connection open");
		} 
		catch (Exception e) {
			System.out.println("\nEr is iets fout gegaan\n");
			e.printStackTrace();
		}
		Room room9= new Room(9,"Basic",3,129.50);
		rdao.storeRoom(room9);
	
//		Maak een Kamer object aan voor kamer 9, Basic, 3 persoons, 129.50 en sla die op.
		
		
//		Haal alle 2 persoons kamers uit de database en print hun gegevens.
		
		List<Room> maxaantal = rdao.getRoomByNumberOfPersons(2);
		for (Room room : maxaantal)
		 System.out.println(room);

		
	}

}
