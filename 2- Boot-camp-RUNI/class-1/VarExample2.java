/*
 * This program writes the table of x's power up to 3 (exclusive)
 * 
 * For example, if x == 5, the program should write:
 * 1 
 * 5 
 * 25 
 */
class VarExample2 {
  public static void main(String[] args) {
    int x = 5;
    int result = 1;
    
    System.out.println(result);
    result = result * x;
    
    System.out.println(result);
    result = result * x;
    
    System.out.println(result);
  }
}