package conditionals;

import java.util.Scanner;

public class ConditionalsOefenen {

	public static void main(String[] args) {
		System.out.println("Wil je de oppervlakte van een driehoek uitrekenen?\n doorgaan j/n?:");
		Scanner invoer= new Scanner(System.in);
		String decision= invoer.next();
		if(decision.equals("j")) {
			int basis= generateNumbers();
			int hoogte= generateNumbers();
			System.out.printf("Bereken de oppervlakte van\n" + 
					"een driehoek met basis = %d en hoogte = %d:",basis,hoogte);
			System.out.print("what is youw antwoord?");
			double juisteAntwoord=oppervlakteDriehook(basis,hoogte);
			double antwoord=invoer.nextDouble();
			if(antwoord!=juisteAntwoord) {
				System.out.println("Jouw antwoord is fout!\n" + 
						"Het juiste antwoord is "+juisteAntwoord);
			}else {
				System.out.println("jouw antword is goed!");
			}
			
			
			
		}else {
			System.out.println("Bye bye");};
		}
		
	static double oppervlakteDriehook(int basis,int hoogte) {
		
		double oppervlakte=(basis*hoogte)/2;
		
		return oppervlakte;
		}
	static int generateNumbers() {
		final int BOVEN_GRENS=10;
		return  (int)(Math.random()*BOVEN_GRENS)+1;
		
	}

}
