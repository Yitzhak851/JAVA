// <!-- Assignment 4 -->
// Use a for loop to draw an upside-down right triangle made of the column index.
// (Clarification, n should be set in main, rather than be given as a command-line argument.) 

// For example, for n=5, the program prints to the screen: 
// 	1 2 3 4 5 
// 	1 2 3 4
// 	1 2 3 
// 	1 2 
// 	1

public class Assignment34 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }

    }
}
