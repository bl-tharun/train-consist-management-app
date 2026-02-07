/**
 * =========================================================
 * CLASS – ConsistService
 * =========================================================
 *
 * Use Case 1–2: Train Consist Operations
 *
 * Description:
 * This service manages train consist interactions.
 *
 * IMPORTANT:
 * - Methods introduced in earlier use cases
 *   are preserved for backward compatibility.
 * - New behavior is added without breaking
 *   existing contracts.
 *
 * @version 2.0
 */
public class ConsistService {

    /**
     * Displays a summary of the current train consist.
     *
     * This method was introduced in Use Case 1
     * and MUST remain unchanged for backward compatibility.
     *
     * @param train the train whose consist is displayed
     */
    public void displayConsistSummary(Train train) {

        System.out.println("Current Train Consist Summary");
        System.out.println("--------------------------------");
        System.out.println("Total Bogies Attached: " + train.getConsist().size());
        System.out.println("--------------------------------\n");
    }

    /**
     * Displays detailed consist contents.
     *
     * @param train train instance
     */
    public void displayConsist(Train train) {
        System.out.println("Current Consist: " + train.getConsist() + "\n");
    }

    /**
     * Adds a passenger bogie to the train.
     *
     * @param train train instance
     * @param bogieType passenger bogie type
     */
    public void addPassengerBogie(Train train, String bogieType) {
        train.addBogie(bogieType);
        System.out.println("Added Bogie: " + bogieType);
    }

    /**
     * Removes a passenger bogie from the train.
     *
     * @param train train instance
     * @param bogieType bogie to remove
     */
    public void removePassengerBogie(Train train, String bogieType) {
        train.removeBogie(bogieType);
        System.out.println("Removed Bogie: " + bogieType);
    }
}