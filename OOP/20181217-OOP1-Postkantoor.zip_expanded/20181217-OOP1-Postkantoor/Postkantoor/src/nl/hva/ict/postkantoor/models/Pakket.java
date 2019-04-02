package nl.hva.ict.postkantoor.models;

public class Pakket extends Post implements Comparable<Post> {
	private boolean pastInBrievenbus;
	private final static double  REGISTERED_LETTER_COST = 8.15;
	private final static double pakketCostInMailButnotRegistered = 3.95;
	private final static double GEWICHT=10;
	private final static double LIGHT_REGISTERED_COST=8.60;
	private final static double NOT_INBRIEVEVBUS_LIGHT_PRIJS=6.95;
	private final static double HEAVY_REGISTERED_COST=14.90;
	private final static double NOT_INBRIEVEVBUS_HEAVY_PRIJS=13.25;

	public Pakket(boolean pastInBrievenbus, int gewicht, boolean aangetekend, NAW naw) {
		super(naw, gewicht, aangetekend);
		this.pastInBrievenbus = pastInBrievenbus;

	}

	@Override
	public double berekenPrijs() {
		// TODO Auto-generated method stub
		
		if (pastInBrievenbus) {
			if (isAangetekend()) {
				return  REGISTERED_LETTER_COST;

			} else {
				return pakketCostInMailButnotRegistered;
			}

		} else if(getGewicht()<GEWICHT) {
			if(isAangetekend()) {
				return LIGHT_REGISTERED_COST;
			}else {
				return NOT_INBRIEVEVBUS_LIGHT_PRIJS;
			}
			
			
			}else if(getGewicht()>GEWICHT) {
				if(isAangetekend()) {
					return HEAVY_REGISTERED_COST;
				}
			}else {
				return NOT_INBRIEVEVBUS_HEAVY_PRIJS;
			}
		return 0;
		}
		

	@Override
	public String toString() {
		return "----PAKKET----\n"+super.toString();
	}
	
	

}
