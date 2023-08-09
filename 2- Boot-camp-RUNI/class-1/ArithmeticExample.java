/*
 * This program divides n by m writes up the decomposition with the remainder.
 * 
 * For example when n == 23 and m == 7 the program outputs:
 * 23 = 3 * 7 + 2 
 * 
 */
class ArithmeticExample {
  public static void main(String[] args) {
    int n = 23;
    int m = 7;
    int divisor = n/m;
    int remainder = n%m;
    System.out.println( n + " = " + divisor + " * " + m + " + " + remainder);
  }
}