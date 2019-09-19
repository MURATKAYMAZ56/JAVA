package array;
import java.util.Scanner;
public class ArrayOefenen3_4RowOfRandomNumbers {

	public static void main(String[] args) {
		Scanner invoer= new Scanner(System.in);
		System.out.print("Hoeveel getallen wil je genereren?");
		int getalen=invoer.nextInt();
		System.out.print("Wat is het grootste getal dat mag voorkomen?");
		int maxNumOfArray=invoer.nextInt();
		////////console generated array
		System.out.println("array  is"+generateArray(maxNumOfArray, getalen));
		
		gemiddelde(generateArray(maxNumOfArray, getalen));

	}
	
	static int[] generateArray(int max,int lenght) {
		int []generatedArray=new int[lenght];
		//System.out.print("Dit zijn de getallen:");
		for(int i=0;i<lenght;i++) {
			generatedArray[i]=  (int) ((Math.random()*max)+1);
			//System.out.print(" "+generatedArray[i]);
		}
		
		return generatedArray ;
	}
	
	
	static double gemiddelde(int[]array) {
		double total=0;
		for(int i:array) {
			total=total+i;
			
		}
		double gemiddelde= total/array.length;
		System.out.println("The gemiddelde is : "+gemiddelde);
		return gemiddelde;
	}

}
