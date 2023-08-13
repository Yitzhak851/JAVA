public class Assignment33 {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);

        boolean areEqual1 = args[1].equals("+");
        boolean areEqual2 = args[1].equals("-");
        boolean areEqual3 = args[1].equals("*");
        boolean areEqual4 = args[1].equals("/");
        boolean areEqual5 = args[1].equals("%");
        boolean areEqual6 = args[1].equals("**");

        int result = 0;

        if (areEqual1) {
            result = (x + y);
            System.out.println("result: " + result);
        } else if (areEqual2) {
            result = (x - y);
            System.out.println("result: " + result);
        } else if (areEqual3) {
            result = (x * y);
            System.out.println("result: " + result);
        } else if (areEqual4) {
            result = (x / y);
            System.out.println("result: " + result);
        } else if (areEqual5) {
            result = (x % y);
            System.out.println("result: " + result);
        } else if (areEqual6) {
            result = (x ^ y);
            System.out.println("result: " + result);
        } else {
            System.out.println("please insert corect opertor");
        }

        boolean areEqual = args[0].equals(args[2]);
        // Will print ‘true’ if argument1 equals argument2, ‘false’ otherwise
        System.out.println(areEqual);
    }
}
