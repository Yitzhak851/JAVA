public class app {
    public static void main(String[] args) {
        int n = 5;
        fofo(n);
    }

    public static void fofo(int n) {
        int x = 1;
        int s = 2;
        int r = n;
        for (int i = 1; i < n; i++) {
            System.out.println("x = "+ x);
            x *= 2;
            System.out.println("x = "+ x);
            System.out.println("s = "+ s);
            s += x;
            System.out.println("s = "+ s);
        }
        while (x > 1) {
            x = (x/2);
            r = n+1;
        }
        //return n;
    }
}
