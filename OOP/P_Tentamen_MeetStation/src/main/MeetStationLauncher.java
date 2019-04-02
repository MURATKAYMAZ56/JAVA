package main;

import model.MeetStation;
import model.Meting;
import model.Multimeting;
import model.SingleMeting;

public class MeetStationLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("“Dit is het tentamen OOP1 van <Murat> <500816865>“");

SingleMeting sMeting = new SingleMeting(5.003, "Het was een zonnige dag", "Flip" );

//System.out.println(sMeting);

SingleMeting sMetingWaarde = new SingleMeting(6.0);

//System.out.println(sMetingWaarde);
Multimeting mMeting = new Multimeting(new double[]{4, 5, 6, 7}); 

Multimeting mMetingOpmerking = new Multimeting(null, "Het was mistig", "Jaap" );

//System.out.println(mMetingOpmerking);  

MeetStation meetstation = new MeetStation();
meetstation.voegMetingToe(mMeting).voegMetingToe(sMeting).voegMetingToe(mMetingOpmerking).voegMetingToe(sMetingWaarde);
meetstation.toonRapport();


	}

}
