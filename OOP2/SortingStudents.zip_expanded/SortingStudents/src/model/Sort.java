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
    public static void selectionSort(Student[] students, Comparator<Student> cmp) {
        for (int selection = 0; selection < students.length - 1; selection++) {
            int smallest = selection;
            for (int selector = selection + 1; selector < students.length; selector++) {
                if (cmp.compare(students[selector], students[smallest]) < 0) {
                    smallest = selector;
                }
            }
            swap(students, selection, smallest);
        }
    }

    private static void swap(Student[] students, int target, int source) {
        Student temp = students[source];
        students[source] = students[target];
        students[target] = temp;
    }
}
