// Given a number in the range 0-100 (inclusive), print the number of digits of the number.
// You must use the modulo (%) operator.
// For example, given the number 99, the program will print 2. Given the number 100, the program will print 3.

public class AssignmentOne {
    public static void main(String[] args) {
        int number = 233 ;
        // Check if the number is between 0 and 100 (inclusive)
        if (number >= 0 && number <= 100) {
            if ((number % 100) == 0) {
                System.out.println("Number of digits: 3 ");
            } else if (((number % 100) <= 9) && ((number % 100) > 0)) {
                System.out.println("Number of digits: 1 ");
            } else if (((number % 100) > 9) ) {
                System.out.println("Number of digits: 2 ");
            }
        } else {
            System.out.println("The number is not between 0 and 100.");
        }
    }
}
