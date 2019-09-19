package nl.hva.oop1.bedrijf.models;

public class Zzper extends Persoon implements Oproepbaar{
	private double uurtarief;
	private double urenGewerkt;

	public Zzper(String naam,double uurtarief) {
		super(naam);
		this.uurtarief=uurtarief;
		this.urenGewerkt=0;
		
	}

	@Override
	public void huurIn(double uren) {
		// TODO Auto-generated method stub
		urenGewerkt=+uren;
		
	}

	@Override
	public double brekenIkomsten() {
		// TODO Auto-generated method stub
		return urenGewerkt*uurtarief;
	}

}
