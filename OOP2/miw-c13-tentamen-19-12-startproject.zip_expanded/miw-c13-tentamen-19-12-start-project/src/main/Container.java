package main;

import java.util.*;

/**
 * Represents a container intended to be loaded with
 * products
 *
 */
public class Container<T> {
	
	// String representation of the container content
	private T content; 
	// List that containts the products
	private List products;
	
	public Container(T content) {
		this.content = content;
		products = new ArrayList();
	}
	
//	public <T> toString() {
//		return content;
//	}
//	
	public void addProduct(Object object) {
		products.add(object);
	}
	
}
