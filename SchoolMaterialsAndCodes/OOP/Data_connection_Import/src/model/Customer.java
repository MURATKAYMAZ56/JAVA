package model;

public class Customer {

	private int customerId;
	private String customerName;
	private String city;

	public Customer(String customerName, String city) {
		super();
		this.customerName = customerName;
		this.city = city;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCity() {
		return city;
	}
	

}
