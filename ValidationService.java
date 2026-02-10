import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * =========================================================
 * CLASS – ValidationService
 * =========================================================
 *
 * Use Case 11: Input Validation Service
 *
 * Description:
 * Centralizes validation logic used
 * across the application.
 *
 * At this stage, it validates:
 * - Train ID format
 * - Cargo code format
 *
 * More validation rules will be added
 * in later use cases.
 *
 * @version 11.0
 */
public class ValidationService {

    // Validates Train ID format: TRN-1234
    public boolean isValidTrainId(String trainId) {
        Pattern pattern = Pattern.compile("TRN-\\d{4}");
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    // Validates Cargo Code format: PET-XX
    public boolean isValidCargoCode(String cargoCode) {
        Pattern pattern = Pattern.compile("[A-Z]{3}-[A-Z]{2}");
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }
}