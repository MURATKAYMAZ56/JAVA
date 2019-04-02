package nl.hva.oop1.bedrijf.models;

import java.util.ArrayList;

import java.util.Collections;

public class Bedrijf {
	private String naam;
	private ArrayList<Persoon> medewerkers;

	public Bedrijf(String naam) {

		this.naam = naam;
		medewerkers = new ArrayList<Persoon>();
	}

	public void printInkomsten() {
		Collections.sort(medewerkers);
		System.out.println("Inkomen van alle personen");
		for(Persoon medewerker:medewerkers) {
			System.out.print("\t"+medewerker+" ");
			double inkomsten= medewerker.brekenIkomsten();
			if(inkomsten==0) {
				System.out.println("bedankt voor uw inzet");
			}else {
				System.out.println("inkomsten : "+inkomsten);
			}
		}
	}

	public int aantalManagers() {
		int aantalManagers = 0;
		for (Persoon medewerker : medewerkers) {
			if (medewerker instanceof Manager) {
				aantalManagers++;
			}
		}
		return aantalManagers;
	}

	public void neemInDienst(Persoon persoon) {
		medewerkers.add(persoon);

	}

	@Override
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		sb=sb.append("Bedrijf").append(naam);
		sb=sb.append("heeft").append(medewerkers.size()).append("medewerkers:\n ");
				for(Persoon persoon :medewerkers) {
					sb.append("\t").append(persoon).append(" \n");
				}
		
		return sb.toString();
	}

	
	
	
	
}
