package nl.hva.oop1.bedrijf;

import nl.hva.oop1.bedrijf.models.Bedrijf;
import nl.hva.oop1.bedrijf.models.Manager;
import nl.hva.oop1.bedrijf.models.Vrijwilliger;
import nl.hva.oop1.bedrijf.models.Werknemer;
import nl.hva.oop1.bedrijf.models.Zzper;

/**
 * Main test het klassendiagram van de opgave.
 * 
 * @author Dennis Breuker (d.m.breuker@hva.nl)
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bedrijf bedrijf = new Bedrijf("HvA");

        Werknemer w = new Werknemer("Jantine Jansen", 1200);
        bedrijf.neemInDienst(w);

        w = new Werknemer("Piet Pietersen", 1300);
        bedrijf.neemInDienst(w);

        Vrijwilliger v = new Vrijwilliger("Guus Goedhart");
        bedrijf.neemInDienst(v);
        v.huurIn(10);
        
        Manager m = new Manager("Brigitte Baas", 10000);
        bedrijf.neemInDienst(m);
        m.kenBonus(750);
        
        m = new Manager("Dirk Teur", 10000);
        bedrijf.neemInDienst(m);
        m.kenBonus(1200);
        
        Zzper z = new Zzper("Beun Haas", 120);
        bedrijf.neemInDienst(z);
        z.huurIn(40);

        System.out.println(bedrijf);
        bedrijf.printInkomsten();
        System.out.println("\nAantal in management: " + bedrijf.aantalManagers());
    } 
}
