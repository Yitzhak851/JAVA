import java.util.Scanner;

public class SumOfFourDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int number = scanner.nextInt();
        
        if (number < 1000 || number > 9999) {
            System.out.println("Please enter a valid four-digit number.");
        } else {
            int sum = calculateDigitSum(number);
            System.out.println("Sum of digits: " + sum);
        }
        
        scanner.close();
    }
    
    public static int calculateDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}