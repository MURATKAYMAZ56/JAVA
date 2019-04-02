package databaseConncectionLecture;

import java.sql.*;


public class Main {

	public static void main(String[] args) throws SQLException {
		// Driver nodig
		// connectionn maken
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Werknemer?useSSL=false", "root", "mk");
		// Sql create
		Statement statement = connection.createStatement();
		/////////////////////////////////////prepared statement
		PreparedStatement ps= connection.prepareStatement("select * from Werknemer where id=? and wnaam=?",Statement.RETURN_GENERATED_KEYS);
		//parameter install
		ps.setInt(1, 10);
		ps.setString(2,"Smith");
		
		/////////////////////////////////////////////////
		//insert
//		statement.executeUpdate("insert INTO Afdeling(anr,anaam,locatie) values( 54,'Blablabla','lasVegas')",Statement.RETURN_GENERATED_KEYS);
//		ResultSet idRS=statement.getGeneratedKeys();
//		idRS.next();
		
		//////////////////////////////////////
		
		
		
		//reading data
		String query="select*from Afdeling";
		ResultSet rs= ps.executeQuery(query);
		//ResultSet rs = statement.getResultSet();
		
		
		while(rs.next()) {
			System.out.println(rs.getString("locatie"));
		}
		// close connection
		rs.close();
		statement.close();
		connection.close();

	}
	

}
