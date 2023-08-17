/*
 * Print the first Fibonacci numbers according to the user's choice.
 * 
 * Reminder:
 * Fibonacci numbers are the numbers in the following integer sequence:
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 * 
 * By definition, the first two numbers in the Fibonacci sequence are 1 and 1
 * and each subsequent number is the sum of the previous two.
 */ 


//1= 1
//2= 1
//3= 1+1
//4= (1)+(1+1)
//5= (1+1)+(1+1+1)
//6= (1+1+1)+(1+1+1+1+1)

class Fibonacci {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int previous = 0;
    int current = 1;
    
    //n-> 5
    for (int i=0; i < n; i++){
      System.out.println(current);
      int temp = current;
      current = current + previous;
      previous = temp;

    }
  }
}