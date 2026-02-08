import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * =========================================================
 * MAIN CLASS – UseCase9GroupBogiesByType
 * =========================================================
 *
 * Use Case 9: Group Passenger Bogies by Type
 *
 * Description:
 * Demonstrates how a flat list of bogies
 * can be transformed into grouped data
 * using Collectors.groupingBy().
 *
 * This use case introduces:
 * - groupingBy()
 * - List → Map transformation
 * - Category-based data processing
 *
 * @version 9.0
 * @author Developer
 */
public class UseCase9GroupBogiesByType {

    public static void main(String[] args) {

        System.out.println("=== Use Case 9: Group Bogies by Type ===\n");

        // Create passenger bogies
        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("Sleeper", 74));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("AC Chair", 69));
        bogies.add(new PassengerBogie("First Class", 24));

        // Group bogies by type
        Map<String, List<PassengerBogie>> groupedBogies =
                groupByType(bogies);

        // Display grouped result
        System.out.println("Grouped Bogies:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " -> " + list);
        });
    }

    /**
     * Groups passenger bogies by their type.
     *
     * @param bogies list of passenger bogies
     * @return map of bogie type to list of bogies
     */
    private static Map<String, List<PassengerBogie>> groupByType(
            List<PassengerBogie> bogies
    ) {
        return bogies.stream()
                .collect(Collectors.groupingBy(
                        PassengerBogie::getType
                ));
    }
}