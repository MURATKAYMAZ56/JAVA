package sortTypes;

public class SortMain {

	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };

		/// SElECTION SORT
		SelectionSort ob = new SelectionSort();

		ob.selectionSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);

		//////////// MERGE SORT//////
		int arrM[] = { 64, 25, 12, 22, 11 };
		MergeSort mergeObject = new MergeSort();
		System.out.println("Given Array to use merge sort");
		mergeObject.printArray(arrM);

		mergeObject.sort(arrM, 0, arrM.length - 1);

		System.out.println("\nSorted array after merge sort");
		mergeObject.printArray(arrM);

		///////// QUICK SORT//////
		QuickSort quickObject = new QuickSort();
		int arrQ[] = { 10, 7, 8, 9, 1, 5 };
		System.out.println("array to be sort by QUICK SORT" );
		quickObject.printArray(arrQ);
		
		int n = arrQ.length;

		quickObject.sort(arrQ, 0, n - 1);

		System.out.println("sorted array");
		quickObject.printArray(arrQ);
	}

}
