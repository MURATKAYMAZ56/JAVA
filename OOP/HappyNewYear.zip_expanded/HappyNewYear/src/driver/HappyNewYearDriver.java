package driver;

import java.util.ArrayList;

import model.Instructie;
import model.Knaller;
import model.Product;
import model.Vuurpijl;
import model.Vuurwerk;

public class HappyNewYearDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Vuurwerk> pakket = new ArrayList<Vuurwerk>();


        System.out.println("Happy new year from: Murat");


        stap1(pakket);



        stap2(pakket);



        stap3(pakket);



        stap4(pakket);

        

        stap5(pakket);

/* TODO stap 6: haal commentaar weg
        stap6(pakket);
einde TODO stap61 */
    }


    private static void stap1(ArrayList<Vuurwerk> pakket) {
        System.out.println("\n--- STAP 1 ---");

        Vuurwerk vuurwerk;

        // vuurwerk met Nederlandstalige instructie
        vuurwerk = new Vuurwerk("Veiligheidsbril", 2.5,
                new Instructie(true, 6, "Draag bij aansteken"));
        pakket.add(vuurwerk);
        System.out.println(vuurwerk);

        // vuurwerk met Engelstalige instructie
        vuurwerk = new Vuurwerk("Safety glass", 2.5,
                new Instructie(false, 6, "Wear before ignition"));
        pakket.add(vuurwerk);
        System.out.println(vuurwerk);

        // vuurwerk zonder instructie
        vuurwerk = new Vuurwerk("Aansteeklont zonder instructie", 0.25, null);
        pakket.add(vuurwerk);
        System.out.println(vuurwerk);
    }



    private static void stap2(ArrayList<Vuurwerk> pakket) {
        System.out.println("\n--- STAP 2 ---");

        Knaller knaller;

        // knaller met Engelstalige instructie en 75 decibel
        knaller = new Knaller(777, 75, "Celebration Crackers", 10,
                new Instructie(false, 21, "Keep minimum 10 ft distance"));
        pakket.add(knaller);
        System.out.println(knaller);

        // knaller met Nederlandstalige instructie en 120 decibel
        knaller = new Knaller(500, 120, "Peking Rol", 45,
                new Instructie(true, 21, "Houd minimaal 5 meter afstand"));
        pakket.add(knaller);
        System.out.println(knaller);

        // knaller met Nederlandstalige instructie en 125 decibel
        knaller = new Knaller(1000, 125, "Shanghai Rol", 85,
                new Instructie(true, 21, "Houd minimaal 5 meter afstand"));
        pakket.add(knaller);
        System.out.println(knaller);

        // knaller zonder instructie en 100 decibel
        knaller = new Knaller(1000, 100, "Hongkong Rol", 82.5, null);
        pakket.add(knaller);
        System.out.println(knaller);
    }



    private static void stap3(ArrayList<Vuurwerk> pakket) {
        System.out.println("\n--- STAP 3 ---");

        Vuurpijl vuurpijl;

        // vuurpijl met Nederlandstalige instructie, correcte kleurverhouding, leeftijd 10
        vuurpijl = new Vuurpijl(40, new int[]{50, 25, 25}, "Cruise Rocket", 2.50,
                new Instructie(true, 10, "Niet in de hand houden"));
        pakket.add(vuurpijl);
        System.out.println(vuurpijl);

        // vuurpijl met Nederlandstalige instructie, incorrecte kleurverhouding, leeftijd 16
        vuurpijl = new Vuurpijl(40, new int[]{25, 30, 44}, "Killing Arrow", 4.25,
                new Instructie(true, 16, "Niet in de hand houden"));
        pakket.add(vuurpijl);
        System.out.println(vuurpijl);

        // vuurpijl met Engelstalige instructie, incorrecte kleurverhouding, leeftijd 20
        vuurpijl = new Vuurpijl(40, new int[]{50, 41, 10}, "Magic Sky", 2.75,
                new Instructie(false, 20, "Keep minimum 10 ft distance"));
        pakket.add(vuurpijl);
        System.out.println(vuurpijl);

        // vuurpijl zonder instructie, correcte kleurverhouding
        vuurpijl = new Vuurpijl(40, new int[]{50, 50, 0}, "Golden Sky", 3.25, null);
        pakket.add(vuurpijl);
        System.out.println(vuurpijl);
    }



    public static void stap4(ArrayList<Vuurwerk> pakket) {
        System.out.println("\n--- STAP 4 ---");

        toonVuurwerk(pakket);
    }


	private static void toonVuurwerk(ArrayList<Vuurwerk> pakket) {
		double totaal=0;
	for(Vuurwerk v:pakket) {
		System.out.println(v);
		totaal+=v.getPrijs();
	}
	System.out.printf("\n Kosten vuurwerkpakket: %s%.2f",Product.EURO,totaal);
		
	}


    public static void stap5(ArrayList<Vuurwerk> pakket) {
        System.out.println("\n--- STAP 5 ---");

        toonInstructies(pakket, -1);
        toonInstructies(pakket, 3);
        toonInstructies(pakket, 10);
        toonInstructies(pakket, 11);
    }


	private static void toonInstructies(ArrayList<Vuurwerk> pakket, int index) {
	for(Vuurwerk v:pakket) {
		if(index<0||index>=pakket.size()) {
			System.out.println("Index valt buiten grenzen.");
			return;
		}
		Vuurwerk vuurwerk= pakket.get(index);
		Instructie instructie=vuurwerk.getInstructie();
		System.out.println(instructie==null?"Instructie ontbreekt.": instructie);
	}
		
	}


/* TODO stap 6: haal commentaar weg
    public static void stap6(ArrayList<Vuurwerk> pakket) {
        System.out.println("\n--- STAP 6 ---");

        printHardeKnallers(pakket, 100);
    }
einde TODO stap 6 */
}