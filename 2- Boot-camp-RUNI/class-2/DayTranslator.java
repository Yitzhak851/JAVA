/*
 * Write a program that prints the name of the day associated with the value stored in dayNum. In case this value
 * is not in the legal range of days, print an appropriate message.
 */
public class DayTranslator {
  public static void main(String[] args) { 
    int dayNum = 8;

    String output;
    
    if (dayNum == 1) {
      output = "Sunday";
    } else if (dayNum == 2) {
      output = "Monday";
    } else if (dayNum == 3) {
      output = "Tuesday";
    } else if (dayNum == 4) {
      output = "Wednesday";
    } else if (dayNum == 5) {
      output = "Thursday";
    } else if (dayNum == 6) {
      output = "Friday";
    } else if (dayNum == 7) {
      output = "Saturday";
    } else {
      output = dayNum + " not is a vaild range [0..7]";
    }
    
    System.out.println(output);
  }
}
