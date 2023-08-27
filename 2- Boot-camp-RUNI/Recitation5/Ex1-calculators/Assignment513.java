public class Assignment513 {
    public static double doOperation(double num1, String op, double num2) {
        double a = 0;
        if (op == "+") {
            System.out.println(add(num1, num2));
        } else if (op == "-") {
            System.out.println(subtract(num1, num2));
        } else if (op == "*") {
            System.out.println(multiple(num1, num2));
        } else if (op == "/") {
            System.out.println(divide(num1, num2));
        }
        return a;
    }

    public static double add(double num1, double num2) {
        double res = num1 + num2;
        return res;
    }

    public static double subtract(double num1, double num2) {
        double res = num1 - num2;
        return res;
    }

    public static double multiple(double num1, double num2) {
        double res = num1 * num2;
        return res;
    }

    public static double divide(double num1, double num2) {
        double res = num1 / num2;
        return res;
    }

    public static void main(String[] args) { // create String[] args
        double result = Double.parseDouble(args[0]);        // 5 || 5+5 || 5+5*3
        String op = null;
        if (args.length >= 3 || (args.length % 2) != 0) {
            for (int i = 0; i < args.length; i++) { // 5 + 5 * 3 //args.length=5 (i=0, i<5)
                if (i % 2 == 0) {                   //5, 5, 3
                    double num = Double.parseDouble(args[i]);
                    if (op != null) {
                        result = doOperation(result, op, num);
                        System.out.println("the result is: " + result);
                    }
                    op = null;
                } else {
                    op = args[i];
                }
            }
        } else {
            System.out.println("invalid algebraic expression, "+
            "plese insert correct algebraic expression greader then 3!");
        }
        
    }
}