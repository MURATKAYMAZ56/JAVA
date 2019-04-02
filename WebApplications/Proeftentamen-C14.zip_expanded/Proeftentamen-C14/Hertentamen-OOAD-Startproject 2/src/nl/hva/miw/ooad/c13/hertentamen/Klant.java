package nl.hva.miw.ooad.c13.hertentamen;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse Klant. Een klant kan loten kopen.
 * Elk lot kan opgeslagen worden bij deze klant.
 * 
 * De klant kan controleren hoeveel die gewonnen heeft, gegeven een winnend lotnr.
 * 
 * @author michel
 *
 */
public class Klant {
	private static int nextId = 1000;
	
	private String naam;
	private int id;
	private List<Lot> loten = new ArrayList<>();

	public Klant(String naam) {
		super();
		this.naam = naam;
		this.id = nextId++;
	}

	public String getNaam() {
		return naam;
	}

	public int getId() {
		return id;
	}
	
	/**
	 * Voeg een gekocht lot toe aan deze klant
	 * @param lot
	 */
	public void lotGekocht( Lot lot ) {
		// OPDRACHT 1: Implementeer deze methode
	}
	
	/**
	 * Controleer of deze klant een prijs heeft gewonnen,
	 * zo ja, retourneer het totale gewonnen bedrag.
	 * 
	 * @param lotNr
	 * @return
	 */
	public double prijzenGewonnen( int lotNr ) {
		double gewonnenBedrag = 0;
		
		for ( Lot lot : loten ) {
			if ( lot.isGevallen( lotNr ) ) {
				gewonnenBedrag += lot.keerGewonnenBedragUit();
			}
		}
		
		return gewonnenBedrag;
	}
	
	/**
	 * Geef een lijst van gekochte loten terug.
	 * @return
	 */
	public List<Lot> getGekochteLoten() {
		return loten;
	}

	@Override
	public String toString() {
		return "Klant [naam=" + naam + ", id=" + id + ", loten=" + loten + "]";
	}
}