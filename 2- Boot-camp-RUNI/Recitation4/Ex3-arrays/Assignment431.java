public class Assignment431 {
    public static int returnMax(int[] array) {      // [1,2,3]
        int res=0;
        for(int i=0; i<array.length; i++){
            if(array[i]>res){
                res = array[i];
            } else {
                return res;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] exampleArray = {10,30,20};
        System.out.println(returnMax(exampleArray));
    }
}

// Write a program which iterates an integer array and returns the maximum element in that array.
// Fill in the values in the array at declaration (e.g., int[] arr = {1, 2, 3})
// In addition, print each number of the array followed by the maximum element in the form shown
// in the example below.
// Example Output:
// The numbers are:
// 7, 15, 3, 6, 99, 64
// The maximum is: 99