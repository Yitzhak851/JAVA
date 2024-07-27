public class QuickSort {
    // quick sort = moves smaller elements to left of pivot.
    // recursively divide array in 2 partitions.
    static int[] array = { 8, 2, 5, 3, 9, 4, 7, 6, 1 };

    public static void main(String[] args) {
        System.out.print("Before: [");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        
        quickSort(array, 0, array.length - 1);
        
        System.out.print("After: [");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void quickSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex <= rightIndex)
            return; // base case
        int pivot = partition(array, leftIndex, rightIndex);
        quickSort(array, leftIndex, pivot - 1);
        quickSort(array, pivot + 1, rightIndex);
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}
