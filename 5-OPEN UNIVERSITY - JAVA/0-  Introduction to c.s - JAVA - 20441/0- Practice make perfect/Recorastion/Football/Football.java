public class Football{

    //declaration
    
    /**
     *Represente the few ways to achieve score ....
     *@param 
     *@param 
     */

    public static int goal(int g1, int g2)
    {
        if(g1 == 2 || g2 == 1)

            return 1;

        else

            return goal(g1-1, g2);
    }

}