public class test {
    public static int[] getDigits(int number) {      // getDigits(754368) returns [8,6,3,4,5,7]
        int length=0;
        for(int i=1; i<=number; i*=10){ // 1<=1 (1), 10<=10 (2)
            length++;
        }
        int[] arr = new int[length];        //[0, 0, 0, 0]
             //loop that creat the values of the array 0-1234
            for(int j=length; j>=1; j--){ 
                int i=length-j;   //loop that run from 4-1, 3 >=1? , 2>=1? , 1>=1?
                int exp = (j-1);           //multi=3               , multi=2, multi=1, multi=0
                int x=(int)(Math.pow(10, exp)); 
                arr[i] = number/x;              // arr[0]= 1234/1000 = 1          , arr[1]=234/100 , arr[2]=34/10
                number= number%x;               //number= 234               , number = 34 , number=4                            // arr[1]               , arr[2], arr[3]
            }
        
        return arr;
    }
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);  //get 1234
        int[] arrays = getDigits(number);        // use method getDigits to conver number to aray
        for(int i=0; i<arrays.length; i++){
            System.out.println(arrays[i]);
        }
        
    }
}
// Write a function getDigits that receives a number as input 
// and returns an array of its digits in the correct
// order, from ones to tens to hundreds, etc.
// For example: getDigits(754368) returns [8,6,3,4,5,7].
// Note: index 0 is for the right most digit.


// Write a function isPalindrome that receives an array of integers of any size and returns true if it is a
// palindrome and false otherwise.
// Reminder: A palindrome is a word, phrase, or sequence that reads the same backward and forward.
// For example 1221, 173371, 89298 are all palindrome, but the number 1213 is not a palindrome.
// Write a main function that receives as input a 6-digit number as a command-line argument and prints
// true if it is a palindrome, and false otherwise.
// For example, for the input "156445", the method prints false.
// Bonus: write the main function in one line!
