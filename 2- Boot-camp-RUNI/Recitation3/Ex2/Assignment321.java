public class Assignment321 {

    public static void printStarRow(int x) {
        for (int a = 1; a <= x; a++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            printStarRow(i);
        }
    }

}

// printStarRow(5); >> "*****"
