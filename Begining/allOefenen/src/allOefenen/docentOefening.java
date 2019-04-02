
import java.util.Random;
import java.util.Scanner;

/**
 * Testen met willekeurige getallen
 *
 * @author p.j.van.diepen@hva.nl
 *
 */

public class docentOefening {

	public static void main(String[] args) {
		// 10 x gooien met dobbelsteen
		int[] worpen = willekeurigeGetallen(10,6);
		getallenAfdrukken(worpen);
		
		/**
		 * test met vraag aantalGetallen en hoogsteGetal
		 * stop indien 0
		 */
		Scanner invoer = new Scanner(System.in);
		int aantalGetallen = 1;
		int hoogsteGetal;
		while (aantalGetallen > 0) {
			System.out.print("\nHoeveel getallen? (0=stop) ");
			aantalGetallen = invoer.nextInt();
			if (aantalGetallen > 0) {
				System.out.print("Hoogste getal? ");
				hoogsteGetal = invoer.nextInt();
				System.out.println();
				getallenAfdrukken(willekeurigeGetallen(aantalGetallen, hoogsteGetal));
			}	
		}
	}

	public static int[] willekeurigeGetallen(int aantal, int max) {
		int[] getallen = new int[aantal];
		Random willekeur = new Random();
		for (int i = 0; i < aantal; i++) {
			getallen[i] = willekeur.nextInt(max) + 1;
		}
		return getallen;
	}
	
	public static void getallenAfdrukken(int[] getallen) {
		for (int i = 0; i < getallen.length; i++) {
			System.out.printf(" %d", getallen[i]);
		}
		System.out.println();
	}
	
}
