package Model;

public class ParkeerBoete extends VerkersBoete {
	private int zone;

	public ParkeerBoete(String naamDader, String kentekenAuto, int zone) {
		super(naamDader, kentekenAuto);
		this.zone=zone;
		//this.naamDader=naamDader;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}
	public void bepaalBedrag() {
		int bedrag;
		if(zone==1) {
			bedrag=60;
		}else if(zone==2) {
			bedrag=100;
		}else{
			bedrag=180;
		}
		
	}

	@Override
	public String toString() {
		return "ParkeerBoete voor" +naamDader+ "[zone=" + zone + ", getZone()=" + getZone() 
		+ ", getBedrag()=" + getBedrag() + "]";
	}

}
