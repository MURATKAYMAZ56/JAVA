package controller;

import java.sql.SQLException;
import java.util.List;

import javadb.ProductDAO;
import javadb.CustomerDAO;
import javadb.DBaccess;
import model.Customer;
import model.Product;

public class Main {

	private DBaccess db;
	private ProductDAO pdao;
	private CustomerDAO cdao;
	
	public Main() {
		super();
		db = new DBaccess();
		pdao = new ProductDAO(db);
		cdao=new CustomerDAO(db);
	}

	public static void main(String[] args) {
		Main myself = new Main();
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
		

		
		
		//Product tv = new Product("A9","Sony A6300", "hoog", 1099.99, 6);
		//pdao.storeProduct(tv);
		
		
		String id = "A7";
		Product product = pdao.getProductByID(id);
		Customer customer= cdao.getCustomerByID(id);
		if (product == null) {
				System.out.println("Product with productId " + id + " does not exist");
			}
		else {
			System.out.println(product);
		}
		
		List<Product> products = pdao.getProductByTaxgroup("laag");
		for (Product p : products) {
			System.out.println(p);
		}
		
		db.closeConnection();

	}
}
