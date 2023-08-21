public class Assignment331 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // get 1000 from user
        for (int i = 2; i < n; i++) { // i---->n
            int sum1 = 0;
            for (int j = 1; j < i; j++) { // j--->999
                if (i % j == 0) {sum1 += j;}
            }
            if (isPerfectNumber(n)) {
                if (sum1 == i) {System.out.println(i);}
            }
        }
    }

    public static boolean isPerfectNumber(int a) {
        for (int i = 2; i < a; i++) { // i---->1000
            int sum1 = 0;
            for (int j = 1; j < i; j++) { // j--->999
                if (i % j == 0) {sum1 += j;}
            }
            if (sum1 == i) {return true;} // 28== sum1(1-n,x+y+z)
        }
        return false;
    }
}
