// Given a number in the range 0-100 (inclusive), print the number of digits of the number.
// You must use the modulo (%) operator.
// For example, given the number 99, the program will print 2. Given the number 100, the program will print 3.

import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer in the range 10-100: ");
        int number = scanner.nextInt();

        // Check if the number is between 0 and 100 (inclusive)
        if (number >= 0 && number <= 100) {
            // Extract the first and last digits
            int firstDigit = number / 10;
            int lastDigit = number % 10;
            System.out.println("First digit: " + firstDigit);
            System.out.println("Last digit: " + lastDigit);

        } else {
            System.out.println("The number is not between 0 and 100.");
        }
        scanner.close();
    }
}
