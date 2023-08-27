public class Assignment513 {
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
        boolean b=false;
        double current;
        double previus;
        double count=0;
        for(int i=0; i<args.length; i++){   // 5 + 3        //args.length=3  i=0, i<3
            if(args.length>=3){
                if(i==0 || i%2==0){                             //
                count++;
                if(b==true){
                    previus = Double.parseDouble(args[i]);
                }else{
                    current = Double.parseDouble(args[i]);
                    count += current;
                }
            }else if (i==1 || i%2!=0){
                String op = args[i];
                b=true;
            } else {
                System.out.println("invalid algebraic expression, plese insert algebraic expression greader then 3!");
            }
            }
        }
        count = doOperation(count, op, previus);
        System.out.println(count);
    }
}