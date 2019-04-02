package recursie;

public class ArrayMethoden {
	static int index = 0;
	private static int maxValue;

	public static int vind(int[] haystack, int needle) {
		return vind(haystack, needle, 0);
	}

	// De stiekeme staart!
	private static int vind(int[] haystack, int needle, int index) {
		if (index > haystack.length - 1) {
			return -1; // was niet aanwezig
		} else if (haystack[index] == needle) {
			return index; // gevonden!
		}
		return vind(haystack, needle, ++index); // verder zoeken
	}

	public static int maxValue(int[] array) {
		
		if (index > array.length - 1) {
			return -1; // was niet aanwezig
		} else if (array[index] > array[index+1]) {
			maxValue=array[index];
			

		}
		index++;

		return maxValue(array);
	}

}
