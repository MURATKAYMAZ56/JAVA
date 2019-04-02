import java.util.ArrayList;

public class ExperementialNumberList {

	private int numberList[];
	private int numberOfElement;
	// int min;
	// int max;

	/*
	 * a. Create a new Java project in Eclipse containing a launcher with the main
	 * method () and a class called ExperimentalNumberList. The class has a
	 * numberList attribute of it type int []. In the constructor of the class you
	 * have to be able to count the size of the list of numbers and then you have to
	 * initialize the numberList array. It is useful to also have an attribute
	 * numberOfElements and also a maximumValue and minimumValue attribute.
	 */
	public ExperementialNumberList(int numberOfElement) {
		this.numberOfElement = numberOfElement;
		numberList = new int[numberOfElement];
		/// numberOfElement = 0;

	}

	/*
	 * b. Write a method generateNumbers (int min, int max) that fills the list with
	 * random whole numbers that are not less than the minimum and no greater than
	 * the maximum. Make it this method assigns the attributes maximumValue and
	 * minimumValue the correct value.
	 */
	public void generateNumbers(int min, int max) {
		int startValue = 0;
		while (startValue < numberOfElement) {
			int randomNum = min + (int) (Math.random() * max);
			numberList[startValue] = randomNum;
			startValue++;
		}

	}

	/*
	 * c. Write a boolean equalValuesExist () method that checks for two numbers in
	 * the list equal values ​​(double values).
	 */

	public boolean equalValuesExist() {
		for (int i = 0; i < numberList.length; i++) {
			for (int j = 0; j < numberList.length; j++) {
				if (numberList[i] == numberList[j]) {
					// System.out.println("equal value : "+numberList[i]);
					return true;
				}
			}
		}
		return false;
	}

	// 2 - a. Write a method int countPositives () that counts the number of
	// positive
	// numbers in the list.

	public int countPositives() {
		for (int i = 0; i < numberList.length; i++) {
			System.out.println(numberList[i]);
		}
		int positiveNumbers = 0;
		for (int i = 0; i < numberList.length; i++) {
			System.out.println("i am in for here numberList[i] "+numberList[i]);
			if (numberList[i] > 0) {
				System.out.println("i am here");
				positiveNumbers++;
			}
		}

		return positiveNumbers;
	}

	// 2 - b. Write an int sumOfPositives () method that determines the sum of all
	// positive numbers in the list.
	public int sumOfPositives() {
		int sumOFPositiveNumbers = 0;
		for (int i = 0; i < numberList.length; i++) {
			if (numberList[i] > 0) {
				sumOFPositiveNumbers += numberList[i];
			}
		}
		return 0;
	}
	// 2- c. Write a method int maxValue () that returns the highest number in the
	// list.

	public int maxValue() {
		int maxValue = numberList[0];
		for (int i = 0; i < numberList.length; i++) {
			if (numberList[i] > maxValue) {
				maxValue = numberList[i];
			}
		}

		return maxValue;
	}

	// 2- d. Write an int numberOfDifferentValues ​​() method that contains the
	// number of different numbers in the
	// return list.

	public int numberOfDifferentValues() {
		int findSameValue = 0;

		for (int i = 0; i < numberList.length; i++) {
			for (int j = 0; j < numberList.length; j++) {
				if (numberList[i] == numberList[j]) {
					findSameValue++;

				}
			}
		}

		return numberList.length - findSameValue;

	}
	// 2- e. Write a method boolean isLocalMaximum (int i) that of a number on index
	// i in the array
	// determines whether this is greater than all its predecessors (all numbers
	// with a lower index).

	public boolean isLocalMaximum(int index) {
		for (int i = 0; i < index; i++) {
			if (numberList[i] > numberList[index]) {
				return false;
			}
		}

		return true;
	}

	// 2 - f. Write an int [] locationOfLocalMaximum () method that contains the
	// places
	// (indexes) in the array
	// determines where there is a local maximum (a number that is larger than all
	// its predecessors).
	// The method returns the indexes in the form of an array.

	public int[] locationOfLocalMaximum() {
		ArrayList<Integer> localMaximums = new ArrayList<>();

		for (int i = 0; i < numberList.length; i++) {
			if (isLocalMaximum(i)) {
				localMaximums.add(i);

			}
		}
		int localMaximumsIndexArray[] = new int[localMaximums.size()];
		for (int i = 0; i < localMaximumsIndexArray.length; i++) {
			localMaximumsIndexArray[i] = localMaximums.get(i);
		}

		return localMaximumsIndexArray;
	}

	// g. Write an int numberOfLocalMaximum () method that returns the number of
	// local maximums.
	public int numberOfLocalMaximum() {
		int numberofLocalMaximun = locationOfLocalMaximum().length;
		return numberofLocalMaximun;
	}
	@Override
	public String toString() {
		System.out.println("call me");
		 System.out.printf("simple integer: %d%n", 10000L);
		return String.format("nimber of positive numbers : %1.f ", countPositives());
	}

	public void showListElement() {
		if (equalValuesExist()) {
			System.out.println("equal values exist");
		} else {
			System.out.println("geen equal values ");

		}
		for (int i = 0; i < numberList.length; i++) {
			System.out.println(numberList[i]);
		}
	}
}
