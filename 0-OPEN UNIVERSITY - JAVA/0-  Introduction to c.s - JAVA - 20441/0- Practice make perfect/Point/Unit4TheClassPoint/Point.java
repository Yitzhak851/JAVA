public class Point{
    //Declartion
    private int _x;
    private int _y;
    private final int DEFAULT_VAL =0;
    
    //Constructor and method definations
    public Point (int x, int y){
        //itchul misיtane mofa - Mimush sitot hamchlaka
        if(x>=DEFAULT_VAL)
        _x=x;
        else
        _x=DEFAULT_VAL;
        if(y>=DEFAULT_VAL)
        _y=y;
        else
        _y=DEFAULT_VAL;
        
        _x = x;
        _y = y;
    }
    
    public Point (){
        //itchul misיtane mofa - Mimush sitot hamchlaka
        _x = 0;
        _y = 0;
    }
    
    public void move (int deltaX, int deltaY){
        //itchul misיtane mofa - Mimush sitot hamchlaka
        //move x and y coordinate by the same delta
        if((_x+deltaX >=DEFAULT_VAL)&&(_y + deltaX >=DEFAULT_VAL))
        {
        _x += deltaX;
        _y += deltaY;
        }
    }
    
    public void printStatus (){
        //itchul misיtane mofa - Mimush sitot hamchlaka
        System.out.println("("+_x+","+_y+")");
    }
    
    //here i seting the method of the class
}