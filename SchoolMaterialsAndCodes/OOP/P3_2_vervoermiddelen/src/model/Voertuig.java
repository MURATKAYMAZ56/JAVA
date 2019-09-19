package model;

public abstract  class Voertuig extends Vervoermiddel{
private int aantalWielen;
private int gewichtKg;
	protected Voertuig(String merk, String type,int aantalWielen,int gewichtKg ) {
		super(merk, type);
		this.aantalWielen=aantalWielen;
		this.gewichtKg=gewichtKg;
		// TODO Auto-generated constructor stub
	}
	public int getGewichtKg() {
		return gewichtKg;
	}
	

}
