/*
 * Use arithmetic operators to print the digits of a 5-digits integer (num), each on a separate line.
 * Print order: "most-significant-digit" first.
 *
 * Hint - You might find the following operators useful: / %
 * 
 * For example, if num == 12345 your program should print:
 * 1
 * 2
 * 3
 * 4
 * 5
 */
class ModuloExample2Solution {
  public static void main(String[] args) {
    int num = 12345;
    
    int ones = num % 10;
    int tens = (num / 10) % 10; // The (num / 10) 'trick' works because num in an integer
    int hundreds = (num / 100) % 10;
    int thousands = (num / 1000) % 10;
    int tensThousands = num / 10000;
    
    System.out.println(tensThousands);
    System.out.println(thousands);
    System.out.println(hundreds);
    System.out.println(tens);
    System.out.println(ones);
  }
}