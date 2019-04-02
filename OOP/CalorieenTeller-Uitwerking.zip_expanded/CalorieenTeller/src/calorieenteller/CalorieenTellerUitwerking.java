/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calorieenteller;

import calorieenteller.model.ZoetBelegUitwerking;
import calorieenteller.model.VleeswaarUitwerking;
import calorieenteller.model.EtenswaarUitwerking;
import calorieenteller.model.BroodUitwerking;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author martijnthorig
 */
public class CalorieenTellerUitwerking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welkom bij Calorieen Teller");
        
        testStap2();
        testStap3();
        
        //testStap4();
        testStap5();
        
        testStap6();
        testStap7();
    }
    
    private static void testStap2()
    {
        System.out.println("Test stap 2");
        
        Calendar cal;
        cal = new GregorianCalendar(2019, 1, 5);
        
        EtenswaarUitwerking brood = new BroodUitwerking("Vloerbrood", 1400, cal);
                       
        System.out.println(brood);
        System.out.println("Totaal aantal calorieen is " + 
                        brood.geefTotaleCalorieen() + "\n\n");
    }
    
    private static void testStap3()
    {
        System.out.println("Test stap 3");
        
        Calendar cal;
        cal = new GregorianCalendar(2019, 1, 5);
        
        EtenswaarUitwerking brood = new BroodUitwerking("Vloerbrood", 1400, cal);
        
        cal = new GregorianCalendar(2021, 10, 5);
        EtenswaarUitwerking broodjeJam = new ZoetBelegUitwerking("Jam", 1500, cal, brood);
        
        System.out.println(broodjeJam.getBeschrijving());
        System.out.println("Totaal aantal calorieen is " + 
                        broodjeJam.geefTotaleCalorieen() + "\n\n");
    }
    
    private static void testStap4()
    {
        System.out.println("Test stap 4");
        
        Calendar cal;
        cal = new GregorianCalendar(2019, 1, 5);
        
        EtenswaarUitwerking brood = new BroodUitwerking("Casino Wit", 1900, cal);
        
        cal = new GregorianCalendar(2021, 10, 5);
        EtenswaarUitwerking broodjeHam = new VleeswaarUitwerking("Ham", 1100, cal, brood);
        
        System.out.println(broodjeHam);
        System.out.println("Totaal aantal calorieen is " + 
                        broodjeHam.geefTotaleCalorieen() + "\n\n");
    }
    
    /**
     * In deze stap worden voor jou 3 broodjes klaar gemaakt: broodje met ham, 
     * broodje met jam en een broodje met gehakt.
     */
    private static void testStap5()
    {
        System.out.println("Test stap 5");
        
        List<EtenswaarUitwerking> etenswaren = new ArrayList();
        Calendar cal;
        cal = new GregorianCalendar(2019, 1, 5);
        
        EtenswaarUitwerking brood = new BroodUitwerking("Vloerbrood", 1400, cal);
        
        cal = new GregorianCalendar(2021, 10, 5);
        EtenswaarUitwerking broodjeHam = new VleeswaarUitwerking("Ham", 1500, cal, brood);   
        
        etenswaren.add(broodjeHam);
                
        cal = new GregorianCalendar(2021, 10, 5);
        EtenswaarUitwerking broodjeJam = new ZoetBelegUitwerking("Jam", 1400, cal, brood);   
        
        etenswaren.add(broodjeJam);
        
        cal = new GregorianCalendar(2021, 10, 5);
        EtenswaarUitwerking broodjeBal = new VleeswaarUitwerking("Gehakt", 1000, cal, brood);   
        
        etenswaren.add(broodjeBal);
        
        printBroodMetVleeswaar(etenswaren);
    }
    
    private static void testStap6()
    {
        System.out.println("Test stap 6");
        Calendar cal;
        
        cal = new GregorianCalendar(2019, 1, 5);

        List<EtenswaarUitwerking> etenswaren = new ArrayList();
        etenswaren.add(new BroodUitwerking("Vloerbrood", 1400, cal));
        
        cal = new GregorianCalendar(2021, 10, 5);
        etenswaren.add(new ZoetBelegUitwerking("Hagelslag", 1500, cal));
        
        cal = new GregorianCalendar(2019, 1, 24);
        etenswaren.add(new VleeswaarUitwerking("Ham", 1000, cal));
        
        cal = new GregorianCalendar(2019, 2, 3);
        etenswaren.add(new BroodUitwerking("Suikerbrood", 7400, cal));
        
        cal = new GregorianCalendar(2019, 5, 24);
        etenswaren.add(new ZoetBelegUitwerking("Jam", 1450, cal));
        
        printEtenswarenNaDatum(etenswaren, new GregorianCalendar(2019, 4, 1));
    }
    
    private static void testStap7()
    {
        System.out.println("Test stap 7");
        Calendar cal;
        
        cal = new GregorianCalendar(2019, 1, 5);

        List<EtenswaarUitwerking> etenswaren = new ArrayList();
        etenswaren.add(new BroodUitwerking("Vloerbrood", 1400, cal));
        
        cal = new GregorianCalendar(2021, 10, 5);
        etenswaren.add(new ZoetBelegUitwerking("Hagelslag", 1500, cal));
        
        cal = new GregorianCalendar(2019, 1, 24);
        etenswaren.add(new VleeswaarUitwerking("Ham", 1000, cal));
        
        cal = new GregorianCalendar(2019, 2, 3);
        etenswaren.add(new BroodUitwerking("Suikerbrood", 7400, cal));
        
        cal = new GregorianCalendar(2019, 5, 24);
        etenswaren.add(new ZoetBelegUitwerking("Jam", 1400, cal));
        
        sortEtenswaren(etenswaren);
    }
    
    public static void sortEtenswaren(List<EtenswaarUitwerking> etenswaren) {
        System.out.println("Alle etenswaren gesorteerd op "
                + "calorieen (en naam)\n\n");
        Collections.sort(etenswaren);
        for(EtenswaarUitwerking e : etenswaren) {
            System.out.println(e);
        }
    }
    
    public static void printEtenswarenNaDatum(List<EtenswaarUitwerking> etenswaren, 
            Calendar datum) {
        System.out.println("Alle etenswaren dat langer houdbaar is dan "
                + datum.getTime() + "\n\n");
        
        for (EtenswaarUitwerking etenswaar : etenswaren) {
            if (etenswaar.getHoudbaarheidsDatum().after(datum)) {
                System.out.println(etenswaar);
            }
        }
    }
    
    public static void printBroodMetVleeswaar(List<EtenswaarUitwerking> broodjes) {
        
        for(EtenswaarUitwerking broodje : broodjes) {
            if(broodje instanceof VleeswaarUitwerking) {
                System.out.println(broodje);
                System.out.println("Totaal aantal calorieen is " + 
                        broodje.geefTotaleCalorieen() + "\n");
            }
        }
    }
}
