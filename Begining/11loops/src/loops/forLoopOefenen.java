package loops;

import java.util.Scanner;

public class forLoopOefenen {

	public static void main(String[] args) {
		
		Scanner invoer = new Scanner(System.in);
		System.out.print("Welke tafel wilt u printen?");
		int requiredTafel = invoer.nextInt();
		System.out.print("\nHoeveel getallen wilt u printen?");

		int howManyTafel = invoer.nextInt();
		generateTafel(requiredTafel, howManyTafel);
	}

	private static void generateTafel(int requiredTafel, int howManyTafel) {
		
		for(int i=1;i<=howManyTafel;i++) {
			
			int tafel=i*requiredTafel;
			System.out.print("  "+tafel);
			if((i % requiredTafel)==0) {
				System.out.println( "\n");
			}
			
			
		}

	}

}
