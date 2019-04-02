package nl.hva.miw.ooad.c13.hertentamen;

public interface Lot {
	
	/**
	 * Retourneer het nummer van dit lot.
	 * @return
	 */
	public int getNr();
	
	/**
	 * Kies een random nummer (maximaal maxNr) voor dit lot.
	 */
	public void kiesRandomNr(int maxNr );
	
	
	/**
	 * Controlleert of dit lot in de prijzen is gevallen.
	 * 
	 * @param gevallenNr
	 * @return
	 */
	public boolean isGevallen( int gevallenNr );
	

	/**
	 * Keer het gewonnen bedrag uit dat op dit lot zit.
	 * 
	 * @return
	 */
	public double keerGewonnenBedragUit();
}