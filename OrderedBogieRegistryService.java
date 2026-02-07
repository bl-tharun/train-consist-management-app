import java.util.SortedSet;
import java.util.TreeSet;

/**
 * =========================================================
 * CLASS – OrderedBogieRegistryService
 * =========================================================
 *
 * Use Case 4: Maintain Ordered Bogie IDs
 *
 * Description:
 * This service extends the idea of bogie
 * registration by maintaining bogie IDs
 * in sorted order.
 *
 * Unlike HashSet, TreeSet enforces:
 * - Uniqueness
 * - Natural ordering
 *
 * @version 4.0
 */
public class OrderedBogieRegistryService {

    // TreeSet enforces uniqueness + sorted order
    private SortedSet<String> bogieIds = new TreeSet<>();

    /**
     * Registers a bogie ID.
     *
     * @param bogieId unique bogie identifier
     * @return true if added, false if duplicate
     */
    public boolean registerBogie(String bogieId) {
        return bogieIds.add(bogieId);
    }

    /**
     * Displays bogie IDs in sorted order.
     */
    public void displayOrderedBogies() {
        System.out.println("Ordered Bogie IDs: " + bogieIds);
    }
}