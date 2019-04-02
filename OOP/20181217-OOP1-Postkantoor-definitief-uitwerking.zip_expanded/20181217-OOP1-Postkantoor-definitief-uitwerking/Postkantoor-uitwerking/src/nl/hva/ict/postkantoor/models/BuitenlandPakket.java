/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package nl.hva.ict.postkantoor.models;

/**
 *
 * @author Dennis Breuker (d.m.breuker@hva.nl)
 */
public class BuitenlandPakket extends Pakket {
    private boolean inEuropa;
    private final static int EXTRA_BINNEN_EUROPA = 10;
    private final static int FACTOR_BUITEN_EUROPA = 5;

    public BuitenlandPakket(boolean inEuropa, boolean pastInBrievenbus, int gewicht, boolean aangetekend, NAW naw) {
        super(pastInBrievenbus, gewicht, aangetekend, naw);
        this.inEuropa = inEuropa;
    }

    @Override
    public double berekenPrijs() {
        return inEuropa ? super.berekenPrijs() + EXTRA_BINNEN_EUROPA : FACTOR_BUITEN_EUROPA * super.berekenPrijs();
    }
    
}
