public class bubbleSort {
    static int[] arr = { 5, 7, 6, 8, 9, 3, 4, 2, 1, 5 };

    public static void main(String[] args) {
        System.out.println("This program implement bubble-sort: ");
        System.out.print("ARRAY BEFORE: ");
        printarr();
        bubS();
        System.out.print("\nARRAY AFTER : ");
        printarr();
        System.out.println();
    }

    public static void bubS(){
        boolean swapped = true;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    public static void swap(int prev, int next, int j1, int j2) {
        int tmp = next;
        prev = next;
        next = tmp;
        arr[j1] = prev;
        arr[j2] = next;
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
