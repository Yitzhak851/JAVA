// Write a Java program that prints all the odd numbers
// up to n 
// and the sum of them:
// Example: n = 9, prints:
// 1 3 5 7 9
// Sum = 25
// You must use a do-while loop!

public class Assignment46 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("All the odd numbers up to n : ");
        int i = 0;
        do {
            if((i % 2) == 0){
                System.out.print("");
            } else {
                System.out.print(" "+ i );
            }
            i++;
        } while ((i <= n));
        System.out.println();
        int j = 0;
        int sum1 = 0;
        do {
            if((j % 2) == 0){

            } else {
                sum1 += j  ;
            }
            j++;
        } while ((j <= n));
        System.out.println("Sum : " + sum1);
        
    }
}
