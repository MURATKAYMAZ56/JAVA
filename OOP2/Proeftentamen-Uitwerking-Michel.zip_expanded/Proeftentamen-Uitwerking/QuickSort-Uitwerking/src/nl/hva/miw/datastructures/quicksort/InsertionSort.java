package nl.hva.miw.datastructures.quicksort;

import java.util.Arrays;

public class InsertionSort {
  /** The method for sorting the numbers */
  public static void insertionSort(int[] list, int first, int last) {
    for (int i = first + 1; i < last; i++) {
      /** insert list[i] into a sorted sublist list[first..i-1] so that
           list[first..i] is sorted. */
      int currentElement = list[i];
      int k;
      for (k = i - 1; k >= first && list[k] > currentElement; k--) {
        list[k + 1] = list[k];
      }

      // Insert the current element into list[k+1]
      list[k + 1] = currentElement;
    }
  }
  
  public static void main(String[] args) {
	  
	  int[] a = new int[] { 3,5,21,4,15,2,17,12,7,9,0,20};
	
	  insertionSort(a, 3, a.length -2);
	  
	  System.out.println("Sorted " + Arrays.toString(a));
	  
  }
  
}

