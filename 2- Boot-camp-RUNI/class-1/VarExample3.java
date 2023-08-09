/*
 * This program writes the table of x's power up to 3 (exclusive)
 * 
 * For example, if x == 5, the program should write:
 * 5^0 = 1 
 * 5^1 = 5 
 * 5^2 = 25 
 */
class VarExample3{
  public static void main(String[] args) {
    int x = 5;
    int power = 0;
    int result = 1;
    
    System.out.println(x + "^" + power + " = " + result);
    result = result * x;
    power = power + 1;
    
    System.out.println(x + "^" + power + " = " + result);
    result = result * x;
    power = power + 1;
    
    System.out.println(x + "^" + power + " = " + result);
  }
}