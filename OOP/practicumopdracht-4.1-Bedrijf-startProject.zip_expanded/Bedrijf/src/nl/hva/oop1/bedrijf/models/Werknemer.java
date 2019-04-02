package nl.hva.oop1.bedrijf.models;

public class Werknemer extends Persoon {
	private static int laatstePersonelnummer=999;
	private double maandsalaris;
	private int personeelnummer;
	

	public Werknemer(String naam,double maandsalaris) {
		super(naam);
		this.maandsalaris=maandsalaris;
		this.personeelnummer=++laatstePersonelnummer;
	 
	}

	@Override
	public double brekenIkomsten() {
		// TODO Auto-generated method stub
		return this.maandsalaris;
	}

}
