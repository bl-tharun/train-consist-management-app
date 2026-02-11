/**
 * =========================================================
 * CLASS – PassengerBogieFactory
 * =========================================================
 *
 * Use Case 14: Passenger Bogie Creation
 *
 * Description:
 * Centralizes creation of PassengerBogie
 * objects while enforcing validation rules.
 *
 * This avoids modifying the existing
 * PassengerBogie class and preserves
 * backward compatibility.
 *
 * @version 14.0
 */
public class PassengerBogieFactory {

    /**
     * Creates a PassengerBogie after
     * validating capacity.
     *
     * @param type bogie type
     * @param capacity seating capacity
     * @return PassengerBogie instance
     * @throws InvalidCapacityException if capacity <= 0
     */
    public PassengerBogie create(
            String type,
            int capacity
    ) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException(
                    "Capacity must be greater than zero"
            );
        }

        return new PassengerBogie(type, capacity);
    }
}