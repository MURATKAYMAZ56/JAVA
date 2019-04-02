package nl.hva.oop1.bedrijf.models;

public class Vrijwilliger extends Persoon implements Oproepbaar {

	public Vrijwilliger(String naam) {
		super(naam);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double brekenIkomsten() {
		// they work for free
		return 0;
	}


	@Override
	public void huurIn(double uren) {
		// no money  bro
		
	}

}
