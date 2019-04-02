package arrayDOuble;

import java.util.ArrayList;
import java.util.stream.*;

public class DoubleArray {

	public static void main(String[] args) {
		/*
		 * make a list of numbers containing the integers 5, 8, 13, 21 and 34 and the
		 * numbers 3.14, 2.72 and 1.62. Tip: There is an abstract Number in Java class.
		 * a. Let the average calculate the list of numbers. b. Use a loop to show only
		 * the integers. c. Calculate the sum of the broken numbers.
		 */

		ArrayList<Double> doubleArray = new ArrayList<>();
		doubleArray.add(3.14);
		doubleArray.add(2.72);
		doubleArray.add(1.62);
		doubleArray.add((double) 5);
		doubleArray.add((double) 8);
		doubleArray.add((double) 13);
		doubleArray.add((double) 21);
		doubleArray.add((double) 34);
		System.out.println(doubleArray);

		int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// int sum=
		int[] a = { 10, 20, 30, 40, 50 };
		int sum = IntStream.of(a).sum();
		System.out.println("The sum is " + sum);

	}

	public static void avarage(ArrayList<Double> array) {
		// double sum=DoubleStream.of(array).sum();
		//double sum = array.stream().sum();

	}

}
