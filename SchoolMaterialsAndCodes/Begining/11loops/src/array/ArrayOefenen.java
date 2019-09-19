package array;

import java.util.Scanner;

public class ArrayOefenen {

	public static void main(String[] args) {

		Scanner invoer = new Scanner(System.in);
		System.out.println("Hoeveel cijfers wilt u invoeren?");
		int aantalCijfers = invoer.nextInt();
		double[] aanArray = new double[aantalCijfers];
		for (int n = 1; n < aanArray.length + 1; n++) {
			System.out.print("Cijfer student " + n + " :");
			aanArray[n - 1] =  invoer.nextDouble();
		}
		// System.out.println("array is"+aanArray[]);
	//passing array to method;
		gemiddelde(aanArray);
		///calling max method
		hoogste(aanArray);
		///////voldendes
		voldendes(aanArray);

	}
	//////to calculate average;
	static double gemiddelde(double array[]) {
		double total=0;
		for(double cijfer : array) {
			 total=total+cijfer;
		}
		double gemiddelde=total/array.length;
		//System.out.println("without float"+gemiddelde);
		System.out.printf("Gemiddelde is  %f \n",gemiddelde);
		return gemiddelde;
	}
	/////////////finding Max Numbers
	static double hoogste(double array[]) {
		double max=0;
		for (double index:array) {
			if(max<index) {
				max=index;
			}
			
		};
		
		System.out.println("The maxNumber is "+max);
		return max;
	}
	////Aantal voldoendes whic is >5.5
	
	static int voldendes( double array[]) {
		int voldende=0;
		for(double index:array) {
			if(index>5.5) {
				voldende++;
			}
		}
		System.out.println("Aantal voldoendes is "+voldende);
		System.out.println("Aantal cijfers "+ array.length);
		return voldende;
		
	};
	/////////////////////

}
