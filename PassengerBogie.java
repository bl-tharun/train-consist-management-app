/**
 * =========================================================
 * CLASS – PassengerBogie
 * =========================================================
 *
 * Use Case 7: Passenger Bogie Domain Model
 *
 * Description:
 * Represents a passenger bogie with
 * both identity and attributes.
 *
 * This class introduces proper
 * object-oriented modeling.
 *
 * @version 7.0
 */
public class PassengerBogie {

    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + ")";
    }
}