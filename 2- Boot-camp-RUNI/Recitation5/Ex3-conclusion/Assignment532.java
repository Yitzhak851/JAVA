
public class Assignment532 {
    public static boolean validArray(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            return true;
        }
        return false;
    }

    public static boolean noDuplicat(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array1[i] == array1[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static int[] unioArray(int[] arr1, int[] arr2) {
        int[] arr = new int[(arr1.length)+(arr2.length)];
        int res = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr[res] = arr1[i];
            res++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[res] = arr2[i];
            res++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 0 };
        int[] array2 = { 0, 3, 4 };
        int[] arr = unioArray(array1, array2);
    }
}

// Write a function that accepts 2 integer arrays. 
// The function will return a new array of type int 
// containing all the numbers which were present in either input arrays. 
// That is, we return the union of the two arrays.
// Then, in your main you should call this function you wrote to print the union elements of the arrays.

// Clarifications:
// • Initialize the two arrays in your main function.-

// Note: The order if the items in the returned array does not matter.
// Note: Every number should appear at most once! (No duplicates allowed!)
// Hint: Write a helper function isDuplicate that receives as arguments an array and an integer
// number and returns true if the number is already an element in the given array, and false
// otherwise.
