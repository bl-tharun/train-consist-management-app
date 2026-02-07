import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * CLASS – Train
 * =========================================================
 *
 * Use Case 1–2: Train Domain Model
 *
 * Description:
 * Represents a Train and its consist.
 *
 * From Use Case 2 onwards, the train supports
 * basic modification of its consist.
 *
 * No constraints such as uniqueness or validation
 * are applied yet.
 *
 * @version 2.0
 */
public class Train {

    // Dynamic list representing train consist.
    private List<String> consist;

    // Constructs a Train with an empty consist.
    public Train() {
        this.consist = new ArrayList<>();
    }

    /**
     * Adds a bogie to the train consist.
     *
     * @param bogieType type of passenger bogie
     */
    public void addBogie(String bogieType) {
        consist.add(bogieType);
    }

    /**
     * Removes a bogie from the train consist.
     *
     * @param bogieType type of bogie to remove
     */
    public void removeBogie(String bogieType) {
        consist.remove(bogieType);
    }

    /**
     * Checks if a bogie exists in the consist.
     *
     * @param bogieType bogie to check
     * @return true if present, false otherwise
     */
    public boolean hasBogie(String bogieType) {
        return consist.contains(bogieType);
    }

    /**
     * @return current train consist
     */
    public List<String> getConsist() {
        return consist;
    }
}