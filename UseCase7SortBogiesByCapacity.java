import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS – UseCase7SortBogiesByCapacity
 * =========================================================
 *
 * Use Case 7: Sort Passenger Bogies by Capacity
 *
 * Description:
 * Demonstrates how custom objects can
 * be sorted using Comparator.
 *
 * This use case introduces:
 * - Domain objects
 * - Comparator
 * - Separation of data and behavior
 *
 * @version 7.0
 * @author Developer
 */
public class UseCase7SortBogiesByCapacity {

    public static void main(String[] args) {

        System.out.println("=== Use Case 7: Sort Bogies by Capacity ===\n");

        // Create passenger bogies
        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 24));

        System.out.println("Before Sorting:");
        System.out.println(bogies);

        // Sort bogies by capacity
        PassengerBogieSortingService sortingService =
                new PassengerBogieSortingService();

        sortingService.sortByCapacity(bogies);

        System.out.println("After Sorting (by capacity):");
        System.out.println(bogies);
    }
}