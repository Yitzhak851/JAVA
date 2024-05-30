public class QuickSort {
    // quick sort = moves smaller elements to left of pivot.
    //              recursively divide array in 2 partitions.


    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};
        quickSort(arr, 0, array.length - 1);
        for (int i : array){
            System.out.println(i + " ");
        }
    } 

    public static void quickSort(int[] array, int i, int j){
        if (end <= start) return; // base case
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    public static int partition(int[] array, int start, int end){
            int pivot = array[end];
            int i = start - 1 ;

            for (int j = start ; j <= end ; j++) {
                if (array[j] < pivot ) {
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
}