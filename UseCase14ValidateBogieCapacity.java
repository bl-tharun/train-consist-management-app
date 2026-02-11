/**
 * =========================================================
 * MAIN CLASS – UseCase14ValidateBogieCapacity
 * =========================================================
 *
 * Use Case 14: Handle Invalid Bogie Capacity
 *
 * Description:
 * Demonstrates how invalid bogie
 * capacities are rejected using
 * a custom checked exception.
 *
 * This use case introduces:
 * - Custom exceptions
 * - throw vs throws
 * - Fail-fast validation
 *
 * @version 14.0
 * @author Developer
 */
public class UseCase14ValidateBogieCapacity {

    public static void main(String[] args) {

        System.out.println("=== Use Case 14: Bogie Capacity Validation ===\n");

        PassengerBogieFactory factory =
                new PassengerBogieFactory();

        try {
            // Valid bogie
            PassengerBogie sleeper =
                    factory.create("Sleeper", 72);
            System.out.println("Created: " + sleeper);

            // Invalid bogie
            PassengerBogie invalid =
                    factory.create("AC Chair", 0);
            System.out.println("Created: " + invalid);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}