import java.util.Scanner;

public class Recitation01 {
    public static void main(String[] args) {
        // use recursion
        System.out.println("Please give me some integer to calc his factorial:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = factorial(n);
        System.out.println("The resule is: " + res);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
