/**
 * =========================================================
 * MAIN CLASS – UseCase20DefensiveSearch
 * =========================================================
 *
 * Use Case 20: Defensive Search on Empty Train
 *
 * Description:
 * Demonstrates how the system protects
 * itself from invalid search operations
 * when no data is available.
 *
 * This use case introduces:
 * - Defensive programming
 * - IllegalStateException
 * - Fail-fast behavior
 *
 * @version 20.0
 * @author Developer
 */
public class UseCase20DefensiveSearch {

    public static void main(String[] args) {

        System.out.println("=== Use Case 20: Defensive Search ===\n");

        // Empty train consist
        String[] bogieIds = {};

        try {
            boolean found = safeSearch(bogieIds, "BG101");
            System.out.println("Found? " + found);

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Performs a defensive search operation.
     *
     * @param bogieIds array of bogie IDs
     * @param searchId bogie ID to search
     * @return true if found
     * @throws IllegalStateException if no bogies exist
     */
    private static boolean safeSearch(
            String[] bogieIds,
            String searchId
    ) {
        if (bogieIds.length == 0) {
            throw new IllegalStateException(
                    "No bogies available in the train"
            );
        }

        // Linear search (reuse known logic)
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }
        return false;
    }
}