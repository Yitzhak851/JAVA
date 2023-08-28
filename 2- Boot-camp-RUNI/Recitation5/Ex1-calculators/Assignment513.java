public class Assignment513 {
    public static double doOperation(double num1, String op, double num2) {
        if (op == "+") {
            return add(num1, num2);
        } else if (op == "-") {
            return subtract(num1, num2);
        } else if (op == "*") {
            return multiple(num1, num2);
        } else if (op == "/") {
            return divide(num1, num2);
        } else {
            return -1.0;
        }        
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
        double result = Double.parseDouble(args[0]);        //   5+5*3
        String op = null;
        if (args.length >= 3 && (args.length % 2) != 0) {
            for (int i=1; i < args.length; i++) { // 5 + 5 * 3 //args.length=5 (i=0, i<5)
                if (i % 2 == 0) {                   //5, 5, 3
                    double num = Double.parseDouble(args[i]);       //num=5.0  num= 3.0  result=5.0
                    if (op != null) {
                        double temp;
                        temp = doOperation(result, op, num);
                        System.out.println("The result is: " + temp);
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