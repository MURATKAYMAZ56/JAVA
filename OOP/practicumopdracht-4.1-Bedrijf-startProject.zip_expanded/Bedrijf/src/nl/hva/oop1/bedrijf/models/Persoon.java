package nl.hva.oop1.bedrijf.models;

public abstract class Persoon implements Comparable<Persoon> {
	private String naam;

	public Persoon(String naam) {

		this.naam = naam;
	}

	public abstract double brekenIkomsten();

	public int compareTo(Persoon other) {
		return naam.compareTo(other.naam);
	}

	@Override
	public String toString() {
		return naam;
	}
	

}
