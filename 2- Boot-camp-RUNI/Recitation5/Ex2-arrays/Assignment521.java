
public class Assignment521 {
    public static boolean isPalindrome(int[] array) {
        
    }
    public static int[] convertor(String[] arg) {
        int[] arr = new int[arg.length];
        for (int i=0; i<arg.length; i++){
            for(int j=0; j<arr.length; j++){

            }
        }
    }
    public static int[] getDigits(int input) {      // getDigits(754368) returns [8,6,3,4,5,7]
        int length=0;
        for(int i=1; i<=input; i*=10){
            length++;
        }
        int[] arr = new int[length];
        for(int i=input; i>1; i=i/10){
            int num =1;
            arr[i]=num;
        }
        return arr;
    }
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);

        args.charAt[]
        if(args.length != 6){
            System.out.println("Plese put as input a 6-digit number!! ");
        }
        System.out.println(isPalindrome(convertor(args)));
    }
}

// that receives a number as input 
// and returns an array of its digits in the correct order, 
// from ones to tens to hundreds, etc.
// For example: getDigits(754368) returns [8,6,3,4,5,7].
// Note: index 0 is for the right most digit.

// Write a main function that receives as input a 6-digit number as a command-line argument and prints
// true if it is a palindrome, and false otherwise.

// For example, for the input "156445", the method prints false.
// Bonus: write the main function in one line!
