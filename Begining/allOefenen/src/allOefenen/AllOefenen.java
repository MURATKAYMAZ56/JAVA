package allOefenen;
import java.util.Scanner;
public class AllOefenen {
	
	/*
	 * Aim: generating array and finding avarefa and max number and matxhes that >5.5
	 * @Murat
	 * 
	 * */

	public static void main(String[] args) {
		System.out.println("Enter length of array: ");
		Scanner invoer= new Scanner(System.in);
		int arrayLength=invoer.nextInt();
		double []generatedArray=generateArray(arrayLength);
		
		double middle=getMiddle(generatedArray);
		int match=numberOfMatches(generatedArray);
		double maxNumber=highestNumOfArray(generatedArray);
		
		System.out.println("\n The avarage of array  is : "+middle
				+"\n The number of matchest that bigger than 5.5 is "+match
				+"\n The max number of array is "+maxNumber);;
	

	}
	//generating array
	static double[] generateArray(int length) {
		double[]myArray= new double[length];
		for(int i=0;i<length;i++) {
			myArray[i]= Math.random()*10;
			System.out.printf(" %2f",myArray[i]);
		}
		return myArray;
	}

	
	//Write a getMiddle method that returns the average of an array of decimal set.
	static double getMiddle(double []array) {
		double total = 0;
		for(double num :array) {
			total=total+num;
		};
		double getMiddel=total/array.length;
		
		return getMiddel;
	}
	
	//Write a method get Number of Matches that return the number 
	//of numbers> = 5.5 in an array of comma numbers.
	static  int numberOfMatches(double []array) {
		int matches=0;
		for(double num :array) {
			if(num>5.5) {
				matches++;
			}
		}
		
		return matches;
	}
	//Write a method get HighestCode that returns the 
	//highest number of an array of decimal set.
	static double highestNumOfArray(double []array) {
		double maxNum=0;
		for(double num:array) {
			if(num>maxNum) {
				maxNum=num;
				
			}
		}
		return maxNum;
	}

}
