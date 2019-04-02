package main;

import model.Auto;
import model.Fiets;
import model.Koets;
import model.Motorboot;
import model.Vervoermiddel;
import model.Zeilboot;

public class VervoermiddelenLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vervoermiddel[] vervoermiddelen = new Vervoermiddel[5];
		vervoermiddelen[0] = new Koets("Glinkowski", "marathonwagen", 320, 2);
		vervoermiddelen[1] = new Auto("Dacia", "Logan", 1150, "benzine");
		vervoermiddelen[2] = new Fiets("Koga Mijata", "Colmaro Race Ultegra", 9);
		vervoermiddelen[3] = new Zeilboot("Dufour", "36 Classic", 11.5);
		vervoermiddelen[4] = new Motorboot("Broesder", "Kotter", 13.75, "diesel");
		System.out.println("BElasting calculating test for Auto class ; "+vervoermiddelen[1].getVervoerBelsating());
		System.out.println("BElasting calculating test for Motorboot class ; "+vervoermiddelen[4].getVervoerBelsating());
		
		for(Vervoermiddel v:vervoermiddelen) {
//			if(v instanceof Auto|| v instanceof Motorboot) {
//				System.out.println(v+v.getVervoerBelsating());
//			}
			System.out.println(v);
		}
		

	}

}
