import java.util.Arrays;

/**
 * =========================================================
 * MAIN CLASS – UseCase19BinarySearchBogieId
 * =========================================================
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * Demonstrates how a bogie ID can be
 * searched efficiently using binary
 * search on sorted data.
 *
 * This use case introduces:
 * - Divide-and-conquer strategy
 * - O(log n) time complexity
 * - Search preconditions
 *
 * @version 19.0
 * @author Developer
 */
public class UseCase19BinarySearchBogieId {

    public static void main(String[] args) {

        System.out.println("=== Use Case 19: Binary Search ===\n");

        // Sorted bogie IDs (precondition)
        String[] bogieIds = {
                "BG101",
                "BG102",
                "BG103",
                "BG105",
                "BG110"
        };

        String searchId = "BG105";

        boolean found = binarySearch(bogieIds, searchId);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        System.out.println("\nSearching for: " + searchId);
        System.out.println("Found? " + found);
    }

    /**
     * Performs binary search on a sorted array.
     *
     * @param array sorted array of bogie IDs
     * @param key bogie ID to search
     * @return true if found, false otherwise
     */
    private static boolean binarySearch(
            String[] array,
            String key
    ) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            int result = array[mid].compareTo(key);

            if (result == 0) {
                return true;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}