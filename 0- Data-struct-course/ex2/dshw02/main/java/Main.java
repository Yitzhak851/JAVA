import java.util.ArrayList;
import java.util.List;

// some nice tester class that someone send me
public class Main {
    public static void main(String[] args) {
        List<String> testResults = new ArrayList<>();
        int passedTests;

        // Test the GeneralPurposeHeap with MoltOrder objects
        MoltOrder order1 = new MoltOrder("Alice", "Pizza", 10, 30, 1);
        MoltOrder order2 = new MoltOrder("Bob", "Sushi", 20, 20, 2);
        MoltOrder order3 = new MoltOrder("Charlie", "Burger", 15, 25, 3);

        GeneralPurposeHeap<MoltOrder> orderHeap = new GeneralPurposeHeap<>();
        orderHeap.insert(order1);
        orderHeap.insert(order2);
        orderHeap.insert(order3);

        // Expected: Pizza
        testResult(testResults, "Min Order", "Pizza", orderHeap.findMin().getOrderDescription());

        // Expected: 3
        testResult(testResults, "Heap Size after insertions", "3", String.valueOf(orderHeap.getSize()));

        orderHeap.deleteMin(); // Removing the minimum

        // Expected: Sushi
        testResult(testResults, "Min Order after deletion", "Sushi", orderHeap.findMin().getOrderDescription());

        // Test merging heaps
        GeneralPurposeHeap<MoltOrder> anotherOrderHeap = new GeneralPurposeHeap<>();
        MoltOrder order4 = new MoltOrder("Dave", "Taco", 25, 20, 4);
        anotherOrderHeap.insert(order4);

        // Perform the merge
        orderHeap.mergeHeap(anotherOrderHeap);

        // Expected: 3 (since one order was deleted and then one more added by merging)
        testResult(testResults, "Heap Size after merging", "3", String.valueOf(orderHeap.getSize()));

        // Expected: The minimum should still be "Sushi" as "Pizza" was removed and
        // "Taco" has a higher priority number
        testResult(testResults, "Min Order after merging", "Sushi", orderHeap.findMin().getOrderDescription());

        // Test: Verify other heap's property remains the same after merge
        GeneralPurposeHeap<MoltOrder> untouchedHeap = new GeneralPurposeHeap<>();
        untouchedHeap.insert(new MoltOrder("Eve", "Salad", 30, 10, 5));
        int untouchedHeapSizeBeforeMerge = untouchedHeap.getSize();
        orderHeap.mergeHeap(untouchedHeap); // Merge action
        testResult(testResults, "Untouched Heap Size After Merging", String.valueOf(untouchedHeapSizeBeforeMerge),
                String.valueOf(untouchedHeap.getSize()));

        // Test: Odd number of objects in the heap
        GeneralPurposeHeap<MoltOrder> oddHeap = new GeneralPurposeHeap<>();
        oddHeap.insert(order1); // Alice's order
        oddHeap.insert(order2); // Bob's order
        oddHeap.insert(new MoltOrder("Frank", "Noodles", 22, 18, 3)); // New order to make it odd
        testResult(testResults, "Odd Number of Orders in Heap", "3", String.valueOf(oddHeap.getSize()));

        // Test: All objects have the same priority
        GeneralPurposeHeap<MoltOrder> samePriorityHeap = new GeneralPurposeHeap<>();
        samePriorityHeap.insert(new MoltOrder("Gina", "Ramen", 40, 5, 2));
        samePriorityHeap.insert(new MoltOrder("Hank", "Steak", 45, 15, 2));
        samePriorityHeap.insert(new MoltOrder("Ivy", "Ice Cream", 50, 25, 2));
        testResult(testResults, "Min Order with Same Priorities", "Ramen",
                samePriorityHeap.findMin().getOrderDescription());

        // Add more diverse tests
        // Test: Insert null and catch exception
        try {
            orderHeap.insert(null);
            testResults.add("Fail: Insert Null - Expected: Exception, Actual: No Exception");
        } catch (IllegalArgumentException e) {
            testResults.add("Pass: Insert Null");
        } catch (Exception e) {
            testResults.add(
                    "Fail: Insert Null - Expected: IllegalArgumentException, Actual: " + e.getClass().getSimpleName());
        }

        // Test: Delete from an empty heap and catch exception
        GeneralPurposeHeap<MoltOrder> emptyHeap = new GeneralPurposeHeap<>();
        try {
            emptyHeap.deleteMin();
            testResults.add("Fail: Delete from Empty Heap - Expected: Exception, Actual: No Exception");
        } catch (IllegalArgumentException e) {
            testResults.add("Pass: Delete from Empty Heap");
        } catch (Exception e) {
            testResults.add("Fail: Delete from Empty Heap - Expected: IllegalArgumentException, Actual: "
                    + e.getClass().getSimpleName());
        }

        // Test: Merge two heaps with same priorities
        GeneralPurposeHeap<MoltOrder> heap1 = new GeneralPurposeHeap<>();
        heap1.insert(new MoltOrder("Jack", "Pizza", 12, 30, 1));
        GeneralPurposeHeap<MoltOrder> heap2 = new GeneralPurposeHeap<>();
        heap2.insert(new MoltOrder("Kilo", "Burger", 14, 25, 1));
        heap1.mergeHeap(heap2);
        testResult(testResults, "Merge Heaps with Same Priorities Size", "2", String.valueOf(heap1.getSize()));

        // Test: Insert and delete repeatedly to check heap integrity
        GeneralPurposeHeap<MoltOrder> dynamicHeap = new GeneralPurposeHeap<>();
        dynamicHeap.insert(order1); // Insert
        dynamicHeap.deleteMin(); // Delete
        dynamicHeap.insert(order2); // Insert again
        testResult(testResults, "Dynamic Heap Operation", "Sushi", dynamicHeap.findMin().getOrderDescription());

        // Calculate and print test results
        passedTests = (int) testResults.stream().filter(r -> r.startsWith("Pass")).count();
        int totalTests = testResults.size();
        System.out.println("You passed " + passedTests + "/" + totalTests + " tests.");

        // Print details of failed tests once
        testResults.stream()
                .filter(r -> r.startsWith("Fail"))
                .forEach(System.out::println);
    }

    private static void testResult(List<String> results, String testName, String expected, String actual) {
        if (expected.equals(actual)) {
            results.add("Pass: " + testName);
        } else {
            results.add("Fail: " + testName + " - Expected: " + expected + ", Actual: " + actual);
        }
    }
}