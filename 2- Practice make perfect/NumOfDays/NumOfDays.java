/*********************************************************************
 * This class represent description of NumbersOfDays on every month.
 * @author (Yitzhak Bar-or)
 * @version (1.0)
 ********************************************************************/

import java.util.Scanner;//create public class
public class NumbersOfDays
{
    public static void main (String args [])
    {
        int monthNumber; 
        Scanner s = new Scanner(System.in);
        System.out.println("This program prints the number");
        System.out.println("of days - in a given month");
        System.out.println("Please enter month's number:");
        
        monthNumber = s.nextInt();
        
        switch(monthNumber) 
        {
            case 1:
            case 3:
            case 5:
            case 7:    
            case 8:
            case 10:    
            case 12:    
                System.out.println("Numbers of days= 31");
                break;
        
            case 4:
            case 6:    
            case 9:
            case 11:
                System.out.println("Numbers of days= 30");
                break;
                
            case 2:
                System.out.println("Numbers of days= 28");
                break;
            default :System.out.println("Please enter month's number:");         
        }//end of switch
    }//end of main method
}//end of class NumberOfDays
