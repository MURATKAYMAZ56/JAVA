package nl.hva.miw.ooad.c13.hertentamen;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import nl.hva.miw.ooad.c13.hertentamen.Loterij;

public class LoterijTest {

	@Test
	public void test() {
		Loterij loterij = new Loterij();
		
		int k_id = loterij.registreerKlant("Gaston");
		
		loterij.koopHeelLot( k_id );
		loterij.koopHalfLot( k_id );
		
		// Vraag de lotnr's op.
		List<Lot> loten = loterij.getKlant( k_id ).getGekochteLoten();
		int lot1 = loten.get( 0 ).getNr();
		int lot2 = loten.get( 1 ).getNr();
		
		// Controleer of deze klant wat gewonnen heeft
		assertTrue( loterij.keerGewonnenBedragUit(k_id, lot1) > 0 );		// Lot1 keert iets uit
		assertTrue( loterij.keerGewonnenBedragUit(k_id, lot2) > 0 );		// Lot2 keert iets uit
		assertFalse( loterij.keerGewonnenBedragUit(k_id, -1) > 0 );			// Niet bestaand lot keert niets uit
		assertTrue( loterij.keerGewonnenBedragUit(-1, lot1) == -1 );		// Niet bestaande klant retourneert -1
	}
}
