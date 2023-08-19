// Exercise 4 
// Write a Java program that computes the sum of all the numbers 
// between min and max and prints them to the screen.
// For example, if min = 3 'and' max = 5, print 12 (because 3 + 4 + 5 = 12).
// Note:
// 1.	Your program must receive ‘min’ and ‘max’ as an argument,
// 2.	You may assume that both ‘min’ and ‘max’ are positive,
// 3.	You may assume that ‘max’ is larger than ‘min’.
public class Assignment44 {
    public static void main(String[] args) {
        int numMin = 2;
        int numMax = 6;
        int sum1 = 0;

        if (((numMax < 0) || (numMin < 0)) || (numMax < numMin)) {
            System.out.println("Please insert minNum and maxNum positive number && numMax must be larger than numMin");
        } else {

            for (int i = numMin; i <= numMax; i++) {
                sum1 += i;
            }
            System.out.println("" + sum1);

        }
    }
}

