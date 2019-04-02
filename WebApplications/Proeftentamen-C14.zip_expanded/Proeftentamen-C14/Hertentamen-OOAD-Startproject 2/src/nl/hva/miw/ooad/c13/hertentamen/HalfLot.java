package nl.hva.miw.ooad.c13.hertentamen;

/**
 * Een half lot. Bij winst keert dit lot slechts de helft van het bedrag uit.
 * 
 * @author michel
 *
 */
public class HalfLot implements Lot {
	private static final double UITKEER_RATIO = 0.5;

	private int nr;			// Nummer van dit lot
	private int prijs;		// Het volledige bedrag dat uitgekeerd zou worden als het lot getrokken wordt.
							// Dit kan echter minder zijn.

	/**
	 * Constructor voor een HalfLot. De prijs is het bedrag dat uitgekeerd wordt als dit een Heel Lot is.
	 * 
	 * @param prijs
	 */
	public HalfLot(int prijs) {
		super();
		this.prijs = prijs;
	}
	
	@Override
	public int getNr() {
		return nr;
	}

	@Override
	public boolean isGevallen(int gevallenNr) {
		return nr == gevallenNr;
	}

	@Override
	public void kiesRandomNr( int maxNr ) {
		// OPDRACHT 1: Implementeer deze methode

	}

	@Override
	public double keerGewonnenBedragUit() {
		return prijs * UITKEER_RATIO;
	}

	@Override
	public String toString() {
		return "HalfLot [nr=" + nr + ", prijs=" + prijs + "]";
	}
}
