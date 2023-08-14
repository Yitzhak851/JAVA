// In particular, given an input n,
// the output should be an n x n square in the form described below. 
// (Clarification, n should be set in main, rather than be given as a command-line argument.) 
// For example, for n = 5, the following will be outputted to the screen: 
// 	1 1 1 1 1 
// 	2 2 2 2 2
// 	3 3 3 3 3
// 	4 4 4 4 4 
// 	5 5 5 5 5

public class Assignment32 {
    public static void main(String[] args) {
        // defined that getting argument from the user
        int n = Integer.parseInt(args[0]);
        // create for loop
        for (int i = 1; i <= (n); i++) {
            for (int j = 1; j <= (n); j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
