/**
 * =========================================================
 * MAIN CLASS – UseCase1InitializeTrain
 * =========================================================
 *
 * Use Case 1: Initialize Train and Display Empty Consist
 *
 * Description:
 * This class demonstrates the application startup flow.
 *
 * The system:
 * - Creates a Train object
 * - Initializes an empty consist
 * - Displays the initial system state
 *
 * No user interaction or business logic
 * is performed in this use case.
 *
 * @author Developer
 * @version 1.0
 */
public class UseCase1InitializeTrain {

    /**
     * Application entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize domain object
        Train train = new Train();

        // Initialize service
        ConsistService consistService = new ConsistService();

        // Display initial system state
        consistService.displayConsistSummary(train);
    }
}