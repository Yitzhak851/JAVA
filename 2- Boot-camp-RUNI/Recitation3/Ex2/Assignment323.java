// write a program that prints all the prime numbers between 2 and an integer number
// Example output: 
// >>run assignment3 20
// 2
// 3
// 5
// 7
// 11
// 13
// 17
// 19

public class Assignment323 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);// get args from the use >> Integer.parseInt(args[0]);
        oddOrNot1(n); // return (true == prime) || (false == otherwise)
        System.out.println(printOddNum(n)); // print value
    }

    public static boolean oddOrNot1(int x) { // create founction/method that return true||false
        boolean bool1 = true;
        boolean bool2 = false;
        if ((x / x) == (1) && (x / 1) == (x)) {
            return bool1;
        } else {
            return bool2;
        }
    }

    public static int printOddNum(int y) {
        if (oddOrNot1(y)) {// print all the prime num from 1-n
            for (int i = 1; i <= y; i++) { // calc all the num
                    System.out.println(i);
            } 
        }else {
        System.out.println("Please insert odd num! ");//
    }
}
