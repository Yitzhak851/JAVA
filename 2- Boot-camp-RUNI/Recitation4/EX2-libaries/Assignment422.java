public class Assignment422 {
    public static int same(int x, int y) {
        if(x==y){
            System.out.println(" "+ );
        }
        
    }
    public static void main(String[] args) {
        int X = (int)(Math.random()*7);
        int Y = (int)(Math.random()*7);
        same(X, Y);
    }
}
//Write a program that emulates two random dice rolls. 
//The program should print the results in the following form:
//where X and Y should both be random numbers in the range of 1-6 where X should be bigger than Y.
//Restriction: use a function from the Math library to determine which of the two numbers is X.
//In case the roll dices are the same, additionally print: “Double Up!”