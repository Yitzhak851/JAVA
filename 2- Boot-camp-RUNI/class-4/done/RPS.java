package done;
import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static String computerMoves(int y) {
        String computerChoice= "invalid";
        if (y == 0) {
            return computerChoice = "paper";
        } else if (y == 1) {
            return computerChoice = "scissors";
        } else if (y == 2) {
            return computerChoice = "rock";
        } else {
            System.out.println("Something went wrong");
            return computerChoice ;
        }
    }
    public static String playersMoves(int x) {
        String playerChoice= "invalid";
        if (x == 0) {
            playerChoice = "paper";
            return playerChoice;
        } else if (x == 1) {
            playerChoice = "scissors";
            return playerChoice;
        } else if (x == 2) {
            playerChoice = "rock";
            return playerChoice;
        } else {
            System.out.println("Something went wrong");
            return playerChoice;
        }
    }
    public static int resOfTheGame(String str1, String str2) {
        int res=0;
        if ((str1 == "paper" && str2 == "rock") || (str1 == "rock" && str2 == "scissors") || (str1 == "scissors" && str2 == "paper")) {
            res = 1;
        } else if ((str1 == "scissors" && str2 == "rock") || (str1 == "paper" && str2 == "scissors") || (str1 == "rock" && str2 == "paper")) {
            res = 2;
        } else if (str1 == str2){
            res=0;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Make a choice."+ " 0 for paper, 1 for scissors, 2 for rock");
        int playerSelection = s.nextInt();
        int computerSelection = r.nextInt(0, 3);
        
        System.out.println("Player chose " + playersMoves(playerSelection) +
                        ". Computer made the mistake of choosing " + 
                        computerMoves(computerSelection) + ".");
        //start the clac
        if (resOfTheGame(playersMoves(playerSelection),computerMoves(computerSelection)) == 1) {
            System.out.println("Player wins!!!!");
        } else if (resOfTheGame(playersMoves(playerSelection),computerMoves(computerSelection)) == 2) {
            System.out.println("Computer wins ):");
        } else {
            System.out.println("Its a tie?!?!?!?!");
        }
    }
}

// 0 is paper, 1 is scissors, 2 is rock

