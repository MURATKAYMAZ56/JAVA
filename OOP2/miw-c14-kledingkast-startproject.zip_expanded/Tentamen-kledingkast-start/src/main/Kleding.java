package main;

public class Kleding {
	private String typeKleding;
	private String kleur;
	private double gewicht;
	
	public Kleding(String typeKleding, String kleur, double gewicht) {
		super();
		this.typeKleding = typeKleding;
		this.kleur = kleur;
		this.gewicht = gewicht;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %.1f", this.typeKleding, this.kleur, this.gewicht);
	}

	public double getGewicht() {
		return this.gewicht;
	}

}
