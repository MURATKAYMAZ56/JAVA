package driver;

import java.util.ArrayList;

import java.util.Collections;

import model.Auto;
import model.BrandstofAuto;
import model.Eigenaar;
import model.ElektrischeAuto;

/**
 *
 * @author Karel Pieterson en Peter van Diepen
 */
public class Milieuzone {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Welkom bij de milieuzone checker.");
		System.out.println("\nDit programma geeft aan of een auto de milieuzone in mag.");

		ArrayList<Auto> autos = new ArrayList<>();

		autos.add(new Auto("Onbekend", null, 2001, 200, new Eigenaar("Onbekend", false)));
		autos.add(new Auto("Export", "00AAA0", 2012, 280, new Eigenaar("Onbekend", false)));
		autos.add(new Auto(null, null, -1, -1, null));
		autos.add(new Auto("Gesloopt", null, 1963, 210, null));

		printAutos(autos);

		// Test stap 2
		autos.add(new ElektrischeAuto(false, 80, "3.2.1.A", "Opel Ampera", "GB073V", 2014, 2410,
				new Eigenaar("Adidas", true)));
		autos.add(new ElektrischeAuto(true, 100, "153", "Google", "GG666L", 2013, 2380, new Eigenaar("Google", true)));
		autos.add(new ElektrischeAuto(false, 15, "1.1", "Smart Electric Drive", "HL123P", 2012, 2095,
				new Eigenaar("P. van Vuuren", false)));
		autos.add(new ElektrischeAuto(true, 80, "onbekend", "Tesla S", "HP924G", 2013, 3450,
				new Eigenaar("R. Gevers", false)));

		printAutos(autos);

		// Test stap 3
		autos.add(
				new BrandstofAuto("diesel", 250, "Mercedes Vito", "VV332P", 2005, 2300, (new Eigenaar("Hema", true))));
		autos.add(new BrandstofAuto("benzine", 250, "Opel Omega", "71JLPF", 2002, 1660,
				(new Eigenaar("J. Jansen", false))));
		autos.add(new BrandstofAuto("diesel", 300, "Volvo 240 Polar", "ZL44NR", 1991, 1410,
				(new Eigenaar("Mediamarkt", true))));
		autos.add(new BrandstofAuto("gas", 250, "Ford Explorer", "2345PP", 1998, 1560,
				(new Eigenaar("W. Sneijder", false))));

		printAutos(autos);
		//stap-4
		printSchoneAutos(autos);
		//stap-5
		 printBedrijfsautoMetType(autos,"diesel");
		
		//stap-6
		 //it is workinhg but I could not figure out what if eigenaar name  is null
		printAutosOpNaam(autos);
		

		// voeg hieronder je eigen code toe voor stap 4, 5 en 6

	}

	private static void printSchoneAutos(ArrayList<Auto> autos) {
		for (Auto auto : autos) {
			if (auto instanceof ElektrischeAuto) {
				ElektrischeAuto schoneAuto = (ElektrischeAuto) auto;
				// System.out.println("checking method");//to test my method
				System.out.println(schoneAuto);
			} else if (auto instanceof BrandstofAuto) {
				BrandstofAuto schoneAuto = (BrandstofAuto) auto;
				if (schoneAuto.isSchoon()) {
					System.out.println(schoneAuto);
				}
			}
		}

	}

	public static void printBedrijfsautoMetType(ArrayList<Auto> autos, String brandstof) {
		for (Auto auto : autos) {
//			if (auto.getEigenaar().isBedrijf()) {
//				System.out.println("cmpoommmmmm");
//				BrandstofAuto autoDiesel = (BrandstofAuto) auto;
//				if (autoDiesel.getBrandstof().equals("diesel")) {
//					System.out.println(autoDiesel);
//				}
//			}
			if(auto instanceof BrandstofAuto) {
				BrandstofAuto autoBr=(BrandstofAuto)auto;
				if (autoBr.getEigenaar().isBedrijf()) {
					System.out.println(autoBr);
				}
				
			}

		}
		 

	}

	public static void printAutosOpNaam(ArrayList<Auto> autos) {
		Collections.sort(autos);
		for(Auto auto:autos) {
			System.out.println(auto);
		}

	}

	private static void printAutos(ArrayList<Auto> autos) {
		for (Auto auto : autos) {
			System.out.println(auto);
		}
	}

}
