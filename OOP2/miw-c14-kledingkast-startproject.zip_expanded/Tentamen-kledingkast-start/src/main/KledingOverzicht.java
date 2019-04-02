package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class KledingOverzicht {
	public static void main(String[] args) {
		System.out.println("<Mahfuz Murat Kaymaz>: <stdntNummer: 500816865 >");

	}

	public void schrijfOverzicht(KledingKast kledingKast, String fileName) {
		try {

			FileWriter fileWriter = new FileWriter(fileName);
			PrintWriter printWriter = new PrintWriter(fileWriter);

			printWriter.println(kledingKast.toString());

			for (KledingLade kledingLade : kledingKast.getLadeLijst()) {
				printWriter.println(" , " + kledingLade.toString());

				for (Kleding kleding : kledingLade.getKledingLijst()) {
					printWriter.println(" ," + kleding.toString());
				}
			}

			printWriter.close();

		} catch (Exception e) {
			System.out.println("file is not found! check the  path!");
			e.printStackTrace();
		}
	}

}
