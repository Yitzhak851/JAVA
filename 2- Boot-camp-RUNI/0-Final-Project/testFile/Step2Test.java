public class Step2Test {
    public static void main(String[] args) {
        int[][] grid = {
                { -1, 0, -1 },
                { 0, -1, 0 },
                { -1, 0, 0 }
        };
        int[][] outputArray = countMines(grid);
        for (int i = 0; i < outputArray.length; i++) {
            for (int j = 0; j < outputArray[i].length; j++) {
                System.out.print(outputArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] countMines(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;
        int[][] outputArray = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (grid[i][j] == -1) {
                    outputArray[i][j] = -1; // Preserve mines
                } else {
                    int mineCount = 0;
                    for (int x = i - 1; x <= i + 1; x++) {
                        for (int y = j - 1; y <= j + 1; y++) {
                            if (x >= 0 && x < numRows && y >= 0 && y < numCols && grid[x][y] == -1) {
                                mineCount++;
                            }
                        }
                    }
                    outputArray[i][j] = mineCount; // Count mines in the neighboring cells
                }
            }
        }
        return outputArray;
    }
}
