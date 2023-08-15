// Given an integer n, 
// use a for loop to draw a right-aligned triangle made of asterisks.
// (Clarification, n should be set in main, rather than be given as a command-line argument.) 

// For n = 5, the program should print the following to the screen: 
	//      *
	//     **
	//    ***
	//   ****
	//  *****

public class Assignment35 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int z = i; z >= 0; z--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
