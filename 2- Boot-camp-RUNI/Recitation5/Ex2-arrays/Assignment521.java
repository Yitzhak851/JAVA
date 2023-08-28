public class Assignment521 {
    public static int[] getDigits(int number) {
        int length=(int)(Math.log10(number))+1;
        int[] res = new int[length];
        int i=0;
        while(number>0){
            res[i]=number%10;
            number/=10;
            i++;
        }
        return res;
    }
    public static boolean isPalindrome(int[] arr) {
        boolean b = false;
        for(int i=0; i<arr.length; i++){
            for(int j=arr.length; j>0; j--){
                if(arr[i]==arr[(j)-(i)-(1)]){
                    b= true;
                }
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);  //For example: getDigits(754368) returns [8,6,3,4,5,7].
        if(args.length != 6){
            System.out.println("Plese put as input a 6-digit number!! ");
        }
        int[] arr = getDigits(number);        // use method getDigits to conver number to aray
        System.out.print("Your array is: [");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+ arr[i]);
        }
        System.out.print(" ]");
        System.out.println(isPalindrome(getDigits(number)));
    }
}


// Write a main function that receives as input a 6-digit number as a command-line argument and prints
// true if it is a palindrome, and false otherwise.

// For example, for the input "156445", the method prints false.

// Bonus: write the main function in one line!
// System.out.println(isPalindrome(getDigits(int number = Integer.parseInt(args[0]))));

