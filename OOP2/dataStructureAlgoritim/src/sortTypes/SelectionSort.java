package sortTypes;

public class SelectionSort {

	// idea of selection sort is, it is getting first index and compare with the
	// rest
	// till the end of array and at the end swap the currentvalue(smallest)one with
	// the first index
	// now start from second index and does the same then swap the last with second
	// index
	// and so on...

	/*
	 * void sort(int arr[]) { int n = arr.length;
	 * 
	 * // One by one move boundary of unsorted subarray for (int i = 0; i < n-1;
	 * i++) { // Find the minimum element in unsorted array int min_idx = i; for
	 * (int j = i+1; j < n; j++) if (arr[j] < arr[min_idx]) min_idx = j;
	 * 
	 * // Swap the found minimum element with the first // element int temp =
	 * arr[min_idx]; arr[min_idx] = arr[i]; arr[i] = temp; }
	 */

	public void selectionSort(int array[]) {
		int i, j;
		int n = array.length;
		for (i = 0; i < n - 1; i++) {
			int min_index = i;
			for (j = i + 1; j < n; j++) {
				if (array[j] < array[min_index]) {
					min_index = j;
				}
			}
			int temp = array[min_index];
			array[min_index] = array[i];
			array[i] = temp;
		}

		// Swap the found minimum element with the first
		// element

	}

	public void swap(int xp, int yp) {
		int temp = xp;
		xp = yp;
		yp = temp;
	}

	public  void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();

	}

}
