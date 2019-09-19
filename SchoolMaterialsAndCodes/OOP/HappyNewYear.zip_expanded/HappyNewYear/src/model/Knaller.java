package model;

public class Knaller extends Vuurwerk {
private int aantalKnaller;
private int decibel;
private final static int MAX_DECIBEL=120;

	public Knaller(int aantalKnaller,int decibel,String naam, double prijs, Instructie instructie) {
		super(naam, prijs, instructie);
		this.aantalKnaller=aantalKnaller;
		this.decibel=decibel;
		
	}
	

	public int getDecibel() {
		return decibel;
	}


	@Override
	public boolean islegaal() {
		// TODO Auto-generated method stub
		return super.islegaal()&&decibel<=MAX_DECIBEL;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return String.format("%s \n aantalKnaler:  %d\n dceibel: %d",super.toString(),aantalKnaller,decibel);
	}

}
