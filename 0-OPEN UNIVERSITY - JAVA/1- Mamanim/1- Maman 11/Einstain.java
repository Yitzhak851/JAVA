/**
 * This department displays and calculates the Einstein game with each type of a valid triple digit number.
 * @author (Yitzhak Bar-or)
 * @version 1.0 date 13/11/21
 */
import java.util.Scanner;//The command import from 'java' the user's ability to type options
public class Einstein//the public class name
{
    public static void main (String[]args)
    {//Start the main method
        Scanner scan=new Scanner(System.in);//The command allows the user to type later.
        
        //decleration
        int num, ones, tens, hundreds;//A statement that saves space on computers for the variebles mentioned here.
        final int THE_MAGICAL_NUMBER=1089;//Set the number 1089 to constant.
        
        //input
        System.out.println("Welcome to the Einstein magic game.");
        System.out.println("Please enter a 3 digit positive number");
        System.out.println("whose first and last digits are different: ");
        
        num= scan.nextInt();//Allows user to enter num variable definition.
        // REMARK: explicit numbers such as 100 and 999 should be declare as final variable
        // Points: -2
        if (num<100 || num>999)//A command that mean the digit of the user put in is triple digit positive.
        {
            System.out.println("The number you entered is not a 3 digits positive number");
        }
        else if (num/100==num%10)//A condition that unity and hundreds are not the same in the three digit number. 
        {
            System.out.println("The first and the last digits of the number");
            System.out.println("should be different");
        }
        else
        {
            System.out.println("User number is: "+num);
            
            //Settings - ones, tens, hundreds of the user num
            ones = num%10;
            tens = num%100/10;
            hundreds = num/100;
            
            //calculation - of the revered num and the difference
            int reversedNum = ones*100 + tens*10 + hundreds ;           
            int difference = Math.abs(num-reversedNum);
            
            //input
            System.out.println("Difference: " +difference);
            
            //Settings - ones, tens, hundreds of the difference
            ones = difference%10;
            tens = difference%100/10;
            hundreds = difference/100;
            
            int reversedDifference = ones*100 + tens*10 + hundreds ;
            
            System.out.println("Reversed difference:" + reversedDifference);
            
            if (difference + reversedDifference == THE_MAGICAL_NUMBER)
            {
               System.out.println("SUCCEEDED");
            }
            else
            {
                System.out.println("FAILED");
            }
        }//end of the Conditions
    }//end of the main
    }//end of the Einstein class
