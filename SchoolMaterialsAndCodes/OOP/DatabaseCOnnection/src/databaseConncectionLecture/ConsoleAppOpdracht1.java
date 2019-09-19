package databaseConncectionLecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConsoleAppOpdracht1 {
	public static void main(String[] args) throws SQLException {
		Scanner invoer = new Scanner(System.in);
		String inputString = "";
		do {
			// 1-invoer: vornaam,achternaam:Sanner
			// 2-Persoon p= new Persoon(naam,voornaam)
			// 3-SQL: INSERT INTO Persoon(naam,voornaam);
			// PS insert (? ?)=>p.getNaam(),p.getVoorNaam()
			// 4-Lijst Ophalen
			// while:SQL:SELECT * Persoon
			// Persoon pDB= new Persoon (rs.getString("naam"),rs.getString("achternaam"))
			// 5-list.add(pDB);

			// vrag om SQL
			System.out.println("write SQL code then press ENTER or press q to QUIT");
			inputString = invoer.nextLine();
			// print personen
			if (!inputString.equals("g")) {

				// Driver nodig
				// connectionn maken
				Connection connection = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/Werknemer?useSSL=false", "root", "mk");
				// Sql create
				Statement statement = connection.createStatement();
				// insert
//				statement.executeUpdate("insert INTO Afdeling(anr,anaam,locatie) values( 54,'Blablabla','lasVegas')",Statement.RETURN_GENERATED_KEYS);
//				ResultSet idRS=statement.getGeneratedKeys();
//				idRS.next();
				// reading data
				statement.execute(inputString);
				ResultSet rs = statement.getResultSet();

				while (rs.next()) {
					System.out.println(rs.getString(2));
				}
				// close connection
				rs.close();
				statement.close();
				connection.close();

			}

		} while (!inputString.equals("q"));

	}

}
