package model;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BagSaver {

	public static void main(String[] args) {

		System.out.println(" ");
		Bag<String> myBag = new Bag<String>();
		myBag.add("Knife");
		myBag.add("Gun");
		myBag.add("Rope");
		myBag.add("Club");
		System.out.println(myBag);
		
		// write object to file
		FileOutputStream dataFile = null;
		try {
			dataFile = new FileOutputStream("src/model/bag.dat",true);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		try {
			ObjectOutputStream output = new ObjectOutputStream(dataFile);
			output.writeObject(myBag);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		// read object from file
		FileInputStream inputFile = null;
		try {
			inputFile = new FileInputStream("src/bag.dat");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		try {
			ObjectInputStream input = new ObjectInputStream( inputFile);
			//Bag<String> theBagFromFile = (Bag<String>)(input.readObject());
			Bag<?> theBagFromFile = (Bag<?>)input.readObject();
			System.out.println(theBagFromFile);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
				
	}

}

