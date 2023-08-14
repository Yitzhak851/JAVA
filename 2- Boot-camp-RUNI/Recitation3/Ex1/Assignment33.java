// Use a for loop to draw a triangle made of the column index.
// In particular, given an input n, the output should be a right triangle in the form described below. 
// (Clarification, n should be set in main, rather than be given as a command-line argument.) 

// For example, for n=5, the program prints to the screen:
// 	1
// 	1 2
// 	1 2 3
// 	1 2 3 4 
// 	1 2 3 4 5 


public class Assignment33 {
    public static void main(String[] args) {
        // defined that getting argument from the user
        int n = Integer.parseInt(args[0]);
        // create for loop
        for (int i = 1; i <= (n); i++) {
            System.out.print( i + " ");

            for (int j = 1; j <= (n); j++) {
                System.out.println();
            }
        }
    }
}
