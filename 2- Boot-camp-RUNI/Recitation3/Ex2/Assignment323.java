// write a program that prints all the prime numbers between 2 and an integer number
// Example output: 
// >>run Assignment3 20
// 2
// 3
// 5
// 7
// 11
// 13
// 17
// 19

// Then, using the previous function, 
// write a program that prints all the prime numbers 
// between 2 and an integer number (which is given as a command line argument).

public class Assignment323 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);// get args from the user >>
        oddOrNot1(n); // method that return (true == prime) or (false == otherwise)
        for (int i = 2; i <= n; i++) { // calc all the num:for:  1 --> n
            if (oddOrNot1(i) == true) {
                System.out.println(i);
            } else {
                System.out.print("");
            }
        }
    }
    public static boolean oddOrNot1(int x) { // method that return true||false >> oddOrNot1(20);
        boolean t = true;
        boolean f = false;
        if (x == 2 || x==3) {
            return t;
        } else if (x % 2 != 0 && x%3!=0) {    
            return t;    
        } else {
            return f;
        }
    }
}
