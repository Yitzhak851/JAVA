
/**
 * This class is the Converts Milliseconds to seconds, minutes, hours and days.
 * @author (Yitzhak Bar-or)
 * @version 1.0 date 13/11/21
 */
import java.util.Scanner;//Import of class type Scanner 

public class Milliseconds// The name of the class
{
     public static void main(String[] args) // start of method main
     {
          // declartion
          long days, hours, minutes, seconds;

          // create scanner class
          Scanner scan = new Scanner(System.in);

          System.out.println(
                    "This program reads an integar which\nrepresents Milliseconds and converts it do days,\nhours, minutes and seconds.");
          System.out.println("Please enter the number of millisiseconds");

          // input
          long ms = scan.nextLong();

          // calculation
          seconds = ms / 1000;
          minutes = seconds / 60;
          hours = minutes / 60;
          days = hours / 24;

          // convert to the format
          seconds = (int) (seconds % 60);
          minutes = (int) (minutes % 60);
          hours = (int) (hours % 24);

          // output
          System.out.println(days + " days " + hours + ":" + minutes + ":" + seconds + " hours ");

     }// end of method main
}// end of class Milliseconds