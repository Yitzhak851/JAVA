/*
 * Write a program that calculates the time in seconds for a time intervale expresses in hours, minutes, and seconds.
 * 
 * You may assume that the hours, minutes, and seconds values in the range [0..59]
 * 
 * For example, for the following values:
 * hours = 1
 * minutes = 1;
 * seconds = 1;
 * 
 * The expected output is:
 * Interval expressed in seconds: 3661.
 * 
 */ 

class TimeCalculator {
  public static void main(String[] args) {
    int hours = 1;
    int minutes = 1;
    int seconds = 1;
    int result = hours * 3600 + minutes * 60 + seconds;
    //interval
    
    System.out.println("Interval expressed in seconds: " + result + ".");
    
  }
}