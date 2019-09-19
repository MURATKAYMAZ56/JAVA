package model;

public class Vuurwerk extends Product {
	private Instructie instructie;

	public Vuurwerk(String naam, double prijs, Instructie instructie) {
		super(naam, prijs);
		this.instructie = instructie;

	}

	@Override
	public boolean islegaal() {
		return instructie != null && instructie.isNederlandstalig();
	}

	public Instructie getInstructie() {
		return instructie;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb = sb.append(super.toString() + "\n");
		sb.append("instructie: ").append(this.instructie+"\n");
		sb.append("Legaal : ").append(islegaal());
		return sb.toString();
	}

}
