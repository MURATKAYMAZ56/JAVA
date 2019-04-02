/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package nl.hva.ict.postkantoor.models;

/**
 * Een brief is een poststuk in een envelop.
 * De prijs wordt berekend aan de hand van gewicht en of het aangetekend is.
 * t/m 20 gr: 0.73, 20-100 gr: 2.00, >100: 3.00
 * aangetekend; 8.15
 * 
 * @author Dennis Breuker (d.m.breuker@hva.nl)
 */
public class Brief extends Post {
	
	private final static double LICHT_NORMAAL = 0.73;
	private final static double MIDDEL_NORMAAL = 2.00;
	private final static double ZWAAR_NORMAAL = 3.00;
	private final static double AANGETEKEND = 8.15;
	private final static int GRENS_MIDDEL = 20;
	private final static int GRENS_ZWAAR = 100;
	
    public Brief(int gewicht, boolean aangetekend, NAW naw) {
        super(gewicht, aangetekend, naw);
    }
    
    /**
     * Berekent de prijs van een brief. De prijs is afhankelijk
     * van het gewicht en of het aangetekend is.
     * 
     * @return De berekende prijs
     */
    @Override
    public double berekenPrijs() {
        if (isAangetekend()) {
            return AANGETEKEND;
        }
        if (getGewicht() <= GRENS_MIDDEL) {
            return LICHT_NORMAAL;
        }
        if (getGewicht() <= GRENS_ZWAAR) {
            return MIDDEL_NORMAAL;
        }
        return ZWAAR_NORMAAL;
    }

    @Override
    public String toString() {
        return "--- BRIEF ---\n" + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }    
}
