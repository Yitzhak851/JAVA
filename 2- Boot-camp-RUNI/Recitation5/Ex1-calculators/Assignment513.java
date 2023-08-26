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
        String[] arr = new String[args.length];

        String[] arrayOfOperators = new String[(int)(((args.length)-1)/2)];
        double[] arrayOfNum = new double[(int)(((args.length)/2)+1)];
        
        arrayOfOperators = {arr[i+1],arr[i+3], arr[i+5], ..... };
        arrayOfNum = {arr[i+2], arr[i+4], arr[i+6]...... };

        for(int i=0; i<arrayOfNum.length; i++){
            doOperation(arrayOfNum[i], null, arrayOfNum[i+1])

        }



    }
}

