package SortTipleri;

public class SelectionSort {
	public static int[] selectionSort(int[] A, int n) {
		int temp;
		int min;
		for (int i = 0; i < n - 1; i++) {
			min = i;
			for (int j = i; j < n; j++) {
				if (A[j] < A[min]) {
					min = j;

				}
			}
			temp=A[i];
			A[i]=A[min];
			A[min]=temp;

		}
		return A;
	}

}
