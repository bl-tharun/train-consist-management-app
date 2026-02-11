/**
 * =========================================================
 * MAIN CLASS – UseCase18LinearSearchBogieId
 * =========================================================
 *
 * Use Case 18: Linear Search for Bogie ID
 *
 * Description:
 * Demonstrates how a bogie ID can be
 * searched in an unsorted collection
 * using linear search.
 *
 * This use case introduces:
 * - Sequential traversal
 * - Early termination
 * - O(n) time complexity
 *
 * @version 18.0
 * @author Developer
 */
public class UseCase18LinearSearchBogieId {

    public static void main(String[] args) {

        System.out.println("=== Use Case 18: Linear Search ===\n");

        // Unsorted bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG105",
                "BG102",
                "BG110",
                "BG103"
        };

        String searchId = "BG110";

        boolean found = linearSearch(bogieIds, searchId);

        System.out.println("Searching for: " + searchId);
        System.out.println("Found? " + found);
    }

    /**
     * Performs linear search on an array.
     *
     * @param array array of bogie IDs
     * @param key bogie ID to search
     * @return true if found, false otherwise
     */
    private static boolean linearSearch(
            String[] array,
            String key
    ) {
        for (String id : array) {
            if (id.equals(key)) {
                return true; // early exit
            }
        }
        return false;
    }
}