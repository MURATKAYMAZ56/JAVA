package main;

import java.util.*;

/**
 * Represents a container intended to be loaded with
 * products
 *
 */
public class ContainerGeneric <T> {
	
	// String representation of the container content
	private String content; 
	// List that containts the products
	private List<T> products;
	
	public ContainerGeneric(String content) {
		this.content = content;
		products = new ArrayList();
	}
	
	public String toString() {
		return content;
	}
	
	public  void  addProduct(T object) {
		products.add(object);
	}
	
}
