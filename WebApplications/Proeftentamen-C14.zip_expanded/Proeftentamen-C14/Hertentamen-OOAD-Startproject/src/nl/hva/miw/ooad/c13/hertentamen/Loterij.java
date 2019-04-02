package nl.hva.miw.ooad.c13.hertentamen;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Loterij klasse. 
 * 
 * Klanten kunnen zich registereren.
 * Klanten kunnen loten kopen (half lot of heel lot).
 * 
 * Na een trekking kan opgevraagd worden hoeveel een klant gewonnen heeft.
 * 
 * @author michel
 *
 */

public class Loterij {
	
	private static final int MAX_LOT_NR = 99999999;
	private final static int PRIJS = 1000;	// Uitkering bij gewonnen (hele) loten

	
	private Map<Integer, Klant> klanten = new HashMap<>();	// Geregistreerde klanten

	private Random rand;									// Gebruikt om trekkingen te doen.
	
	
	/**
	 * Registreer een nieuwe klant. Retourneert een klant_id.
	 * 
	 * @param naam
	 * @return
	 */
	public int registreerKlant( String naam ) {
		Klant k = new Klant( naam );
		
		int k_id = k.getId();

		klanten.put( k_id, k);

		return k_id;
	}
	
	
	/**
	 * Klant k_id koopt een Half Lot. 
	 * 
	 * Er wordt gecontrolleerd of de klant wel geregistreerd is. Zo ja,
	 * dan wordt een lot gekocht en bij de klant opgeslagen. Het nummer van de lot
	 * wordt geretourneerd.
	 * 
	 * Als de klant niet geregistreerd is wordt -1 geretourneerd.
	 * 
	 * @param k_id
	 * @return
	 */
	public int koopHalfLot( int k_id ) {
		// OPDRACHT 1: Implementeer deze methode

		return 0;
	}

	/**
	 * Klant k_id koopt een Heel Lot. 
	 * 
	 * Er wordt gecontrolleerd of de klant wel geregistreerd is. Zo ja,
	 * dan wordt een lot gekocht en bij de klant opgeslagen. Het nummer van de lot
	 * wordt geretourneerd.
	 * 
	 * Als de klant niet geregistreerd is wordt -1 geretourneerd.
	 * 
	 * @param k_id
	 * @return
	 */
	public int koopHeelLot( int k_id ) {
		// OPDRACHT 1: Implementeer deze methode

		return 0;
	}

	/**
	 * Retourneert of de klant is geregistreerd of niet.
	 * 
	 * @param k_id
	 * @return
	 */
	private boolean isGeregistreerdKlant(int k_id) {
		// OPDRACHT 1: Implementeer deze methode
		return false;
	}

	
	/**
	 * Trekt een winnend lotnr en retourneert dat.
	 * 
	 * @return
	 */
	public int doeTrekking() {
		return rand.nextInt( MAX_LOT_NR );
	}
	
	
	/**
	 * Keer het gewonnen bedrag uit voor een klant gegeven een getrokken lot_nr.
	 * 
	 * Als de klant niet geregistreerd is wordt -1 geretourneerd
	 * 
	 * @param k_id
	 * @param lot_nr
	 * @return
	 */
	public double keerGewonnenBedragUit( int k_id, int lot_nr ) {
		if ( isGeregistreerdKlant( k_id ) ) {
			Klant k = klanten.get( k_id );
			
			return k.prijzenGewonnen( lot_nr );
		}
		
		return -1;
	}
	
	
	public Klant getKlant( int k_id ) {
		return klanten.get( k_id );
	}
}