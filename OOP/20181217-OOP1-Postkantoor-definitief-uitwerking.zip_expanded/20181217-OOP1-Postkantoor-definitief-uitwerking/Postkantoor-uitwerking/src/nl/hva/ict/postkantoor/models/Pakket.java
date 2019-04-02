/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package nl.hva.ict.postkantoor.models;

/**
 * past in brievenbus: 3.95 (aangetekend: 8.15)
 * t/m 10 kg: 6.95 (aangetekend 8.60)
 * vanaf 10 kg: 13.25 (aangetekend 14.90)
 * https://www.postnl.nl/versturen/pakket-versturen/tarieven/?country=nl
 * 
 * @author Dennis Breuker (d.m.breuker@hva.nl)
 */
public class Pakket extends Post {
    private boolean pastInBrievenbus;
    private final static double PAST_NORMAAL = 3.95;
    private final static double LICHT_NORMAAL = 6.95;
    private final static double ZWAAR_NORMAAL = 13.25;
    private final static double PAST_AANGETEKEND = 8.15;
    private final static double LICHT_AANGETEKEND = 8.60;
    private final static double ZWAAR_AANGETEKEND = 14.90;
    private final static int GRENS_ZWAAR = 10000;

    public Pakket(boolean pastInBrievenbus, int gewicht, boolean aangetekend, NAW naw) {
        super(gewicht, aangetekend, naw);
        this.pastInBrievenbus = pastInBrievenbus;
    }

    @Override
    public double berekenPrijs() {
        if (pastInBrievenbus) {
            return isAangetekend() ? PAST_AANGETEKEND : PAST_NORMAAL;
        }
        if (getGewicht() <= GRENS_ZWAAR) {
            return isAangetekend() ? LICHT_AANGETEKEND : LICHT_NORMAAL;
        }
        else return isAangetekend() ? ZWAAR_AANGETEKEND : ZWAAR_NORMAAL;
    }

    @Override
    public String toString() {
        return "--- PAKKET ---\n" + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }    
}
