package Polimorphism;

public class Honden {

	public static void main(String[] args) {
		Hond[] honden = new Hond[7];
		{
			honden[0] = new Hond();
			honden[1] = new Terrier();
			honden[2] = new Herder();
			honden[3] = new JackRussel();
			honden[4] = new Mechels();
			honden[5] = new Norfolk();
			honden[6] = new Duits();
		}
		for(int i=0;i<honden.length;i++) {
			soortSpecifiekeActie(honden[i]);
		}

	}
	public static void soortSpecifiekeActie(Hond hond) {
		if(hond instanceof JackRussel) {
			((JackRussel) hond).pakKonijn();
		}else if(hond instanceof Herder) {
			((Herder)hond).zoek();
			
		}else if(hond instanceof Duits) {
			((Duits)hond).pakBoef();
			
		}else if(hond instanceof Mechels) {
			((Mechels)hond).blaf();
			
		}else if(hond instanceof Norfolk) {
			((Norfolk)hond).bijt();
			
		}else if(hond instanceof Terrier) {
			((Terrier)hond).bijt();
			
		}else {
			hond.blaf();
		}
		
	}

}
