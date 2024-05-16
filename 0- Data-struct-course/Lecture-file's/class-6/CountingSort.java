import java.util.*;

public class CountingSort {

    public static int findMax(int[] arr) {
        int maxNum = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static int[] cSort(int[] arrA) {
        // O(n) - findMax
        int[] arrC = new int[findMax(arrA)];
        // O(k) - initional arrC to 0
        for (int i : arrC) {
            arrC[i] = 0;
        }
        // how many 0-k elemant we have
        for (int i = 0; i < arrA.length; i++) {
            arrC[(arrA[i] - 1)] += 1;
        }
        // initional arrC'
        for (int i = 1; i < arrC.length; i++) {
            arrC[i] = arrC[i] + arrC[i - 1];
        }
        // create arrB - that we return
        int[] arrB = new int[arrA.length];
        // o(n) initional arrB to be 0
        for (int i : arrB) {
            arrB[i] = 0;
        }
        // arrC = {1,1,3,5}; arrA = {4,1,3,4,3}; arrB={0,0,0,0,0};
        for (int i = arrA.length - 1; i >= 0; i--) {
            arrB[arrC[(arrA[i] - 1)]] = arrA[i];
            arrC[(arrA[i] - 1)] = arrC[(arrA[i] - 1)] - 1;
        }
        return arrB;
    }

    public static void printArr(int[] arr) {
        System.out.print("{ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] arrA = { 4, 1, 3, 4, 3 };
        System.out.print("The given array before Counting-Sort is: ArrayA = ");
        printArr(arrA);
        System.out.print("The given array after Counting-Sort is: ArrayB = ");
        printArr(cSort(arrA));
    }// end main method

}// end class
