package model;

public class Zeilboot extends Vaartuig {

	public Zeilboot(String merk, String type, double lengte) {
		super(merk, type, lengte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String geefAandrijfKracht() {
		// TODO Auto-generated method stub
		return ("windkracht");
	}

}
