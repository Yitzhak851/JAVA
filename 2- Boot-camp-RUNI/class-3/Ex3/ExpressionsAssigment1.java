import java.util.Scanner;

public class ExpressionsAssigment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer in the range 10-99: ");
        int number = scanner.nextInt();

        // Check if the number is between 10 and 99 (inclusive)
        if (number >= 10 && number <= 99) {
            // Extract the first and last digits
            int firstDigit = number / 10;
            int lastDigit = number % 10;
            System.out.println("First digit: " + firstDigit);
            System.out.println("Last digit: " + lastDigit);

        } else {
            System.out.println("The number is not between 10 and 99.");
        }

        scanner.close();
    }
}