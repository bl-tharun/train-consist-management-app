/**
 * =========================================================
 * CLASS – ConsistService
 * =========================================================
 *
 * Use Case 1: Initialize Train and Display Empty Consist
 *
 * Description:
 * This service is responsible for interacting
 * with the train consist.
 *
 * In this version, it only displays the
 * current state of the consist.
 *
 * Business logic such as adding, removing,
 * validating, or ordering bogies is intentionally
 * excluded at this stage.
 *
 * @version 1.0
 */
public class ConsistService {

    /**
     * Displays a summary of the current train consist.
     *
     * @param train the train whose consist is displayed
     */
    public void displayConsistSummary(Train train) {

        System.out.println("Current Train Consist Summary");
        System.out.println("--------------------------------");

        System.out.println("Total Bogies Attached: " + train.getConsist().size());

        System.out.println("--------------------------------");
    }
}