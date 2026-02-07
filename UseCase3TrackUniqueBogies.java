/**
 * =========================================================
 * MAIN CLASS – UseCase3TrackUniqueBogies
 * =========================================================
 *
 * Use Case 3: Track Unique Bogie IDs Using Set
 *
 * Description:
 * Demonstrates how duplicate bogie IDs
 * can be prevented using a Set.
 *
 * This use case exposes a limitation
 * of List-based storage used earlier.
 *
 * No ordering guarantees are provided.
 *
 * @version 3.0
 * @author Developer
 */
public class UseCase3TrackUniqueBogies {

    public static void main(String[] args) {

        System.out.println("=== Use Case 3: Unique Bogie ID Tracking ===\n");

        // Initialize registry service
        BogieRegistryService registryService = new BogieRegistryService();

        // Attempt to register bogie IDs
        register(registryService, "BG101");
        register(registryService, "BG102");
        register(registryService, "BG101"); // duplicate
        register(registryService, "BG103");
        register(registryService, "BG102"); // duplicate

        // Display final registered bogies
        registryService.displayRegisteredBogies();
    }

    // Helper method to keep main readable
    private static void register(BogieRegistryService service, String bogieId) {
        if (service.registerBogie(bogieId)) {
            System.out.println("Registered bogie: " + bogieId);
        } else {
            System.out.println("Duplicate bogie rejected: " + bogieId);
        }
    }
}
