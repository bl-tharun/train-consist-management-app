import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS – UseCase13LoopVsStreamPerformance
 * =========================================================
 *
 * Use Case 13: Performance Comparison – Loop vs Stream
 *
 * Description:
 * Demonstrates how to measure execution
 * time for loop-based and stream-based
 * data processing.
 *
 * This use case introduces:
 * - System.nanoTime()
 * - Basic benchmarking
 * - Performance trade-off awareness
 *
 * @version 13.0
 * @author Developer
 */
public class UseCase13LoopVsStreamPerformance {

    public static void main(String[] args) {

        System.out.println("=== Use Case 13: Loop vs Stream Performance ===\n");

        // Prepare test data
        List<PassengerBogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100_000; i++) {
            bogies.add(new PassengerBogie("Sleeper", 72));
        }

        // Loop-based filtering
        long loopStart = System.nanoTime();
        int loopCount = filterUsingLoop(bogies, 60);
        long loopEnd = System.nanoTime();

        // Stream-based filtering
        long streamStart = System.nanoTime();
        long streamCount = filterUsingStream(bogies, 60);
        long streamEnd = System.nanoTime();

        // Display results
        System.out.println("Loop Count   : " + loopCount);
        System.out.println("Stream Count : " + streamCount);

        System.out.println("\nExecution Time (nanoseconds):");
        System.out.println("Loop   : " + (loopEnd - loopStart));
        System.out.println("Stream : " + (streamEnd - streamStart));
    }

    // Loop-based filtering
    private static int filterUsingLoop(
            List<PassengerBogie> bogies,
            int minCapacity
    ) {
        int count = 0;
        for (PassengerBogie b : bogies) {
            if (b.getCapacity() > minCapacity) {
                count++;
            }
        }
        return count;
    }

    // Stream-based filtering
    private static long filterUsingStream(
            List<PassengerBogie> bogies,
            int minCapacity
    ) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > minCapacity)
                .count();
    }
}