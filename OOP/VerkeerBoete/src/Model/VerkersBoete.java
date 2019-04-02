package Model;

public class VerkersBoete {
	private String naamDader;
	private String kentekenAuto;
	private double bedrag;
	
	public VerkersBoete(String naamDader, String kentekenAuto, double bedrag) {
		super();
		this.naamDader = naamDader;
		this.kentekenAuto = kentekenAuto;
		this.bedrag = bedrag;
	}

	public double getBedrag() {
		return bedrag;
	}

	public void setBedrag(double bedrag) {
		this.bedrag = bedrag;
	}

	@Override
	public String toString() {
		return "VerkersBoete [naamDader=" + naamDader + ", kentekenAuto=" + kentekenAuto + ", bedrag=" + bedrag + "]";
	}
	

}
