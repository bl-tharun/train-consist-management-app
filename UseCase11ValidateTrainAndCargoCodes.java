/**
 * =========================================================
 * MAIN CLASS – UseCase11ValidateTrainAndCargoCodes
 * =========================================================
 *
 * Use Case 11: Validate Train ID & Cargo Code
 *
 * Description:
 * Demonstrates how validation logic
 * can be centralized using a service
 * class instead of being scattered.
 *
 * This use case introduces:
 * - ValidationService
 * - Regex-based format enforcement
 *
 * @version 11.0
 * @author Developer
 */
public class UseCase11ValidateTrainAndCargoCodes {

    public static void main(String[] args) {

        System.out.println("=== Use Case 11: Regex Validation ===\n");

        ValidationService validationService = new ValidationService();

        // Valid samples
        String trainId = "TRN-1234";
        String cargoCode = "PET-XX";

        System.out.println("Train ID valid? " +
                validationService.isValidTrainId(trainId));
        System.out.println("Cargo Code valid? " +
                validationService.isValidCargoCode(cargoCode));

        // Invalid samples
        System.out.println("\nInvalid Samples:");
        System.out.println("Train ID valid? " +
                validationService.isValidTrainId("TRAIN-12"));
        System.out.println("Cargo Code valid? " +
                validationService.isValidCargoCode("P-123"));
    }
}