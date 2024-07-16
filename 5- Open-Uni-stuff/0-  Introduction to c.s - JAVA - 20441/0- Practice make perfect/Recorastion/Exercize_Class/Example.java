
/**
 * Write a description of class Example here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example
{
    // instance variables - replace the example below with your own
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int findMin(int[] data, int index){

        int min;
        if(index == data.length - 1)
            return data [index];
        min = findMin(data, index + 1);
        if(min < data[index])
        return min;
        else
        return data[index];
    }

}

