package model;

public class SingleMeting extends Meting {

	private double waarde;

	public SingleMeting(double waarde) {
		this(waarde,null,null);
	}

	public SingleMeting(double waarde, String naam, String opmerking) {
		super(naam, opmerking);
		this.waarde = waarde;
	}
//5.0: Het was een zonnige dag | Flip
	@Override
	public String toString() {
		
		
		return String.format("%.1f : %s", this.waarde,super.toString());
	}

}

