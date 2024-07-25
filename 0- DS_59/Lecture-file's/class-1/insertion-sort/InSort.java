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
            int key = arr[i];
            int k = i-1;
            while (k >= 0 && arr[k] > key) {
                arr[k+1] = arr[k];
                k--;
            }
            arr[k+1] = key;
        }
    }
}