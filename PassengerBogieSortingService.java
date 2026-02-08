import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * =========================================================
 * CLASS – PassengerBogieSortingService
 * =========================================================
 *
 * Use Case 7: Sort Bogies by Capacity
 *
 * Description:
 * This service applies custom sorting
 * rules to passenger bogies.
 *
 * Sorting logic is kept separate
 * from the domain object.
 *
 * @version 7.0
 */
public class PassengerBogieSortingService {

    /**
     * Sorts passenger bogies by capacity
     * in ascending order.
     *
     * @param bogies list of passenger bogies
     */
    public void sortByCapacity(List<PassengerBogie> bogies) {
        Collections.sort(
            bogies,
            Comparator.comparingInt(PassengerBogie::getCapacity)
        );
    }
}