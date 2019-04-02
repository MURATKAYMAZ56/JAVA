package oefeningMethode;

import java.util.Scanner;

public class MoneyChange {

	public static void main(String[] args) {

		Scanner invoer = new Scanner(System.in);
		
		double dollar, pond, yen;
		double dollarKoers = 1.2345;
		double pondKoers = 0.88454;
		double yenKoers = 134.64711;
		
		System.out.print("In te wisselen bedrag (alleen gehele getallen):");
		int givenAmount = invoer.nextInt();
		dollar=exchangeMoney(givenAmount,dollarKoers);
		pond=exchangeMoney(givenAmount,pondKoers);
		yen=exchangeMoney(givenAmount,yenKoers);
		
		
		System.out.println(String.format("U krijgt hiervoor %.2f Dollar.(Koers%f)",dollar,dollarKoers));
		System.out.println(String.format("U krijgt hiervoor %.2f Pond.(Koers%f)",pond,pondKoers));
		System.out.println(String.format("U krijgt hiervoor %.2f Yen.(Koers%f)",yen,yenKoers));
	

	}

	static double exchangeMoney(int amount, double koers) {

		return amount * koers;

	}
	

	//// how I did
	
//		String Dollars = "Dollars", Pond = "Pond", Yen = "Yen";
//		print(givenAmount, dollarKoers, Dollars);
//		print(givenAmount, pondKoers, Pond);
//		print(givenAmount, yenKoers, Yen);
	
	
	

//	static void print(int givenAmount, double koers, String type) {
//
//		System.out.println("je kright here " + exchangeMoney(givenAmount, koers) + type + "(Koers )" + koers);

//
//	}

}
