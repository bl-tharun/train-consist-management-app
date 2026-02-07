/**
 * =========================================================
 * MAIN CLASS – UseCase2AddPassengerBogies
 * =========================================================
 *
 * Use Case 2: Add Passenger Bogies to the Train Consist
 *
 * Description:
 * This use case demonstrates how the train consist
 * can be modified dynamically at runtime.
 *
 * Students learn:
 * - How to add elements to a List
 * - How to remove elements from a List
 * - How to check for element existence
 *
 * No validation, uniqueness, or ordering
 * constraints are applied at this stage.
 *
 * IMPORTANT:
 * This use case builds on UC1 without
 * breaking or modifying its behavior.
 *
 * @version 2.0
 * @author Developer
 */
public class UseCase2AddPassengerBogies {

    /**
     * Application entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("\n=== Use Case 2: Add Passenger Bogies ===\n");

        // Initialize train 
        Train train = new Train();

        // Initialize consist service
        ConsistService consistService = new ConsistService();

        // Display initial state 
        consistService.displayConsistSummary(train);

        // Add passenger bogies
        consistService.addPassengerBogie(train, "Sleeper");
        consistService.addPassengerBogie(train, "AC Chair");
        consistService.addPassengerBogie(train, "First Class");

        // Display updated consist
        consistService.displayConsist(train);

        // Remove a bogie
        consistService.removePassengerBogie(train, "AC Chair");

        // Display final state
        consistService.displayConsist(train);

        // Display final summary 
        consistService.displayConsistSummary(train);
    }
}