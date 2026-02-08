import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =========================================================
 * MAIN CLASS – UseCase8FilterBogiesUsingStreams
 * =========================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * Demonstrates how collections can be
 * queried using the Stream API.
 *
 * This use case introduces:
 * - stream()
 * - filter()
 * - collect()
 *
 * The original list remains unchanged.
 *
 * @version 8.0
 * @author Developer
 */
public class UseCase8FilterBogiesUsingStreams {

    public static void main(String[] args) {

        System.out.println("=== Use Case 8: Filter Bogies Using Streams ===\n");

        // Create passenger bogies
        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 24));

        // Filter bogies with capacity greater than 60
        List<PassengerBogie> filteredBogies =
                filterByCapacity(bogies, 60);

        System.out.println("Filtered Bogies (capacity > 60):");
        System.out.println(filteredBogies);

        // Original list remains unchanged
        System.out.println("Original Bogies:");
        System.out.println(bogies);
    }

    /**
     * Filters bogies whose capacity is
     * greater than the given threshold.
     *
     * @param bogies list of passenger bogies
     * @param minCapacity minimum capacity
     * @return filtered list of bogies
     */
    public static List<PassengerBogie> filterByCapacity(
            List<PassengerBogie> bogies,
            int minCapacity
    ) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > minCapacity)
                .collect(Collectors.toList());
    }
}