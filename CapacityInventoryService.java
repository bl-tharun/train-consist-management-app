import java.util.HashMap;
import java.util.Map;

/**
 * =========================================================
 * CLASS – CapacityInventoryService
 * =========================================================
 *
 * Use Case 6: Map Bogies to Capacity
 *
 * Description:
 * This service maintains capacity information
 * for each bogie type using a key–value structure.
 *
 * Bogie type → Capacity
 *
 * This introduces the Map interface and
 * HashMap implementation.
 *
 * @version 6.0
 */
public class CapacityInventoryService {

    // HashMap enables fast lookup using bogie type
    private Map<String, Integer> capacityMap = new HashMap<>();

    /**
     * Registers capacity for a bogie type.
     *
     * @param bogieType type of bogie
     * @param capacity seating or load capacity
     */
    public void registerCapacity(String bogieType, int capacity) {
        capacityMap.put(bogieType, capacity);
    }

    /**
     * Retrieves capacity for a bogie type.
     *
     * @param bogieType type of bogie
     * @return capacity or null if not found
     */
    public Integer getCapacity(String bogieType) {
        return capacityMap.get(bogieType);
    }

    /**
     * Displays all bogie capacities.
     */
    public void displayCapacities() {
        System.out.println("Bogie Capacity Mapping:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}