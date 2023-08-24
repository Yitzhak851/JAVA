public class TestArray2D {
    public static void main(String[] args) {
        int[][] exampleArray = new int[2][2];       // index:[0,0][1,0]   value: [1][2]
        exampleArray[0][0] = 1 ;                    // index:[0,1][1,1]   value: [2][1]
        exampleArray[1][0] = 2 ;
        exampleArray[0][1] = 2 ;
        exampleArray[1][1] = 1 ;

        System.out.print(exampleArray[0][0]);
        System.out.println(exampleArray[1][0]);
        System.out.print(exampleArray[0][1]);
        System.out.println(exampleArray[1][1]);
    }
}
