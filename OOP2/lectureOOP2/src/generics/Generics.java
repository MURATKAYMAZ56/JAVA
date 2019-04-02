package generics;

public class Generics {

//generic method printArray
	public static <E> void printingArray(E[] inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();

	}

	public static void main(String[] args) {
		// create array of integer, double, and character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.2, 2.3, 3.4, 4.5 };
		Character[] characterArray = { 'h', 'i' }; /// {"h","i"}=> this is string type not character

		System.out.println("integerArray : ");
		printingArray(intArray);
		System.out.println("doubleArray : ");
		printingArray(doubleArray);
		System.out.println("character array : ");
		printingArray(characterArray);

		/////////////// findng maxnumber with gee=nerics
		System.out.println("///////using generic to get max number////////");
		System.out.println("max is : " + findingMaximumNumberWithGenericsType(2, 3, 5));
	}

	public static <T extends Comparable<T>> T findingMaximumNumberWithGenericsType(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;

	}

}
