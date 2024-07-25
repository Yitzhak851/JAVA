/**
 * MergSort
 */
public class MergSort {
    // Question-4-recitation-4
    static int[] arr = {4, 12, 16, 33, 51, 56, -1, 3, 4, 11, 4, 9, 16, 33, 78};
    static int l = arr[0];
    static int r = arr[length-1];

    public static void main(String[] args) {
        System.out.println("This program implement bubble-sort: ");
        System.out.print("ARRAY BEFORE: ");
        printarr();
        mergeSort(arr, l, r);
        System.out.print("\nARRAY AFTER : ");
        printarr();
        System.out.println();
    }

    public static void mergeSort(int[] array, int left, int right) {
        int q;
        if ( left < right ) {
            q = (l+r)/2; // [(l+r)/2]
            mergeSort(array, left, q);
            mergeSort(array, q+1, right);
            merge(array, left, q, rright);
        }
    }

// Merges two subarrays of arr[]. 
//First subarray is arr[l..m]
// Second subarray is arr[m+1..r]
    public static void merge(int arr[], int l, int m, int r){
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i){
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j){
            R[j] = arr[m + 1 + j];
        }
        // Merge the temp arrays
        // Initial indices of first and second subarrays
        int i = 0;
        int j = 0;
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public static void printarr() {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }
}