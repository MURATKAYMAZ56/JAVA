package recursifeBAsic;

public class ArrayGemiddelde {

	public static double recursie(int[] array1) {
		return recursie(array1, 0) / array1.length;
	}

	private static double recursie(int[] array1, int i) {
		if(i >= array1.length - 1 ) {
			return array1[i];
		}
		return array1[i] + recursie(array1, i + 1);
	}

	/* -------------------------TAIL----------------------------- */
	public static double tailRecursie(int[] array1) {
		return tailRecursie(array1, 0, 0) / array1.length;
	}

	private static double tailRecursie(int[] array1, int acc, int i) {
		if(i > array1.length - 1 ) {
			return acc; // totaal / array1.length;
		}
		return tailRecursie(array1, (acc + array1[i++]), i); // berekening met accumulator meegeven
	}

}
