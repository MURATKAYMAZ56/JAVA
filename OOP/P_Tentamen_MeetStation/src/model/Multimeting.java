package model;

public class Multimeting extends Meting {
	private final static int LEGE_ARRAY = 0;
	private double gemiddelde;
	private int aantalMetingen;
	private double[] waarden;

	public Multimeting(double[] waarden) {
		this(waarden, null, null);

	}

	public Multimeting(double[] waarden, String naam, String opmerking) {
		super(naam, opmerking);
		waarden=ifEmptyArrayCreated(waarden);
		this.waarden = waarden;
		this.aantalMetingen = waarden.length;
		double tempGemiddel = gemiddeldeWithWaarden(waarden);
		this.gemiddelde = tempGemiddel;

	}

	private double[] ifEmptyArrayCreated(double[] array) {
		if (array == null) {
			array = new double[LEGE_ARRAY];
		}
		return array;
	}

	private double gemiddeldeWithWaarden(double[] array) {
		double tempGemiddel = 0.0;
		if (array.length > 0) {
			for (double value : array) {
				tempGemiddel +=value;
				//System.out.println(tempGemiddel); //check for correct gemidddled?
			}
			tempGemiddel /= array.length;
		}
		return tempGemiddel;

	}

	public int getAantalMetingen() {
		return aantalMetingen;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb = sb.append(this.gemiddelde).append(" gemiddeld over ").append(waarden.length);
		sb = sb.append(" : ").append(super.toString());
		return sb.toString();

		// String.format("%.1f gemiddeld over %1.f warden : %s",
		// this.gemiddelde,this.waarden.length,super.toString());
	}

}
