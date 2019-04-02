package nl.hva.ict.postkantoor.models;

public class BuitenlandPakket extends Pakket {
	private boolean inEuropa;
	private final static double IN_EUROPE = 10;// euro to add on normal pakket
	private final static double OUT_EUROPE = 5;// to multiply with normal pakket

	public BuitenlandPakket(boolean inEuropa, boolean pastInBrievenbus, int gewicht, boolean aangetekend, NAW naw) {
		super(pastInBrievenbus, gewicht, aangetekend, naw);
		// TODO Auto-generated constructor stub
		this.inEuropa = inEuropa;
	}

	@Override
	public double berekenPrijs() {
		return (inEuropa) ? super.berekenPrijs() + IN_EUROPE : super.berekenPrijs() * OUT_EUROPE;

	}

}
