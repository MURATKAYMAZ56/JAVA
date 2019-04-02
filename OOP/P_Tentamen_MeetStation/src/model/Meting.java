package model;

public abstract class Meting {
	private String opmerking;
	private String naam;

	public Meting() {
		this("", "");
	}

	public Meting(String naam, String opmerking) {
		this.naam = naam;
		this.opmerking = opmerking;
	}

	@Override
	public String toString() {

		return String.format("%s%s", (this.opmerking == null ? " " : this.opmerking),
				(this.naam == null ? " " : this.naam));
	}

}
