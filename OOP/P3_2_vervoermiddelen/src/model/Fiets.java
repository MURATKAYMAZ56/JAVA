package model;

public class Fiets extends Voertuig {
	private static final int AANTAL_WIELEN=2;

	public Fiets(String merk, String type, int gewichtKg) {
		super(merk, type, AANTAL_WIELEN, gewichtKg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String geefAandrijfKracht() {
		// TODO Auto-generated method stub
		return ("menskracht");
	}

}
