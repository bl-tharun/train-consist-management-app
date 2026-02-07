import java.util.HashSet;
import java.util.Set;

/**
 * =========================================================
 * CLASS – BogieRegistryService
 * =========================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This service is responsible for tracking
 * bogie IDs and ensuring uniqueness.
 *
 * It introduces Set-based enforcement
 * without affecting existing train logic.
 *
 * @version 3.0
 */
public class BogieRegistryService {

    // Set enforces uniqueness by design
    private Set<String> registeredBogieIds = new HashSet<>();

    /**
     * Attempts to register a bogie ID.
     *
     * @param bogieId unique bogie identifier
     * @return true if registration succeeds, false if duplicate
     */
    public boolean registerBogie(String bogieId) {
        return registeredBogieIds.add(bogieId);
    }

    /**
     * Displays all registered bogie IDs.
     */
    public void displayRegisteredBogies() {
        System.out.println("Registered Bogie IDs: " + registeredBogieIds);
    }
}