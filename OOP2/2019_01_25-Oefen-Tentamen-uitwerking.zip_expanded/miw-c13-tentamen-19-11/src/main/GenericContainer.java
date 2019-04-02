package main;

import java.util.*;

/**
 * Represents a container intended to be loaded with
 * products
 *
 */
public class GenericContainer<T> {
	
	// String representation of the container content
	private String content; 
	// List that contains the products
	private List<T> products;
	
	public GenericContainer(String content) {
		this.content = content;
		products = new ArrayList<>();
	}
	
	public String toString() {
		return content;
	}
	
	public void addProduct(T object) {
		this.products.add(object);
	}
	
}
