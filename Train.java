import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * =========================================================
 * CLASS – Train
 * =========================================================
 *
 * Use Case 1–5: Train Domain Model
 *
 * Description:
 * From Use Case 5 onwards, the train enforces:
 * - Unique bogies
 * - Formation (insertion) order
 *
 * Internally, this is achieved using
 * LinkedHashSet.
 *
 * IMPORTANT:
 * Public methods introduced in earlier
 * use cases remain unchanged.
 *
 * @version 5.0
 */
public class Train {

    // Internal representation now enforces formation order + uniqueness
    private Set<String> formationBogies;

    public Train() {
        this.formationBogies = new LinkedHashSet<>();
    }

    // add bogies
    public void addBogie(String bogieType) {
        formationBogies.add(bogieType);
    }

    // remove bogies
    public void removeBogie(String bogieType) {
        formationBogies.remove(bogieType);
    }

    // check if bogie exists
    public boolean hasBogie(String bogieType) {
        return formationBogies.contains(bogieType);
    }

    /**
     * @return a List view of the consist
     */
    public List<String> getConsist() {
        return new ArrayList<>(formationBogies);
    }
}