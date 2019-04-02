package javadb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Customer;


public class CustomerDAO {

	private DBaccess db;

	public CustomerDAO(DBaccess db) {
		super();
		this.db = db;
	}

	public void storeCustomer(Customer customer) {
		String sql = "insert into Klant(klantnaam, plaats) values(?,?)";
		try {
			PreparedStatement ps = db.getStatement(sql);
			ps.setString(1, customer.getCustomerName());
			ps.setString(2, customer.getCity());
			
			db.executeUpdatePreparedStatement(ps);
		} catch (SQLException e) {
			System.out.println("SQL error " + e.getMessage());
		}
	}

	public Customer getCustomerByID(String id) {
		String sql = "Select * from Klant where artikelcode = ?";
		Customer result = null;
		try {
			PreparedStatement ps = db.getStatement(sql);
			ps.setString(1, id);
			ResultSet rs = db.executeSelectPreparedStatement(ps);
			
			while (rs.next()) {
				String customerId = rs.getString("klntnr");
				String customerName = rs.getString("klantnaam");
				String customerCity = rs.getString("plaats");
				
				result = new Customer( customerName,customerCity);
			}
		} catch (SQLException e) {
			System.out.println("SQL error " + e.getMessage());
		}
		return result;
	}

	public List<Customer> getCustomerByCity(String city) {
		String sql = "Select * from Klant where plaats = ?";
		
		List<Customer> result = new ArrayList<Customer>();
		try {
			PreparedStatement ps = db.getStatement(sql);
			ps.setString(1, city);
			ResultSet rs = db.executeSelectPreparedStatement(ps);
			
			while (rs.next()) {
				String customerCity = rs.getString("plaats");
				String customerName = rs.getString("klntnaam");
				
				Customer resultElement = new Customer(customerName, customerCity);
				result.add(resultElement);
			}
		} catch (SQLException e) {
			System.out.println("SQL error " + e.getMessage());
		}
		return result;
	}

}
