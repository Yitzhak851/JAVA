/*
* Calculates the average of a sequence of given non-negative numbers until -1 is entered
*/
//  java average (2) (2.5) (7) (-1) = 
// TODO- check if (n == -1) 
// WHILE - calc all the num from args[0] until (-1)
// TRUE - calc the avg of the sum/n
// FALSE - give num >= -1

public class Average1 {
    public static void main(String[] args) {
        int index = 0;
        double sum = 0;
        double num ;
        do {
            num = Double.parseDouble(args[index]);
            index++;
            sum += num;
        } while ((num) != (-1));
        System.out.println("Average is:" + (sum + 1)/(index - 1)); 
    }
}
