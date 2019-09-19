package model;

public abstract class Vervoermiddel implements Belastbaar {

	private int id;
	private static int aantalVervoermiddelen = 0;
	private String merk;
	private String type;

	protected Vervoermiddel(String merk, String type) {
		aantalVervoermiddelen++;
		this.id = aantalVervoermiddelen;
		this.merk = merk;
		this.type = type;
	}

	public abstract String geefAandrijfKracht();

	@Override
	public String toString() {
		return String.format("Vervoermiddel #%d %s %s aangedreven door %s ",this.id,this.merk,this.type,this.geefAandrijfKracht());
				
	}
	

}
