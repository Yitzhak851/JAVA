/*
 * Print the first Fibonacci numbers according to the user's choice.
 * Reminder:
 * Fibonacci numbers are the numbers in the following integer sequence:
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
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
    for (int i=0; i < n; i++){//ex:n=5 >> i=0       ||   i=1      ||   i=2      ||    i=3     ||   i=3 --> 5
      System.out.println(current);  // print (1)    ||print(1)    ||print(1+1)  ||print(2+1)  ||print(3+2)
      int temp = current;           // temp=1       ||temp=1      ||temp=2      ||temp=3      ||temp=5
      current += previous;          // current=0+1  ||current=1+1 ||current=2+1 ||current=3+2 ||current=5+3
      previous = temp;              // previous=1   ||previous=1  ||previous=2  ||previous=3  ||previous=5
    }
  }
}