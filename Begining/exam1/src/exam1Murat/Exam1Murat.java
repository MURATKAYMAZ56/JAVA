package exam1Murat;

import java.util.Scanner;



public class Exam1Murat {
	static int[] lokaalArray = new int[5];
	 static String [] lokaalNames=new String[] {"TTH 5A19","TTH 5A23","TTH 5A30","KSH 4A18","KSH 4A23"};
	

	static int TTH5A19, TTH5A23, TTH5A30, KSH4A18, KSH4A23;
  
	public static void main(String[] args) {
		
		//   System.out.println(berekenBezettingsgraad(32,12));
		System.out.println("Dit programma is gemakt door Murat Kaymaz, stdntnr=500816865, C14,");
		System.out.println("Geef per lokaal het aantal personen.");
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<5;i++ ){
			System.out.print(lokaalNames[i]+" : ");
			lokaalArray[i]=input.nextInt();
			if(lokaalArray[i]<0) {
				System.out.println("Ongeldige invoer");
				i=i-1;
			}
		}

		printOutcomes();
			
		}
	static void printOutcomes() {
		
		System.out.println("Informatie over de bezetting per lokaal");
		System.out.println("Lokaal          personen     bezettigsgraad");
		for(int i=0;i<5;i++) {
			double  percentage =berekenBezettingsgraad(32,lokaalArray[i]);
			if(percentage==0) {
				System.out.println(lokaalNames[i]+"            "+lokaalArray[i]+"              "+percentage+"                  lokaal was te leeg");
			}else if(percentage>100) {
				System.out.println(lokaalNames[i]+"            "+lokaalArray[i]+"              "+percentage+"                  lokaal was te vol");
			}else {
				System.out.println(lokaalNames[i]+"            "+lokaalArray[i]+"             "+percentage);
			}
			
		}
		System.out.println("Gemiddeld aantal personen per lokaal:  "+berekenGemiddeldeBezetting( lokaalArray));
		
		
	}
	public static double berekenBezettingsgraad(int maxCapaciteit,int aantalPersonen) {
		
		double percentage= (aantalPersonen*100)/maxCapaciteit;
		
		return percentage;
	}
	public static double berekenGemiddeldeBezetting(int[] array) {
		int sum=0;
		for(int i=0;i<5;i++) {
			sum=sum+array[i];
			
		}
		double avarage=sum/5;
		
		
		return avarage;
	}

	}


