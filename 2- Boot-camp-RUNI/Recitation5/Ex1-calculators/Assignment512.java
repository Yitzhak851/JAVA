public class Assignment512 {
    public static double doOperation(double num1, String op, double num2){
        double a=0;
        if(op == "+"){
            System.out.println( add(num1, num2));
        }else if(op == "-"){
            System.out.println(subtract(num1, num2));
        }else if(op == "*"){
            System.out.println(multiple(num1, num2));
        }else if(op == "/"){
            System.out.println(divide(num1, num2));
        }
        return a;
    }
    public static double add(double num1, double num2) {
        double res = num1+num2;
        return res;
    }
    public static double subtract(double num1, double num2){
        double res = num1-num2;
        return res;
    }
    public static double multiple (double num1, double num2){
        double res = num1*num2;
        return res;
    }
    public static double divide(double num1, double num2){
        double res = num1/num2;
        return res;
    }
    public static void main(String[] args) {
        doOperation(5.0, "+", 2.0);
    }
}

