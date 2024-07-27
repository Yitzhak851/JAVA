import java.util.Random;

/**
 * The Sorter class provides static methods to perform various sorting algorithms.
 */
public class Sorter {
    private static final Random randomGenerator = new Random(); // Static random object to generate random numbers

    /**
     * Sorts an array using the QuickSort algorithm.
     * @param array The array to be sorted
     * @param <T> The type of elements in the array, which must be comparable
     */
    public static <T extends Comparable<T>> void quickSort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> void quickSort(T[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] array, int low, int high) {
        // Select a random pivot and swap with the last element
        swap(array, high, randomGenerator.nextInt(high - low + 1) + low);
        T pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private static <T extends Comparable<T>> void swap(T[] array, int i, int j) {
        if (i != j) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    /**
     * Sorts an array using the non-recursive Merge Sort algorithm.
     * @param array The array to be sorted
     * @param <T> The type of elements in the array, which must be comparable
     */
    public static <T extends Comparable<T>> void mergeSortNoRecursion(T[] array) {
        int n = array.length;
        for (int size = 1; size <= n; size = size * 2) {
            for (int left = 0; left < n - 1; left = left + size * 2) {
                int mid = Math.min(left + size, n);
                int right = Math.min(left + size * 2, n);
                merge(array, left, mid, right);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> void merge(T[] array, int left, int mid, int right) {
        int leftSize = mid - left;
        int rightSize = right - mid;

        T[] leftArray = (T[]) new Comparable[leftSize];
        T[] rightArray = (T[]) new Comparable[rightSize];

        System.arraycopy(array, left, leftArray, 0, leftSize);
        System.arraycopy(array, mid, rightArray, 0, rightSize);

        int i = 0, j = 0, k = left;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftSize) {
            array[k++] = leftArray[i++];
        }

        while (j < rightSize) {
            array[k++] = rightArray[j++];
        }
    }

    /**
     * Sorts an array of Long values using the Radix Sort algorithm.
     * @param array The array to be sorted
     * @param bitsPerDigit The number of bits to consider for each digit in radix sort
     */
    public static void radixSort(Long[] array, int bitsPerDigit) {
        Long max = findMax(array);
        int maxDigit = (int) (Math.log(max) / Math.log(1 << bitsPerDigit)) + 1;

        for (int digitIndex = 0; digitIndex < maxDigit; digitIndex++) {
            countingSort(array, bitsPerDigit, digitIndex);
        }
    }

    private static Long findMax(Long[] array) {
        Long max = array[0];
        for (Long value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static void countingSort(Long[] array, int bitsPerDigit, int digitIndex) {
        int range = 1 << bitsPerDigit;
        int[] count = new int[range];
        Long[] output = new Long[array.length];

        for (Long value : array) {
            int digit = extractDigit(value, bitsPerDigit, digitIndex);
            count[digit]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int digit = extractDigit(array[i], bitsPerDigit, digitIndex);
            output[--count[digit]] = array[i];
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }

    private static int extractDigit(Long key, int bitsPerDigit, int digitIndex) {
        Long shiftedKey = key >> (bitsPerDigit * digitIndex);
        return (int) (shiftedKey & ((1 << bitsPerDigit) - 1));
    }
}
