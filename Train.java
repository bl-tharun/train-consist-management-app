import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * CLASS – Train
 * =========================================================
 *
 * Use Case 1: Initialize Train and Display Empty Consist
 *
 * Description:
 * This class represents a Train entity in the system.
 *
 * At this stage, a Train only maintains a consist,
 * which is a collection of bogies attached to it.
 *
 * No business rules, validations, or constraints
 * are applied in this version.
 *
 * The goal is to introduce:
 * - Object modeling
 * - State representation
 * - Dynamic collections
 *
 * @version 1.0
 */
public class Train {

    /**
     * Represents the current consist of the train.
     *
     * An ArrayList is used because:
     * - The number of bogies is unknown at startup
     * - The consist will grow and shrink over time
     *
     * We use the List interface to avoid
     * tight coupling to a concrete implementation.
     */
    private List<String> consist;

    /**
     * Constructs a Train with an empty consist.
     */
    public Train() {
        this.consist = new ArrayList<>();
    }

    /**
     * Returns the current train consist.
     *
     * @return list of bogies attached to the train
     */
    public List<String> getConsist() {
        return consist;
    }
}