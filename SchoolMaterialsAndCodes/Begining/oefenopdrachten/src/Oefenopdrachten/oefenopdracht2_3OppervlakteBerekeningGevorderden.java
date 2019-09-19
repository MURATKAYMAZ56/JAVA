package Oefenopdrachten;

import java.util.Scanner;

public class oefenopdracht2_3OppervlakteBerekeningGevorderden {

	public static void main(String[] args) {

		Scanner invoer = new Scanner(System.in);
		int toContinue = askToContinue(invoer);
		// System.out.println(toContinue);

		while (toContinue != 0 && toContinue<5) { 

			if (toContinue == 1) {
				// circle
				System.out.println("Wat is de radius in cm ?");
				int radius = invoer.nextInt();
				double circleArea = Math.PI * radius * radius;
				System.out.println(demonstrateArea(circleArea,"circle"));
				

			} else if (toContinue == 2) {
				// rechthoek
				System.out.println("Wat is de hoogte in cm ?");
				int hoogte = invoer.nextInt();
				System.out.println("Wat is de breedte in cm ?");
				int breedte = invoer.nextInt();
				double rechthoekArea = (hoogte * breedte);
				System.out.println(demonstrateArea(rechthoekArea,"rechthoek"));
				
				
				

			} else if (toContinue == 3) {
				// vierkant
				System.out.println("Wat is de zijde in cm ?");
				int zijde = invoer.nextInt();
				double rechthoekArea = (zijde * zijde);
				System.out.println(demonstrateArea(rechthoekArea,"rechthoek"));
				

			} else {
				// driehoek
				System.out.println("Wat is de hoogte in cm ?");
				int hoogte = invoer.nextInt();
				System.out.println("Wat is de basis in cm ?");
				int basis = invoer.nextInt();
				double driehoek = (hoogte * basis) / 2;
				System.out.println(demonstrateArea(driehoek,"driehoek"));
				

			}
			toContinue=askToContinue(invoer);
			
			
			
		};
System.out.println("Okey!Program is stoping...");
invoer.close();
	}

	private static int askToContinue(Scanner invoer) {

		System.out.println("Van welke figuur wil je de oppervlakte uit laten rekenen?\n"
				+ "(cirkel = 1; rechthoek = 2; vierkant = 3; driehoek = 4;\n" + "stoppen = 0):");
		int toContinue = invoer.nextInt();
		return toContinue;

	}

	static String demonstrateArea(double area, String shape) {
		String demonstration = "De oppervlakte van jouw" 
	+ shape + " is " + area + ".";

		return demonstration;

	}

}
