
/**
 * This class contain a "Rolleta" game.
 * @author (Yitzhak baror)
 * @version (06.10.2023)
 */
import java.util.Scanner; // import the Scanner class

public class App {
    // Declarate several static variables
    static Scanner s = new Scanner(System.in);
    static int START_COIN;
    static int NUM_OF_STEPS;
    static int res;

    //static boolean isGame = true;
    //static boolean win = false;

    public static void howManyWinOrLose() {
        res = START_COIN;
        for(int i=1; i<NUM_OF_STEPS; i++){
            res = res*2 ;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("What is your start coin?");
        START_COIN = s.nextInt();
        System.out.println("How many steps you want to play");
        NUM_OF_STEPS = s.nextInt();
        howManyWinOrLose();
        System.out.println("The number in the Cash register is:");
        System.out.println(res);
    }
}
