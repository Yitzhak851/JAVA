/*
 * Use arithmetic operators to print the digits of a 3-digits integer (num), each on a separate line.
 * Print order: "most-significant-digit" first.
 *
 * Hint - You might find the following operators useful: / %
 * 
 * For example, if num == 123 your program should print:
 * 1
 * 2
 * 3
 */

class OperatorsExample1Solution {
  public static void main(String[] args) {
   
    int num = 123;

    int ones = num % 10;
    int tens = (num / 10) % 10;
    int hundreds = (num / 100) % 10;
    
    System.out.println(hundreds);
    System.out.println(tens);
    System.out.println(ones);
  }
}