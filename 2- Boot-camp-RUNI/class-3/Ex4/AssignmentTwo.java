// Given a number (integer): 
// •	If the number is outside of the range 0-100 inclusive, print "WOW".
// •	Otherwise, if it is a power of 10, print "SUCH POWER".
// •	Otherwise, if is a multiple of 7, print "MUCH LUCK".
// •	Otherwise, print "VERY CODE".

// For example, for the number 49 the program will print “MUCH LUCK”.
// For the number 101 the program will print “WOW”.

import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter an integer: ");
        //int number = scanner.nextInt();
	int number =233;

        // Check if the number is outside of the range 0-100 inclusive, print "WOW".
        if (number >= 100) {
            System.out.println("WOW!!");
        } else if (number == 10 || number == 100) {
            // • Otherwise, if it is a power of 10, print "SUCH POWER".
            System.out.println("SUCH POWER!!");
        } else if (number % 7 == 0) {
            // • Otherwise, if is a multiple of 7, print "MUCH LUCK".
            System.out.println("MUCH LUCK!!");
        } else {
            // • Otherwise, print "VERY CODE".
            System.out.println("VERY CODE!!");
        }
       // scanner.close();
    }
}
