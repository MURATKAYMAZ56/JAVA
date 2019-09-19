package model;

public class Motorboot extends Vaartuig implements Belastbaar {
	private String soortBrandstof;

	public Motorboot(String merk, String type, double lengte, String soortBrandstof) {
		super(merk, type, lengte);
		this.soortBrandstof = soortBrandstof;
	}

	@Override
	public String geefAandrijfKracht() {
		// TODO Auto-generated method stub
		return (this.soortBrandstof + " motor");
	}

//For motor boats, the length is considered. 
	// Boats smaller than 12 meters cost € 60 per quarter and
	// large boats cost € 100 per quarter. Here too you pay more
	// for diesel engines, 50% more.

	final double BASE_LENGTH = 12;// meter
	final double MIN_TARIFF = 60;// euro
	final double MAX_TARIFF = 100;// euro
	final double DIESEL_EFFECT = 1.5;// pay more

	@Override
	public double getVervoerBelsating() {

		return calculateBElasting(super.getLengte())*addingDieselEffect(this.soortBrandstof);
	}

	private double calculateBElasting(double length) {
		if (length <= BASE_LENGTH) {
			return MIN_TARIFF;
		} else {
			return MAX_TARIFF;
		}
	}

	private double addingDieselEffect(String brandstof) {
		if (brandstof == "diesel") {
			return DIESEL_EFFECT;
		} else {
			return 1.0;
		}
	}

}
