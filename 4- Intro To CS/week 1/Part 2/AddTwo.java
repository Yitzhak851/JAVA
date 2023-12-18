// 1. AddTwo
// Write a program (AddTwo.java) that adds two given integers 
// and prints the result in a fancy way.
// The command line is java AddTwo a b. 
// Here are two examples of the program’s execution:
// % java AddTwo 3 5
// 3 + 5 = 8
// % java AddTwo 9281 719
// 9281 + 719 = 10000

// Notes
// 1. The output of your program should look exactly like the outputs shown in these examples.
// 2. You can assume that the user-supplied inputs supplied by the user represent two valid
// integers, and you don’t have to write code that tests this assumption.
// 3. You are to operate according to these two default guidelines in every program written in this
// course unless the instructions say otherwise.

public class AddTwo {
    public static void main(String[] args) {
        int a,b,c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = a + b;
        System.out.println( a + " + " + b + " = " + c);
    }
}
