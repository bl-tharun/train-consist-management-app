import java.util.Arrays;

/**
 * =========================================================
 * MAIN CLASS – UseCase16BubbleSortCapacities
 * =========================================================
 *
 * Use Case 16: Sort Bogie Capacities Using Bubble Sort
 *
 * Description:
 * Demonstrates manual sorting of
 * passenger bogie capacities using
 * the Bubble Sort algorithm.
 *
 * This use case introduces:
 * - Arrays
 * - Nested loops
 * - Manual swapping
 * - O(n²) time complexity
 *
 * @version 16.0
 * @author Developer
 */
public class UseCase16BubbleSortCapacities {

    public static void main(String[] args) {

        System.out.println("=== Use Case 16: Bubble Sort Capacities ===\n");

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 80, 40};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(capacities));

        // Perform bubble sort
        bubbleSort(capacities);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(capacities));
    }

    /**
     * Sorts an integer array using
     * Bubble Sort algorithm.
     *
     * @param array array to sort
     */
    private static void bubbleSort(int[] array) {

        int n = array.length;

        // Outer loop controls number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop compares adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if elements are out of order
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}