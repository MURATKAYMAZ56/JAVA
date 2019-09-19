package databaseConncectionLecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConsoleAppOpdrachtPS {
	public static void main(String[] args) throws SQLException {
		String voornaam;
		String achternaam;

		Scanner invoer = new Scanner(System.in);
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/ToSqlConnectionWithJava?useSSL=false", "root", "mk");
		System.out.println("To insert data write voornaam and achternam \n To quit write q");

		do {
			System.out.println("voornam: ");
			voornaam = invoer.nextLine();
			System.out.println("achternaam :");
			achternaam = invoer.nextLine();
			if (!(voornaam.equals("q") || achternaam.equals("q"))) {
				Persoon p = new Persoon(voornaam, achternaam);

				///////////////////////////////////// prepared statement
				PreparedStatement ps = connection
						.prepareStatement("INSERT INTO Persoon(voornaam,achternaam) VALUES(? ,?) ");
				// parameter install
				ps.setString(1, p.getVoornaam());
				ps.setString(2, p.getAchternaam());
				ps.executeUpdate();

			}

		} while (!(voornaam.equals("q") || achternaam.equals("q")));

		String query = "SELECT * FROM Persoon";
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {

			// print the results
			System.out.println(rs.getString("voornaam") + " " + rs.getString("achternaam"));
		}
		st.close();

		// Persoon pDB=new Persoon(rs.getString("voornaam"),rs.getString("achternaam"));
	}

}
