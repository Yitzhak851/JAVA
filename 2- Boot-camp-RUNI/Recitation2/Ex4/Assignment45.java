// <!-- Exercise 5 -->
// Write a Java program that produces all numbers divisible by 3 
// in the range of min - max using a while loop. 
// Your program must receive ‘min’ and ‘max’ as an argument, 
public class Assignment45 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (((b < 0) || (a < 0)) || (b < a)) {
            System.out.println("Please insert minNum and maxNum positive number" + 
                                "&& numMax must be larger than numMin");
        } else {
            for (int i = a; i <= b; i++) {  
                while ((i % 3) == 0) {
                    System.out.println("" + i  );
                    i++;
                }
            }
        }
    }
}
