package nl.hva.miw.ooad.c13.hertentamen;

/**
 * Een heel lot. Bij winst keert dit lot het volle bedrag uit.
 * 
 * @author michel
 *
 */
public class HeelLot implements Lot {
	private static final double UITKEER_RATIO = 1.0;

	private int nr;			// Nummer van dit lot
	private int prijs;		// Het volledige bedrag dat uitgekeerd zou worden als het lot getrokken wordt.

	/**
	 * Constructor voor een HeelLot. De prijs is het bedrag dat uitgekeerd wordt als dit een Heel Lot is.
	 * 
	 * @param prijs
	 */
	public HeelLot(int prijs) {
		super();
		this.prijs = prijs;
	}
	
	@Override
	public int getNr() {
		return nr;
	}

	@Override
	public void kiesRandomNr( int maxNr ) {
		// OPDRACHT 1: Implementeer deze methode

	}
	

	@Override
	public boolean isGevallen(int gevallenNr) {
		return nr == gevallenNr;
	}

	@Override
	public double keerGewonnenBedragUit() {
		return prijs * UITKEER_RATIO;
	}

	@Override
	public String toString() {
		return "HeelLot [nr=" + nr + ", prijs=" + prijs + "]";
	}
}
