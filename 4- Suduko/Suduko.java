public class Suduko {
    static int[][] sudukoBoard = new int[9][9];
    static double p = 0.4;

    public static void main(String[] args) {
        initFirstsudukoBoard(); // initialize the board
        printSudukoBoard(); // print the board
        calcSumOfRow(); // calculate the sum of each row
        calcSumOfCol();  // calculate the sum of each column
        calcSmallArray(); // calculate the sum of each small array
    }

    public static void printSudukoBoard() {
        for (int i = 0; i < sudukoBoard.length; i++) {
            for (int j = 0; j < sudukoBoard[i].length; j++) {
                System.out.printf("%3s", sudukoBoard[i][j]);
            }
            System.out.println();
        }
    }

    public static void initFirstsudukoBoard() {
        for (int i = 0; i < sudukoBoard.length; i++) {
            for (int j = 0; j < sudukoBoard[i].length; j++) {
                if (p < Math.random()) {
                    sudukoBoard[i][j] = (int) (Math.random() * 9 + 1);
                }
            }
        }
    }

    public static void calcSumOfRow() {
        // run through each row
        int row = 0;
        int col = 0;
        int sum = 0;
        while (row != 8 && col != 8) {
            sum += sudukoBoard[row][col];
            row++;
            if (col == 8) {
                System.out.println("Sum of row " + (row + 1) + " is " + sum);
                col = 0;
                row++;
            }
        }
    }

    public static void calcSumOfCol() {
        // run through each column
        int col = 0;
        int row = 0;
        int sum = 0;
        while (col != 8 && row != 8) {
            sum += sudukoBoard[row][col];
            col++;
            if (row == 8) {
                System.out.println("Sum of col " + (col + 1) + " is " + sum);
                row = 0;
                col++;
            }
        }
    }

    public static void calcSmallArray() {
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += sudukoBoard[j][i];
            }
            System.out.println("Sum of column " + (i + 1) + " is " + sum);
        }
        for (int i = 3; i < 7; i++) {
            int sum = 0;
            for (int j = 3; j < 7; j++) {
                sum += sudukoBoard[j][i];
            }
            System.out.println("Sum of column " + (i + 1) + " is " + sum);
        }
    }
}