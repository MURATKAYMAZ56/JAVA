package main;

import java.util.ArrayList;
import java.util.List;

public class KledingLade {

	private final String naam;
	private double totaalGewicht;
	private final double maximaalLadeGewicht;
	private final List<Kleding> kledingLijst;
	
	public KledingLade(String naam, double maximaalLadeGewicht) {
		super();
		this.naam = naam;
		this.maximaalLadeGewicht = maximaalLadeGewicht;
		this.kledingLijst = new ArrayList<>();
	}
	
	// Vraag 1
	public void legKledingInLade(Kleding kledingstuk) {
		if(aantalKledingStukken() < maximaalLadeGewicht) {
			kledingLijst.add(kledingstuk);
			totaalGewicht += kledingstuk.getGewicht();
		}
	}
	
	/**
	 * @return aantal kledingstukken in Lade object
	 */
	public int aantalKledingStukken() {
		return kledingLijst.size();
	}

	public double getTotaalGewicht() {
		return totaalGewicht;
	}

	@Override
	public String toString() {
		return "KledingLade [naam=" + naam + ", totaalGewicht=" + totaalGewicht + ", maximaalLadeGewicht="
				+ maximaalLadeGewicht + "]";
	}

	public List<Kleding> getKledingLijst() {
		return kledingLijst;
	}

}
