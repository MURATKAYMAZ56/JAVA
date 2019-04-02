package arrayy;

import java.util.ArrayList;
import  java.util.AbstractList ;


public class ArryTolearn {
	public static ArrayList<Integer> arrayInteger = new ArrayList<Integer>();
	

	public static void main(String[] args) {

		// makin arryList of string
		ArrayList<String> myStringArray = new ArrayList<>();
		// “Morgen”, “wordt”, “het”, “mooi” “weer”

		myStringArray.add("Morgen");
		myStringArray.add("wordt");
		myStringArray.add("het");
		myStringArray.add("mooi");
		myStringArray.add("weer");
		// set(int index, E element)
		myStringArray.set(1, "is");
		for (String o : myStringArray) {
			System.out.println(o);

		}

		generatingRandomArrayInt(4, 6);
		System.out.println(arrayInteger);
		System.out.println("avarage of array is = " + calculateAvarage(arrayInteger));

		System.out.println("sum of array items is = " + sumOfListInArray(arrayInteger));
	}

	// generating random integer array
	public static void generatingRandomArrayInt(int aantal, int maximum) {
		
		for (int i = 0; i < aantal; i++) {
			int element = (int) (Math.random() * maximum + 1);
			arrayInteger.add(element);
		}
//		return arrayInteger;
	}

	public static int sumOfListInArray(ArrayList<Integer> array) {
		int sumOfList=0;
		for (int i : array) {
			sumOfList = sumOfList + i;
		}

		return sumOfList;
	}

//	public static ArrayList<Integer> maakRandomRijGetallen(int aantal, int maximum) {
//
//		ArrayList<Integer> randomNummer = new ArrayList<>();
//
//		for (int i = 0; i < aantal; i++) {
//			randomNummer.add((int) (Math.random() * maximum));
//		}
//
//		return randomNummer;
//	}

	public static double calculateAvarage(ArrayList<Integer> array) {
		double avarage = sumOfListInArray(array) / (double) array.size();
		return avarage;
	}

}
