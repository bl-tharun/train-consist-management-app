/**
 * =========================================================
 * CLASS – CargoSafetyException
 * =========================================================
 *
 * Use Case 15: Runtime Safety Exception
 *
 * Description:
 * Thrown when an unsafe cargo assignment
 * is attempted at runtime.
 *
 * This is an unchecked exception because
 * the error represents a business rule
 * violation during execution.
 *
 * @version 15.0
 */
public class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}