package model;

import java.util.ArrayList;

public class MeetStation {
	private final static String GEEN_BESCHRIVING = " Geen Beschriving";
	private ArrayList<Meting> metingen;
	private String beschriving;
	private int totaal;

	public MeetStation() {
		this.beschriving = GEEN_BESCHRIVING;
	}

	public MeetStation(String beschriving) {
		this.beschriving = beschriving;
		this.metingen = new ArrayList<>();

	}

	public void toonRapport() {
		
		
		/*Rapportage: Temperaturen in zone X
Totaal aantal metingen: 10
5.5 gemiddeld over 4 waarden:
5.0: Het was een zonnige dag | Flip
5.5 gemiddeld over 4 waarden: Het was mistig | Jaap
6.0:
Rapportage: GEEN BESCHRIJVING
Totaal aantal metingen: 10
5.5 gemiddeld over 4 waarden:
5.0: Het was een zonnige dag | Flip
5.5 gemiddeld over 4 waarden: Het was mistig | Jaap
6.0:*/
		StringBuilder sb= new StringBuilder();
		//sb=sb.append("Rapportage:%s\n Total aantal metingen %d ",this.beschriving,this.totaal);
		sb.append("Rapportage : ").append(this.beschriving+"\n");
		sb.append("Total aantal metingen ").append(this.totaal+"\n");
		for(Meting meting: metingen) {
			sb.append(meting+"\n");
		}
		System.out.println(sb);

	}

	public MeetStation voegMetingToe(Meting meting) {
		if(meting!=null) {
			this.metingen.add(meting);
			increaseTotal(meting);
		}
		return this;
		
}
	private void increaseTotal(Meting meting) {
		if(meting instanceof SingleMeting) {
			totaal++;
		}else if(meting instanceof Multimeting) {
			totaal+=((Multimeting)meting).getAantalMetingen();
		}
	}
}
