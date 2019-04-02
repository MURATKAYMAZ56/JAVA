/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package nl.hva.ict.postkantoor.main;

import java.util.ArrayList;
import java.util.Collections;

import nl.hva.ict.postkantoor.models.Brief;
import nl.hva.ict.postkantoor.models.BuitenlandPakket;
import nl.hva.ict.postkantoor.models.NAW;
import nl.hva.ict.postkantoor.models.Pakket;
import nl.hva.ict.postkantoor.models.Post;

/**
 * Main class om brieven en pakketten te testen en te sorteren.
 * 
 * @author Dennis Breuker (d.m.breuker@hva.nl)
 */
public class Postkantoor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/* TODO stap 2: haal commentaar weg
 * Einde TODO Stap 2 */
 
        ArrayList<Post> zending = new ArrayList();

        
        System.out.println("<Murat Kaymaz> OOP1 exam <500816865>");
        
/* TODO stap 2: haal commentaar weg
 * Einde TODO Stap 2 */
 
        stap2(zending);



        stap3(zending);

        
// TODO stap 4: haal commentaar weg
        stap4(zending);

        
// TODO stap 5: haal commentaar weg
        stap5(zending);

        
//TODO stap 6: haal commentaar weg
        stap6(zending);

    }
    

    public static void stap2(ArrayList<Post> zending) {
        System.out.println("\n=== STAP 1 ===");

        Brief brief;
        
        brief = new Brief(20, false, new NAW("Dennis Breuker", "Wibautstraat", 2, "1091 GM", "Amsterdam"));
        zending.add(brief);
        System.out.println(brief);

        brief = new Brief(21, false, new NAW("Nico Tromp", "Wibautstraat", 4, "1091 GM", "Amsterdam"));
        zending.add(brief);
        System.out.println(brief);
        
        brief = new Brief(100, true, new NAW("Jos Palmen", "Wibautstraat", 2, "1091 GM", "Amsterdam"));
        zending.add(brief);
        System.out.println(brief);
        
        brief = new Brief(101, false, new NAW("Huub van Thienen", "Rachelsmolen", 1, "5612 MA", "Eindhoven"));
        zending.add(brief);
        System.out.println(brief);
    }

    

    public static void stap3(ArrayList<Post> zending) {
        System.out.println("\n=== STAP 3 ===");

        Pakket pakket;
        
        pakket = new Pakket(true, 10000, true, new NAW("Karel Pieterson", "Wielewaalstraat", 3, "3083 KW", "Rotterdam"));
        zending.add(pakket);
        System.out.println(pakket);
        
        pakket = new Pakket(false, 10001, true, new NAW("Claar van der Does", "Wielewaalplein", 1, "2566 WX", "Den Haag"));
        zending.add(pakket);
        System.out.println(pakket);
        
        pakket = new Pakket(false, 10000, false, new NAW("Pieter Leek", "Nieuwmarkt", 4, "1012 CR", "Amsterdam"));
        zending.add(pakket);
        System.out.println(pakket);
        
        pakket = new Pakket(true, 10001, false, new NAW("Folkert Boonstra", "Lijsterbesoord", 3, "1112 EG", "Diemen"));
        zending.add(pakket);
        System.out.println(pakket);
    }

    

    public static void stap4(ArrayList<Post> zending) {
        System.out.println("\n=== STAP 4 ===");

        BuitenlandPakket pakket;
        
        pakket = new BuitenlandPakket(true, true, 10001, false, new NAW("Vito Andolini", "Mob street", 13, "90034", "Corleone"));
        zending.add(pakket);
        System.out.println(pakket);

        pakket = new BuitenlandPakket(false, true, 10000, false, new NAW("Pablo Escobar", "Plaza Coca", 42, "050033", "Medellin"));
        zending.add(pakket);
        System.out.println(pakket);

        pakket = new BuitenlandPakket(false, false, 10001, false, new NAW("Melania Trump", "Trump Tower", 1, "10022", "New York"));
        zending.add(pakket);
        System.out.println(pakket);
    }

    
// TODO stap 5: haal commentaar weg
    public static void stap5(ArrayList<Post> zending) {
        System.out.println("\n=== STAP 5 ===");
        
        String plaats = "Amsterdam";
        System.out.println("Alle brieven naar " + plaats);
        printBrievenNaarPlaats(zending, plaats);
    }


	private static void printBrievenNaarPlaats(ArrayList<Post> zending, String plaats) {
	for(Post p:zending) {
		if(p instanceof Brief) {
			Brief b=(Brief)p;
			if(p.getNaw().getWoonplaats().equals(plaats)) {
				System.out.println(p);
			}
			
		}
	}
		
	}


// TODO stap 6: haal commentaar weg
    public static void stap6(ArrayList<Post> zending) {
        System.out.println("\n=== STAP 6 ===\n");
      //sorts elemets in Asc order
        Collections.sort(zending);
        
        System.out.println("Gesorteerde post:");
        for (Post p : zending) {
            System.out.println(p);
        }
    }

}
