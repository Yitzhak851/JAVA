// 3. Print the digit with the largest value of the number. 
// 4. Print the digit with the middle value of the number. 
// 5. Print the digit with the smallest value of the number. 
// You may assume that all the digits are different from one another (i.e., a number such as ‘111’ will not be checked).
// Example output given the number ‘589’: 

public class AssignmentThree {
    int number = 123;
    if (number < 100 || number > 999) {
        System.out.println("Please enter a valid three-digit number.");
    } else {
        int digit1 = (number/100);
        int digit2 = ((number % 100)/10);
        int digit3 = (number % 100);
        int sum1 = digit1 + digit2 + digit3;

        System.out.println("Sum of three digits: " + sum1);

        double avg1 = (sum1)/3;
        System.out.println("Avg of three digits: " + avg1);

        // int lrg12 = (digit1 > digit2);
        // int lrg23 = (digit1 > digit2);



    }
}