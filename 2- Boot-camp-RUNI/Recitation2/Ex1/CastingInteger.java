//Write program that print the Integer value of the sum of 2 double numbers.
//For example, for the input num1 = 12.3 and num2 = 13.1, the program should print “25”

public class CastingInteger {
    public static void main(String[]args){
        double num1= 12.3;
        double num2= 13.1;
        //sum1= (int) 25.4 --> 25
        int sum1 = (int)(num1 + num2) ;
        System.out.println("" + sum1);
    }
}
