package opdractScanner;

import java.util.Scanner;

public class AskNameAndBirthdate {

	public static void main(String[] args) {

		//// opdractBMI///

		System.out.print("What is your gewicht?");

		Scanner input = new Scanner(System.in);
		double gewicht = input.nextDouble();
		System.out.print("How tall are you?");
		double length = input.nextDouble() / 100;
		// System.out.println("length is"+length);

		double BMI = gewicht / (length * length);

		System.out.println("BMI: " + BMI);
		if (BMI < 18) {

			System.out.println("you are licht");
		} else if (BMI >= 18 & BMI < 25) {
			System.out.println("you are gezond");
		} else if (BMI > 25 & BMI < 30) {
			System.out.println("you are overgewicht");
		} else {
			System.out.println("you are obees");
		}

		// TODO Auto-generated method stub
		/*
		 * Scanner invoer = new Scanner(System.in); final int HUIDIG_JAAR = 2018; String
		 * name; int jarig; int leeftijd;
		 * 
		 * System.out.print("Hoe heet je? ");
		 * 
		 * name = invoer.nextLine();
		 * 
		 * System.out.print("what is je geboortejaar?");
		 * 
		 * jarig = invoer.nextInt();
		 * 
		 * leeftijd = 2018 - jarig;
		 * 
		 * if (leeftijd > 18 & leeftijd < 50) { System.out.println("Beste " + name + ","
		 * + "in " + HUIDIG_JAAR + " zal je leeftijd " + leeftijd + " zijn\n" +
		 * "you are younger than 50");
		 * 
		 * } else if (leeftijd < 18) { System.out.println("gooo roger!!!");
		 * 
		 * } else { System.out.println("Beste " + name + "," + "in " + HUIDIG_JAAR +
		 * " zal je leeftijd " + leeftijd + "zijn\n" + "You are bigger than 50:)"); }
		 */

	}

}
