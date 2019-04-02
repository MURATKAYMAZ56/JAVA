package loops;

import java.util.Scanner;

public class oefenopdracht3_2 {

	public static void main(String[] args) {
		Scanner invoer=new Scanner(System.in);
		System.out.print("Welke karakter wil je keer gebruiken?");
		String charakter=invoer.next();
		System.out.print("Hoevaak wil je het zien?");
		int hoeVaak=invoer.nextInt();
		int i=0;
		while(i<=hoeVaak) {
			i++;
			System.out.print("  "+charakter);
			
		}

	}

}
