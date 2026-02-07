/**
 * =========================================================
 * MAIN CLASS – UseCase4MaintainOrderedBogies
 * =========================================================
 *
 * Use Case 4: Maintain Ordered Bogie IDs
 *
 * Description:
 * Demonstrates how bogie IDs can be
 * stored in a sorted and predictable order.
 *
 * This use case addresses the limitation
 * of UC3 where ordering was not guaranteed.
 *
 * @version 4.0
 * @author Developer
 */
public class UseCase4MaintainOrderedBogies {

    public static void main(String[] args) {

        System.out.println("=== Use Case 4: Ordered Bogie IDs ===\n");

        // Initialize ordered registry service
        OrderedBogieRegistryService registryService =
                new OrderedBogieRegistryService();

        // Register bogie IDs (intentionally unordered input)
        registryService.registerBogie("BG105");
        registryService.registerBogie("BG101");
        registryService.registerBogie("BG103");
        registryService.registerBogie("BG102");

        // Display sorted bogie IDs
        registryService.displayOrderedBogies();
    }
}