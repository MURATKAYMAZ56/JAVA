package model;

public class Koets extends Voertuig {
	private int aantalPaarden;
	private static final int AANTAL_WIELEN=4;

	public Koets(String merk, String type, int aantalPaarden, int gewichtKg) {
		super(merk, type, AANTAL_WIELEN, gewichtKg);
		this.aantalPaarden=aantalPaarden;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String geefAandrijfKracht() {
		// TODO Auto-generated method stub
		return (this.aantalPaarden+"paarden");
	}

}
