public class SumOfFourDigits {
    public static void main(String[] args) {
        int number = 2345;
        if (number < 1000 || number > 9999) {
            System.out.println("Please enter a valid four-digit number.");
        } else {
            int digit1 = (number/1000);
            int digit2 = ((number % 1000)/100);
            int digit3 = ((number % 100)/10);
            int digit4 = (number% 10);

            int sum = digit1 + digit2 + digit3 + digit4;

            System.out.println("Sum of digits: " + sum);
        }
        
    }
}