package model;

public class Vuurpijl extends Vuurwerk {
	private double hoogte;
	private int[] kleurverhoudig;
	private final static String ROOD = "ROOD";
	private final static String GROEN = "GROEN";
	private final static String BLAUW = "BLAUW";
	private final static int MAX_PERCENTAGE = 100;
	private final static int AGE = 16;

	public Vuurpijl(double hoogte, int[] kleurverhouding, String naam, double prijs, Instructie instructie) {
		super(naam, prijs, instructie);
		this.hoogte = hoogte;
		
		// TODO Auto-generated constructor stub
		if(correcteKleurverhouding(kleurverhouding)) {
			this.kleurverhoudig = kleurverhouding;
		}else {
			System.out.println("---->Fout:Onjuiste kleurverhoudig, kleur wordt ROOD");
			this.kleurverhoudig=new int[] {100,0,0};
		}
	}

	private boolean correcteKleurverhouding(int[] kleurverhouding) {

		int totalRatio = 0;
		for (int p : kleurverhouding) {
			totalRatio += p;
		}

		// System.out.println("totoal ratio"+totalRatio);
		return (totalRatio == MAX_PERCENTAGE) ? true : false;

	}

	@Override
	public boolean islegaal() {
		// TODO Auto-generated method stub
		return super.islegaal() && (getInstructie().getLeeftijd() > AGE) ? true : false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder();
		sb=sb.append(super.toString()+"\n").append("hoogte:"+hoogte+"meter \n");
		sb=sb.append("kleuren: \n   "+ROOD+": "+kleurverhoudig[0]+"%");
		sb=sb.append(" \n   "+GROEN+kleurverhoudig[1]+"%");
		sb=sb.append("\n   "+BLAUW+kleurverhoudig[2]+"%");
		
		
		
		
		
		return sb.toString();
	}

}
