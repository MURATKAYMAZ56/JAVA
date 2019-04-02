package recursifeBAsic;

public class ArrayMethoden {

	public static int vind(int[] haystack, int needle) {
		return vind(haystack, needle, 0);
	}

	// De stiekeme staart!
	private static int vind(int[] haystack, int needle, int index) {
		if( index > haystack.length - 1) {
			return -1; // was niet aanwezig
		} else if (haystack[index] == needle) {
			return index; // gevonden!
		}
		return vind(haystack, needle, ++index); // verder zoeken
	}

}
