// Write a program that generates 2 random integers within a defined range [n, m] where n ≠ m.
// For simplicity, assume 1 ≤ $ < & ≤ 9.
// For example, for n = 3, m = 8, the random integer can be one of {3, 4, 5, 6, 7, 8}.
// Write a method called randomWithRange(…). The method receives two arguments, the min and
// max values of the range, and returns a random number within that range (i.e., between [n, m]).
// Note: You can use Math.random(), which returns a double in the range of 0.0 and 1.0.


public class Assignment421{
    public static int randomWithRange(int x, int y) {
        int rand=1;
        return rand;
    }
    public static void main(String[] args) {
        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);

        randomWithRange(a,b);
    }
}