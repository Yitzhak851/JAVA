public class AssignmentThree {
    public static void main(String[] args) {

        int number = 589;
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid three-digit number.");
        } else {
            int digit1 = (number / 100);
            int digit2 = ((number % 100) / 10);
            int digit3 = (number % 100) % 10;

            // 6. check that all the digits are different from one another
            if ((digit1 == digit2) && (digit2 == digit3)) {
                System.out.println("all the digits are equal - you must chose different digit one from another !!! ");
            } else {


                // 1. Print the sum of all digits.
                int sum1 = digit1 + digit2 + digit3;
                System.out.println("1. The sum of three digits: " + sum1);

                // 2. Print the average of all digits (this could be of type ‘double’!).
                double avg1 = (sum1) / 3;
                System.out.println("2. The avg of three digits: " + avg1);

                // 3. Print the digit with the largest value of the number.
                if (digit1 > digit2) {
                    System.out.println("3. the digit with the largest value is: " + digit1);
                } else if (digit2 > digit3) {
                    System.out.println("3. the digit with the largest value is: " + digit2);
                } else {
                    System.out.println("3. the digit with the largest value is: " + digit3);
                }

                // 4. Print the digit with the middle value of the number.
                if (digit1 > digit2) {
                    if (digit1 < digit3) {
                        System.out.println("4. the digit with the middle value is: " + digit1);
                    } else if (digit3 > digit2) {
                        System.out.println("4. the digit with the middle value is: " + digit3);
                    } else {
                        System.out.println("4. the digit with the middle value is: " + digit2);
                    }
                } else if (digit2 < digit3) {
                    System.out.println("4. the digit with the middle value is: " + digit2);
                } else if (digit1 > digit3) {
                    System.out.println("4. the digit with the middle value is: " + digit1);
                } else {
                    System.out.println("4. the digit with the middle value is: " + digit3);
                }

                // 5. Print the digit with the smallest value of the number.
                if (digit1 > digit2) {
                    if (digit2 < digit3) {
                        System.out.println("5. the digit with the smallest value is: " + digit2);
                    } else {
                        System.out.println("5. the digit with the smallest value is: " + digit3);
                    }

                } else if (digit1 < digit3) {
                    System.out.println("5. the digit with the smallest value is: " + digit1);
                } else {
                    System.out.println("5. the digit with the smallest value is: " + digit3);
                }
            }
        }
    }
}