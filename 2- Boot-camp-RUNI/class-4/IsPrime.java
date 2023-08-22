/*
 * Checks wether an integer is prime.
 * Reminder: 
 * A prime number is an integer greater than 1 that 
 * has no positive divisors other than 1 and itself
 * example:  java IsPrime 9 
 */
public class IsPrime {
  public static void main(String[] args) { 
    int x = Integer.parseInt(args[0]);
    if (isPrime(x) ){
      System.out.println("Is prime number");
    } else {
      System.out.println("Is not prime number.");
    }
  }
  public static boolean isPrime(int a) {
    boolean b= true;
    for(int i=1; i<=a ; i++){ // a/a==1 && a/1==a  || iff 0--> n  >> more n % i ==0  != 1||n   
      if(a%i==0 && (i!=a && i!=1)){
        b= false;
      }
    }
    return b;
  }
}
