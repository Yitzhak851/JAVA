package testFile;
public class test2 {
    public static void main(String[] args) {
        int[][] inputArray = {{-1, 0, -1},{0, -1, 0},{-1, 0, 0}};
        int[][] outputArray = generateMineCountArray(inputArray);
        for (int i = 0; i < outputArray.length; i++) {
            for (int j = 0; j < outputArray[i].length; j++) {
                System.out.print(outputArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}

