public class ControlFlowCasting3 {
    public static void main (String[] args){
        double num1 = 12.4;
        double num2 = 13.2;
        double sum1 = (num1 + num2);
        int sum2 = (int)sum1;

        System.out.print(" " + num1 + " + " + num2 + " = " + sum1 );

        if ((sum2 % 2) == 0){
        System.out.print(" , and the sum " + sum2 + " is even " );
        } else {
        System.out.print(" , and the sum " + sum2 + " is odd " );
        }
    }
}
