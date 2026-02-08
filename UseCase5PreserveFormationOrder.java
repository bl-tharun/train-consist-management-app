/**
 * =========================================================
 * MAIN CLASS – UseCase5PreserveFormationOrder
 * =========================================================
 *
 * Use Case 5: Preserve Train Formation Order
 *
 * Description:
 * Demonstrates that the train now preserves
 * the exact order in which bogies are attached,
 * while automatically preventing duplicates.
 *
 * This is a structural fix, not a workaround.
 *
 * @version 5.0
 * @author Developer
 */
public class UseCase5PreserveFormationOrder {

    public static void main(String[] args) {

        System.out.println("=== Use Case 5: Train Formation Order ===\n");

        Train train = new Train();
        ConsistService consistService = new ConsistService();

        consistService.addPassengerBogie(train, "Engine");
        consistService.addPassengerBogie(train, "Sleeper");
        consistService.addPassengerBogie(train, "AC Chair");
        consistService.addPassengerBogie(train, "Goods");
        consistService.addPassengerBogie(train, "Sleeper"); // duplicate

        // Formation order is preserved automatically
        consistService.displayConsist(train);
    }
}