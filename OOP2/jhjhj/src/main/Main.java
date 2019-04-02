package main;

import model.Bag;

public class Main {

	public static void main(String[] args) {
		Bag<String> myBag= new Bag<String>();
		myBag.add("phone");
		myBag.add("choclate");
		
		System.out.println(myBag.toString());

	}

}
