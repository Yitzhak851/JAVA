/**
 * InSort
 */
public class InSort {
    static int[] arr = {5, 2, 4, 6, 1, 3};
    public static void main(String[] args) {
        System.out.println("This program implement insertion-sort: ");
        System.out.print("ARRAY BEFORE: ");
        printarr();
        insertionSort();
        System.out.print("\nARRAY AFTER : ");
        printarr();
        System.out.println();
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

    public static void insertionSort(){
        for (int i = 1; i < arr.length; i++) {
            int j = i; // start from: Array[1], 
            while ( (j > 0) && (arr[j-1] > arr[j]) )  // while (prev > current) = (A[j-1] > A[j])
            {
                // swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j = j-1; // go on to rear - continue to check prev elements iff (j > 0) we can go
            }
        }
    }
}