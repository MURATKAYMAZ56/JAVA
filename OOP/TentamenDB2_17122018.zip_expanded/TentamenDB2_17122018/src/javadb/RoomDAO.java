package javadb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Official;
import model.Room;

public class RoomDAO {
	private DBaccess db;

	public RoomDAO(DBaccess db) {
		super();
		this.db = db;
	}
	
	public void storeRoom(Room  room) {
String sql = "insert into Hotel (roomNumber,roomCategorie, maxPersons,  price) "
		+ "values (?,?,?,?)";
try {
	PreparedStatement ps = db.getStatementWithKey(sql);
	ps.setInt(1, room.getRoomNumber());
	ps.setString(2, room.getRoomCategorie());
	ps.setInt(3, room.getMaxPersons());
	ps.setDouble(4, room.getPrice());
	int generatedKey = db.executeInsertPreparedStatement(ps);
	room.setRoomNumber(generatedKey);	}	
catch (SQLException e) {
	System.out.println("SQL error " + e.getMessage());}	
  	}
	
	
	public List<Room> getRoomByNumberOfPersons(int number) {
//		Deze methode haalt alle kamers van een bepaald aantal personen uit de database, bv alle 2 persoons kamers.
//		Vul deze methode aan.
//		Vervolgens maakt de methode van alle kamers een object Room en voegt die toe aan de lijst.
		
		
		String sql = "SELECT * FROM Hotel WHERE kamernr = ?;";
		List<Room> result = new ArrayList<Room>();
		try {	PreparedStatement ps = db.getStatement(sql);
		ps.setString(1, sql);
		ResultSet rs = db.executeSelectPreparedStatement(ps);
		while (rs.next()) {
			int roomNumber = rs.getInt("kamernr");
			String roomCategory = rs.getString("kamertype");
			int maxPersons = rs.getInt("maxaantal");
			double price = rs.getDouble("prijs");
			
			Room resultElement = new Room(roomNumber, roomCategory, maxPersons, price);
			result.add(resultElement);
		}
	} catch (SQLException e){
		System.out.println("SQL error " + e.getMessage());
	}
		return result;
	}
	
}
