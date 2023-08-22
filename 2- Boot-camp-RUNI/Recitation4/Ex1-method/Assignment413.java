// Write a program that counts the amount of numbers 
// between 10 (inclusive) and 100 (exclusive)
// whose digits sum to either 9 or 7.
// In your main() method, 
// print out the answer. 
// However, the actual counting should be done in aseparate method. 
// Note: there are 16 such numbers.
// >> run AssignmentThree
// 16

public class Assignment413 {
    public static int countNumbers(int a) {
        int count=0;
        for(int i=10; i<100; i++){
            if(((i/10)+(i%10))==7 || ((i/10)+(i%10))==9){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 1;
        System.out.println(countNumbers(x));
    }
}
