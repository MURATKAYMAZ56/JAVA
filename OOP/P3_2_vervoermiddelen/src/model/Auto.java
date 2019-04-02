package model;

public class Auto extends Voertuig implements Belastbaar {
	private String soortBrandstof;
	private static final int AANTAL_WIELEN = 4;

	public Auto(String merk, String type, int gewichtKg, String soortBrandstof) {
		super(merk, type, AANTAL_WIELEN, gewichtKg);
		this.soortBrandstof = soortBrandstof;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String geefAandrijfKracht() {
		// TODO Auto-generated method stub
		return (this.soortBrandstof + " motor");
	}

	final double LIGHT_WEIGHT = 1000;// kg
	final double HEAVY_WEIGHT = 1450;// kg
	final double MIN_TARIFF = 85;// euro
	final double MIDDLE_TARIFF = 104;// euro
	final double MAX_TARIFF = 122;// euro
	final double DIESEL_FACTOR = 1.3;// pay more
	final double ELECTRIC_FACTOR = 0.5;// discount

	@Override
	public double getVervoerBelsating() {

		// There are three tariff groups for cars: cars lighter than 1000kg cost € 85
		// per quarter, cars heavier than 1450kg cost € 122 per quarter and for the
		// other cars you pay € 104 per quarter. But for diesel cars you pay a surcharge
		// of 30% and for electric cars you get a 50% discount.

		return calculateBelastingDueWeight(super.getGewichtKg())*addingCalculationDueBrandstof(this.soortBrandstof);
	}

	private double calculateBelastingDueWeight(double weight) {

		if (weight <= 1000) {
			return MIN_TARIFF;

		} else if (weight >= 1450) {
			return MAX_TARIFF;
		} else {
			return MIDDLE_TARIFF;
		}

	}

	private double addingCalculationDueBrandstof(String brandstof) {
		
		
		if(brandstof=="diesel") {
			return DIESEL_FACTOR;
		}else if(brandstof=="electrische"){
			return ELECTRIC_FACTOR;
		}else {
			return 1.0;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
