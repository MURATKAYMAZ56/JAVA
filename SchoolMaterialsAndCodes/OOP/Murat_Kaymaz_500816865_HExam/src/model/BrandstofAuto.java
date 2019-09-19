package model;

public class BrandstofAuto extends Auto {
	private String brandstof;
	private int uitstoot;
	private final static int BOUWJAAR_LIMIT = 1995;// car should be more yhis to be called isSchoon
	private final static int GEWICHT_LIMIT = 2500;// in addition car should be les than this to be called isSchoon
	private final static int DIESEL_UITSTOOT_LIMIT = 280;
	private final static int BENZINE_UITSTOOT_LIMIT = 320;
	private final static boolean GAS_AUTO = false;// newer isSchoon

	public BrandstofAuto(String brandstof, int uitstoot, String merk, String kenteken, int bouwjaar, int gewicht,
			Eigenaar eigenaar) {
		super(merk, kenteken, bouwjaar, gewicht, eigenaar);
		this.brandstof = brandstof;
		this.uitstoot = uitstoot;
	}
	

	public String getBrandstof() {
		return brandstof;
	}


	@Override
	public   boolean isSchoon() {
		if (getBouwjaar() > BOUWJAAR_LIMIT && getGewicht() < GEWICHT_LIMIT && checkingUitstoot()) {
			return true;
		} else {
			return false;
		}

	}

	public  boolean checkingUitstoot() {
		if (brandstof == "diesel") {
			return (uitstoot < DIESEL_UITSTOOT_LIMIT) ? true : false;
		} else if (brandstof == "benzine") {
			return (uitstoot < BENZINE_UITSTOOT_LIMIT) ? true : false;
		} else {
			return GAS_AUTO;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb=sb.append(super.toString());
		sb=sb.append("  Brandstof : "+brandstof+"\n");
		sb=sb.append("  uitstoot : "+uitstoot+"\n");

		return sb.toString();
	}

}
