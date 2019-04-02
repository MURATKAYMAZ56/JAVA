package model;

public abstract class Vaartuig extends Vervoermiddel {
	private double lengte;

	protected Vaartuig(String merk, String type,double lengte) {
		super(merk, type);
		this.lengte=lengte;
		
	}

	public double getLengte() {
		return lengte;
	}
	

}
