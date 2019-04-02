package oefeningMethode;

import java.util.Scanner;

public class OefeneningMethode {
	public static void main(String... args) {
      /////////toonVierSterenVierkant///////
		toonSterrenVierkant();
		/////////////
		System.out.print("Welke woord wil je vijf keer zien?");
		Scanner invoer = new Scanner(System.in);
		/////////////// vijfkeer woord///////
		String str = invoer.next();
		toonWoordVijfKeer(str);
		///// Eerlijk delen////
		System.out.print("\nHoeveel euromunten wil je verdelen?");
		int inputEuro = invoer.nextInt();
		System.out.print("Met hoeveel personen?");
		int inputPersonen = invoer.nextInt();
		eerlijkDelen(inputEuro, inputPersonen);

	}

	static void toonSterrenVierkant() {
		String regel="* * * *\n* * * *\\n* * * *\\n* * * *\n";

		System.out.println(regel);
		
	}

	static void toonWoordVijfKeer(String woord) {
		System.out.print(woord);
		System.out.print(woord);
		System.out.print(woord);
		System.out.print(woord);
		System.out.print(woord);

	}

	static int eerlijkDelen(int amount, int personen) {
		int delen = amount / personen;
		int remain = amount % personen;
		System.out.println("Als je " + amount + " euromunten verdeeld over" + personen + " mensen dan krijgt ieder "
				+ delen + "\n" + "munten en blijven er" + remain + " over.");
		return delen;
	}
	
	
	

}
