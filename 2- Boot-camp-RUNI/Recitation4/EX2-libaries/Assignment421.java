public class Assignment421{   // program that generates 2 random integers within a defined range [n, m] where n ≠ m.
    public static int randomWithRange(int x, int y) { //receives 2 arguments, min and max values of the range
        int min=x;      //x=3
        int max=y;      //x=8
        int rand= (int)(Math.random()*(max+1));     // 0-8
        while(rand<min){
            rand= (int)(Math.random()*(max+1));
        }
        return rand;
        //returns a random number within that range
    }
    public static void main(String[] args) {
        int n =Integer.parseInt(args[0]);       //get 3
        int m =Integer.parseInt(args[1]);       //get 8
        //
        System.out.println("Result is: "+ randomWithRange(n,m));
        
    }
}

// >>run java Assignment421 3 8
// result is: 5