import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS – UseCase12SafetyComplianceCheck
 * =========================================================
 *
 * Use Case 12: Safety Compliance Check
 *
 * Description:
 * Demonstrates how business safety
 * rules can be enforced using
 * Stream-based validation logic.
 *
 * This use case introduces:
 * - allMatch()
 * - Business rule enforcement
 * - Declarative safety checks
 *
 * @version 12.0
 * @author Developer
 */
public class UseCase12SafetyComplianceCheck {

    public static void main(String[] args) {

        System.out.println("=== Use Case 12: Safety Compliance Check ===\n");

        // Create goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));


        ValidationService validationService = new ValidationService();

        boolean isSafe =
                validationService.isGoodsTrainSafe(goodsBogies);

        System.out.println("Goods Bogies:");
        goodsBogies.forEach(System.out::println);

        System.out.println("\nIs goods train safe? " + isSafe);
    }
}