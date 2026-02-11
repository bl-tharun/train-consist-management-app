/**
 * =========================================================
 * CLASS – InvalidCapacityException
 * =========================================================
 *
 * Use Case 14: Custom Checked Exception
 *
 * Description:
 * Thrown when an invalid capacity
 * is provided while creating a
 * passenger bogie.
 *
 * This is a checked exception to
 * force callers to handle the error.
 *
 * @version 14.0
 */
public class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}