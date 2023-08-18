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
        int n = Integer.parseInt(args[0]);// user put 5
        for (int i = n; i >= 0; i--) {//Run to build rows    (i=3) i:-- /n || (2)i:-- /n  ||(1) i:-- /n
            for (int j = 1; j <= i; j++) {//Run to build "*" (i=3) j:1-3   || (2)j:1-2    ||(1) 1-1
                System.out.print("  ");//
            }
            for (int z = i; z <= n; z++){  //Run to build  (i=3) p: 3<=3  || (i=2) p: 2<=3   ||(i=1) 1<=3
                System.out.print("* ");     //                 print: * || print: * *      || print: * * * 
            }
            System.out.println();// new line
        }
    }
}
