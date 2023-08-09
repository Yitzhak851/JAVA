/*
 * 
 * Write a program which prints PASSED if grade is greater or equal to thredshold, or prints FAILED otherwise. 
 * 
 */
class PassedFailedChecker {
  public static void main(String[] args) {
    int grade = 98;
    int thredshold = 60;
    
    if (grade >= thredshold) {
      System.out.println("PASSED");
    } else {
      System.out.println("FAILED");
    }
  }
}