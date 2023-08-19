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

public class Assignment323 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);// get args from the user >> 
        oddOrNot1(n); // method that return (true == prime) or (false == otherwise)
        System.out.println(printOddNum(n)); // print founction that give value from 2 >> n
    }

    public static boolean oddOrNot1(int x) { // method that return true||false >> oddOrNot1(20);
        boolean t = true;
        boolean f = false;
        if ( x%2 != 0) { // 21%2 != 0 (1)
            return t;
        } else {  // (20)%2==0
            return f;
        }
    }

    public static boolean printOddNum(boolean y) {
        if (oddOrNot1(y)) {// print all the prime num from 1-n
            for (int i = 1; i <= y; i++) { // calc all the num
                System.out.println(i);
            }
        } else {
            System.out.println("Please insert odd num! ");//
        }
    }
}
