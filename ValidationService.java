import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * =========================================================
 * CLASS – ValidationService
 * =========================================================
 *
 * Use Case 11–12: Validation Service
 *
 * Description:
 * Centralizes validation logic.
 *
 * UC11: Format validation (Regex)
 * UC12: Business safety validation
 *
 * @version 12.0
 */
public class ValidationService {

    // UC11 – format validation
    public boolean isValidTrainId(String trainId) {
        Pattern pattern = Pattern.compile("TRN-\\d{4}");
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    public boolean isValidCargoCode(String cargoCode) {
        Pattern pattern = Pattern.compile("[A-Z]{3}-[A-Z]{2}");
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    /**
     * UC12 – safety validation
     *
     * Rule:
     * Cylindrical bogies can carry
     * only petroleum cargo.
     *
     * @param goodsBogies list of goods bogies
     * @return true if all bogies comply, false otherwise
     */
    public boolean isGoodsTrainSafe(List<GoodsBogie> goodsBogies) {
        return goodsBogies.stream()
                .allMatch(b ->
                        !b.getShape().equalsIgnoreCase("Cylindrical")
                        || b.getCargo().equalsIgnoreCase("Petroleum")
                );
    }
}