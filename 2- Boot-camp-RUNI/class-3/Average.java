/*
 * Calculates the average of a sequence of given non-negative numbers until -1 is entered
 */

public class Average {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum1;
        int avg1;
        // TODO- check if (n >= -1)
        // TRUE - calc the sum from n up to -1
        // TRUE - calc the avg of the sum/n
        // FALSE - give num >= -1

        if (n > (-1)) {
            avg1 = 0; 
            sum1 = 0;
            for (int i = 0; i <= n; i++) {
                sum1 += i;
            }
            avg1 = (sum1 / n);
            System.out.println(" " + avg1);
        } else {
            System.out.println(" Give num up from -1 ");
        }
    }
}
