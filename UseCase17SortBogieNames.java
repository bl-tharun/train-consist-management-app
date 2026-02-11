import java.util.Arrays;

/**
 * =========================================================
 * MAIN CLASS – UseCase17SortBogieNames
 * =========================================================
 *
 * Use Case 17: Sort Bogie Names Alphabetically
 *
 * Description:
 * Demonstrates how Java's built-in
 * Arrays.sort() method can be used
 * to sort data efficiently.
 *
 * This use case introduces:
 * - Arrays.sort()
 * - Natural ordering
 * - Library-based optimization
 *
 * @version 17.0
 * @author Developer
 */
public class UseCase17SortBogieNames {

    public static void main(String[] args) {

        System.out.println("=== Use Case 17: Sort Bogie Names ===\n");

        // Bogie names (unsorted)
        String[] bogieTypes = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        // Sort using built-in method
        Arrays.sort(bogieTypes);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieTypes));
    }
}