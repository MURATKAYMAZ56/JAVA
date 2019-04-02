package nl.hva.ict.postkantoor.models;

public class Brief extends Post implements Comparable<Post> {
	private final static double REGISTERED_LETTER_COST = 8.15;
	private final static double LIGHT_WEIGHT_LESSTHAN_20GR_PRIJS = 0.73;// euro
	private final static double LIGHT_WEIGHT_LESSTHAN_20GR = 20;// gram
	private final static double NORMAL_WEIGHT_LESSTHAN_100GR_PRIJS = 2.00;// euro
	private final static double NORMAL_WEIGHT_LESSTHAN_100GR = 100;// gram
	private final static double HEAVY_WEIGHT_MORETHAN_100GR_PRIJS = 3.00;// euro

	public Brief(int gewicht, boolean aangetekend, NAW naw) {
		super(naw, gewicht, aangetekend);
		// TODO Auto-generated constructor stub

	}

	@Override
	public double berekenPrijs() {
		// TODO Auto-generated method stub

		if (isAangetekend()) {
			return REGISTERED_LETTER_COST;

		}
		if (getGewicht() < LIGHT_WEIGHT_LESSTHAN_20GR) {
			return LIGHT_WEIGHT_LESSTHAN_20GR_PRIJS;
		}
		if (getGewicht() > NORMAL_WEIGHT_LESSTHAN_100GR) {
			return HEAVY_WEIGHT_MORETHAN_100GR_PRIJS;
		} else {
			return NORMAL_WEIGHT_LESSTHAN_100GR_PRIJS;
		}
	}

	@Override
	public String toString() {
		return "----BRIEF---"+super.toString();
	}

	// Brief brief;

//    brief = new Brief(20, false, new NAW("Dennis Breuker", "Wibautstraat", 2, "1091 GM", "Amsterdam"));
//    zending.add(brief);
//    System.out.println(brief);

}
