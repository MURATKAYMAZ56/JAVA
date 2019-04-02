package model;

import java.util.Comparator;

/**
 * Containing the simple sort algorithms.
 * Currently only selectionsort is implemented.
 * 
 * @author Nico Tromp
 */
public class Sort {
    
    public static void selectionSort(Student[] students) {
        for (int selection = 0; selection < students.length - 1; selection++) {
            int smallest = selection;
            for (int selector = selection + 1; selector < students.length; selector++) {
                if (students[selector].compareTo(students[smallest]) < 0) {
                    smallest = selector;
                }
            }
            swap(students, selection, smallest);
        }
    }

    public static void selectionSort(Student[] students, Comparator<Student> comp) {
        for (int selection = 0; selection < students.length - 1; selection++) {
            int smallest = selection;
            for (int selector = selection + 1; selector < students.length; selector++) {
                if (comp.compare(students[selector],students[smallest]) < 0) {
                    smallest = selector;
                }
            }
            swap(students, selection, smallest);
        }
    }
    
    public static void insertionSort(Student[] students) { 
        int n = students.length; 
        for (int i = 1; i < n; i++) { 
            Student key = students[i]; 
            int j = i-1; 
  
            /* Move elements of students[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && students[j].compareTo(key) > 0) { 
                students[j+1] = students[j]; 
                j = j-1; 
            } 
            students[j+1] = key; 
        } 
    } 
    
    public static void insertionSort(Student[] students, Comparator<Student> comp) { 
        int n = students.length; 
        for (int i = 1; i < n; i++) { 
            Student key = students[i]; 
            int j = i-1; 
  
            /* Move elements of students[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && comp.compare(students[j], key) > 0) { 
                students[j+1] = students[j]; 
                j = j-1; 
            } 
            students[j+1] = key; 
        } 
    } 
    
    
    
    private static void swap(Student[] students, int target, int source) {
        Student temp = students[source];
        students[source] = students[target];
        students[target] = temp;
    }
}
