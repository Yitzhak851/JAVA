public class MineSweeper {
    public static int[][] openEmptyCells(int row, int col, int[][] gridValue, int[][] gridStatus) {
        // Check if the cell is out of bounds or has already been opened.
        if (row < 0 || row >= gridValue.length || col < 0 || col >= gridValue[0].length || gridValue[row][col] == -5) {
            return gridStatus;
        }

        // Mark the current cell as opened.
        gridStatus[row][col] = -5;

        // If the current cell is empty (value 0), recursively open its neighbors.
        if (gridValue[row][col] == 0) {
            // Define the 8 possible neighbor offsets.
            int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
            int[] dc = { -1, 0, 1, -1, 1, -1, 0, 1 };

            // Iterate through all neighbors.
            for (int i = 0; i < 8; i++) {
                int newRow = row + dr[i];
                int newCol = col + dc[i];

                // Recursively open adjacent empty cells.
                gridStatus = openEmptyCells(newRow, newCol, gridValue, gridStatus);
            }
        }

        return gridStatus;
    }

    public static void main(String[] args) {
        // Example game board and status arrays.
        int[][] board = {
                { 0, 1, 1, 0 },
                { 0, 1, -1, 0 },
                { 0, 0, 1, 1 },
                { 0, 0, 0, -1 }
        };

        int[][] status = new int[4][4]; // Initialize with all zeros (closed cells).

        // Call the openEmptyCells function to open empty cells.
        status = openEmptyCells(1, 2, board, status); // Example: Click on an empty cell.

        // Print the resulting status array.
        for (int[] row : status) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
