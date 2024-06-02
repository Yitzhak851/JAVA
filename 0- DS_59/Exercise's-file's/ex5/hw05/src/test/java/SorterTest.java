import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    final static long FIXED_RANDOMNESS_SEED = 12345L;
    Random randomGenerator;

    @BeforeEach
    void setUp() {
        randomGenerator = new Random(FIXED_RANDOMNESS_SEED);
    }

    @Test
    void testQuicksortOnSmallArrayWithNarrowRangeOfValues() {
        Long[] array = randomArray(30, 100, 120);
        Sorter.quickSort(array);
        assertTrue(isSorted(array), "Quicksort did not sort the array");
    }

    @Test
    void testMergeSortOnMediumArrayWithWideRangeOfValues() {
        Long[] array = randomArray(1024, 0, 1_000_000);
        Sorter.mergeSortNoRecursion(array);
        assertTrue(isSorted(array), "Mergesort did not sort the array");
    }

    @Test
    void testRadixSort() {
        Long[] array = randomArray(20, 0, 19);
        Sorter.radixSort(array, 2);
        assertTrue(isSorted(array), "Radix sort did not sort the array:\n" + Arrays.toString(array));
    }

    private Long[] randomArray(int length, long lowerBound, long upperBound) {
        if (length < 0) {
            throw new IllegalArgumentException("An array length can't be negative");
        }
        return randomGenerator.longs(length, lowerBound, upperBound).boxed().toArray(Long[]::new);
    }

    private static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

}
