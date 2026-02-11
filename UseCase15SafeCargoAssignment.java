/**
 * =========================================================
 * MAIN CLASS – UseCase15SafeCargoAssignment
 * =========================================================
 *
 * Use Case 15: Safe Cargo Assignment
 *
 * Description:
 * Demonstrates how unsafe cargo
 * assignments are handled gracefully
 * using try–catch–finally.
 *
 * This use case introduces:
 * - Runtime exceptions
 * - try–catch–finally
 * - Graceful failure handling
 *
 * @version 15.0
 * @author Developer
 */
public class UseCase15SafeCargoAssignment {

    public static void main(String[] args) {

        System.out.println("=== Use Case 15: Safe Cargo Assignment ===\n");

        GoodsBogie bogie = new GoodsBogie("Rectangular", "Coal");

        try {
            // Attempt unsafe assignment
            assignCargo(bogie, "Petroleum");
            System.out.println("Cargo assigned successfully");

        } catch (CargoSafetyException e) {
            System.out.println("Safety Error: " + e.getMessage());

        } finally {
            // Always executed
            System.out.println("Cargo validation completed");
        }

        System.out.println("\nFinal Bogie State:");
        System.out.println(bogie);
    }

    /**
     * Assigns cargo to a goods bogie
     * while enforcing safety rules.
     *
     * @param bogie goods bogie
     * @param cargo cargo to assign
     */
    private static void assignCargo(
            GoodsBogie bogie,
            String cargo
    ) {
        if (bogie.getShape().equalsIgnoreCase("Rectangular")
                && cargo.equalsIgnoreCase("Petroleum")) {

            throw new CargoSafetyException(
                    "Rectangular bogies cannot carry petroleum"
            );
        }

        bogie.setCargo(cargo);
    }
}