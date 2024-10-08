public class QuickSort {
    // merage and concart algoritem
    // the mainly ide is to choose the correct pivot
    // and to divide the array by the value of the pivot

    static int[] array = {7, 10, 3, 4 9, 11, 33, 49, 89};

    
    public static void main(String[] args) {
        quickSort(array, 0, array.length - 1);
    }
    
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        swap(array, high, randomGenerator.nextInt(high - low + 1) + low);
        int pivot = array[high];
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

    private static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    
}
