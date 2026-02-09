import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS – UseCase10CalculateTotalCapacity
 * =========================================================
 *
 * Use Case 10: Calculate Total Seating Capacity
 *
 * Description:
 * Demonstrates how multiple values can
 * be aggregated into a single result
 * using Stream reduce().
 *
 * This use case introduces:
 * - map()
 * - reduce()
 * - Functional aggregation
 *
 * @version 10.0
 * @author Developer
 */
public class UseCase10CalculateTotalCapacity {

    public static void main(String[] args) {

        System.out.println("=== Use Case 10: Total Seating Capacity ===\n");

        // Create passenger bogies
        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 24));

        // Calculate total seating capacity
        int totalCapacity = calculateTotalCapacity(bogies);

        System.out.println("Total Seating Capacity: " + totalCapacity);
    }

    /**
     * Calculates total seating capacity
     * of all passenger bogies.
     *
     * @param bogies list of passenger bogies
     * @return total seating capacity
     */
    private static int calculateTotalCapacity(
            List<PassengerBogie> bogies
    ) {
        return bogies.stream()
                .map(bogie -> bogie.getCapacity())
                .reduce(0, (total, capacity) -> total + capacity);
    }
}