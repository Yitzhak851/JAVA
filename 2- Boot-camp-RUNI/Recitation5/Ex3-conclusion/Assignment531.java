public class Assignment531 {
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

    public static int[] interSectionArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length];
        int res = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    array3[res] = array1[i];
                    res++;
                }
            }
        }
        return array3;
    }

    public static boolean checkZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean voidInterSection = true;
        int[] array1 = { 1, 2, 0 };
        int[] array2 = { 0, 3, 4 };
        int[] arr = interSectionArray(array1, array2);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                voidInterSection = false;
                System.out.println(arr[i]);
            }
        }
        
        if (checkZero(array1) && checkZero(array2)) {
            voidInterSection = false;
            System.out.println(0);
        } 
        if (voidInterSection){
            System.out.println("there are no intersection!");
        }
    }
}

// Write a function (interSectionArray) that accepts 2 integer arrays.
// The function will return a new array of type int,
// containing all the numbers which are present in both input arrays.

// That is, we return the intersection of the two arrays.
// Then, in your main you should call this function you wrote
// to print the intersection elements of the arrays.

// Clarifications:
// • Assume that there are no duplicate elements in an array (e.g., {1, 1, 2} is
// not a valid array)-[V]
// • Initialize the two arrays in your main function.-[V]
// • Assume that the lengths of the two arrays are equal -[V]
// Note: your main function should print only the numbers which are in both
// arrays – no trailing zeroes are allowed.
// Example: (For array1={1, 2, 3} and array2={2, 3, 4})
// java AssignmentOne
// 2
// 3
