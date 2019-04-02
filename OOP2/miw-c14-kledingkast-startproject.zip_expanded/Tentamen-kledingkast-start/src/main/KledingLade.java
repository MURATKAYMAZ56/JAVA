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
		// first checks whether if maximaalLadegewicht is not exceed after adding this
		// item;
		totaalGewicht = totaalGewicht + kledingstuk.getGewicht();
		if (getTotaalGewicht() < maximaalLadeGewicht) {
			kledingLijst.add(kledingstuk);

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

//Recursive to find heaviestCloth 
	public Kleding zoekZwaarsteKleeding(Kleding kleding) {
		Kleding heaviestKleed = null;
		if (kledingLijst.size() > 0) {
			heaviestKleed = kledingLijst.get(0);
			return zoekZwaarsteKleeding(heaviestKleed, 0);
		}
		return null;// if drawer is null

	}

	// and helpFunction

	private Kleding zoekZwaarsteKleeding(Kleding heaviestKleed, int index) {
		if (index >= kledingLijst.size()) {
			return heaviestKleed;

		}
		Kleding currentKleed = kledingLijst.get(index);
		if (currentKleed.getGewicht() > heaviestKleed.getGewicht()) {
			heaviestKleed = currentKleed;
		}
		System.out.println("index" + index + ", gewicht" + heaviestKleed.getGewicht());
		return zoekZwaarsteKleeding(heaviestKleed, ++index);
	}

}
