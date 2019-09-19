package nl.hva.oop1.bedrijf.models;

public class Manager extends Werknemer {
	private double bonus;

	public Manager(String naam, double maandsalaris) {
		super(naam, maandsalaris);
		this.bonus=0;
		// TODO Auto-generated constructor stub
	}
	public void kenBonus(double bonus) {
		this.bonus=bonus;
	}
	@Override
	public double brekenIkomsten() {
		// TODO Auto-generated method stub
		return super.brekenIkomsten()+bonus;
	}
	

}
