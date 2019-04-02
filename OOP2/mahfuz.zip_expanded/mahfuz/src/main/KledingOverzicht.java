package main;

import java.io.FileWriter;
import java.io.PrintWriter;

public class KledingOverzicht {

	public void schrijfOverzicht(KledingKast kledingKast, String bestandsNaam) {
		try {
			
			FileWriter fileWriter = new FileWriter(bestandsNaam);
		    PrintWriter printWriter = new PrintWriter(fileWriter);
		    
		    printWriter.println(kledingKast.toString());
		    
		    for(KledingLade kledingLade : kledingKast.getLadeLijst()) {
		    	printWriter.println("\t" + kledingLade.toString());

			    for(Kleding kleding : kledingLade.getKledingLijst()) {
			    	printWriter.println("\t\t" + kleding.toString());
			    }
		    }
		    
		    printWriter.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		KledingLade lade = new KledingLade("kledinglade 1", 2);
		Kleding kl1 = new Kleding("type 1", "name 1", 3);
		Kleding kl2 = new Kleding("type 2", "name 2", 3);
		lade.legKledingInLade(kl1);
		lade.legKledingInLade(kl2);
		
		KledingKast kast = new KledingKast("hello");
		kast.voegLadeToe(lade);
		
		KledingOverzicht o = new KledingOverzicht();
		o.schrijfOverzicht(kast, "testKast.txt");
		
	}
	
}
