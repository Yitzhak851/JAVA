
public class Step3 {
    public static int coordinate(int a, int b, int[][] arr) {
        int res = arr[b][a];
        return res;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{2,-1,-1},{-1,3,2}};
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int res = coordinate(a, b, arr);
        System.out.println(res);
    }
}
// <!-- Step 3:  -->
// Write a function that receives a coordinate, and returns the value in
// that coordinate.
//example:
// [0,  2 ,-1]
// [0, -1 , 3]
// [0, -1 , 2]
//>> run Step3 0 0
// 0
//>> run Step3 2 0
// 2
//>> run Step3 2 1
// 3
//>> run Step3 1 2
// -1