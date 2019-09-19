package model;

public class ElektrischeAuto extends Auto {
	private boolean zelfSturend;
	private int batterijNiveau;
	private String softwareVersie;

	public ElektrischeAuto(boolean zelfSturend, int batterijNiveau, String softwareVersie, String merk, String kenteken,
			int bouwjaar, int gewicht, Eigenaar eigenaar) {
		super(merk, kenteken, bouwjaar, gewicht, eigenaar);
		this.zelfSturend = zelfSturend;
		this.batterijNiveau = batterijNiveau;
		this.softwareVersie = softwareVersie;
		
		
	}

	@Override
	public boolean isSchoon() {
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		//sb=sb.append("-----stap2---\n");
		sb=sb.append(super.toString());
		sb=sb.append("   ZelfSturend : "+zelfSturend+"\n");
		sb=sb.append("   BatterijNiveau : "+batterijNiveau+"\n");
		sb=sb.append("   SoftwareVersie : "+softwareVersie+"\n");
		return sb.toString();
	}

}
