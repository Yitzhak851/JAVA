// Write a method that receives an integer i 
// representing an index and returns the i^th item in the Fibonacci sequence. 
// Note that the first index is 0 and not 1.

public class Assignment333 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int previous = 0;
        int current = 1;
        for (int i = 0; i < n; i++) {//  n=5   i=0    || i=1        || i=2        || i=3        || i=3 --> 5
            System.out.println(current); // print (1) ||print(1)    ||print(1+1)  ||print(2+1)  ||print(3+2)
            int temp = current; //             temp=1 ||temp=1      ||temp=2      ||temp=3      ||temp=5
            current += previous; //     current=(0+1) ||current=1+1 ||current=2+1 ||current=3+2 ||current=5+3
            previous = temp; //            previous=1 ||previous=1  ||previous=2  ||previous=3  ||previous=5
        }
    }
}
