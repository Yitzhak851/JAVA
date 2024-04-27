import java.util.Scanner;
/**
 * This class demonstrates three sorting algorithms of an array. 
 * 
 * @author (Tamar Vilner) 
 * 
 */
public class Sort
{
    // _data = the array
    private int [] _data;
    // MAX = the length of the array
    final int MAX = 6;

    /**
     * Constructor for objects of class Sorting
     */
    public Sort()
    {
        _data = new int [MAX];
    }

    /**
     * enterNumbers is a method that fills the array with data from
     * the user
     */
    public void enterNumbers()
    {
        Scanner scan = new Scanner (System.in);
        for (int i=0; i<_data.length; i++)
        {
            System.out.print("enter an integer ");
            _data[i] = scan.nextInt();
        }
    }

    /**
     * printArray prints the array content
     */ 
    public void printArray()
    {
        System.out.print("The array is: ");
        for (int i=0; i<_data.length; i++)
            System.out.print("\t"+ _data[i]);
        System.out.println();
    }
}
