/**
 * =========================================================
 * MAIN CLASS – UseCase6MapBogieCapacity
 * =========================================================
 *
 * Use Case 6: Map Bogie Types to Capacity
 *
 * Description:
 * Demonstrates how bogie attributes
 * (such as capacity) can be stored and
 * retrieved using a Map.
 *
 * This use case introduces:
 * - Map interface
 * - HashMap implementation
 * - Key–value based lookup
 *
 * @version 6.0
 * @author Developer
 */
public class UseCase6MapBogieCapacity {

    public static void main(String[] args) {

        System.out.println("=== Use Case 6: Bogie Capacity Mapping ===\n");

        // Initialize capacity inventory service
        CapacityInventoryService inventoryService =
                new CapacityInventoryService();

        // Register capacities
        inventoryService.registerCapacity("Sleeper", 72);
        inventoryService.registerCapacity("AC Chair", 56);
        inventoryService.registerCapacity("First Class", 24);

        // Display all capacities
        inventoryService.displayCapacities();

        // Lookup capacity for a specific bogie
        System.out.println(
            "Sleeper Capacity: " +
            inventoryService.getCapacity("Sleeper")
        );
    }
}