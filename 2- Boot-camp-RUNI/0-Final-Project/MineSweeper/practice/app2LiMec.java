import java.util.Scanner;

public class app2LiMec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize game parameters.
        int row = Integer.parseInt(args[0]); // chek and understood
        int col = Integer.parseInt(args[1]); // chek and understood
        double probability = Double.parseDouble(args[2]); // chek and understood
        int[][] grid = createGrid(row, col, probability); // chek and understood (-1) + (0)
        int[][] seen = createSeenGrid(row, col); // chek and understood
        // Calculate adjacent mines for both grids.
        grid = calculateAdjacentMines(grid);  // chek and understood
        seen = calculateAdjacentMines(seen);  // chek and understood
        boolean gameOver = false;  // chek and understood
        boolean gameWon = false;  // chek and understood

        while (!gameOver) {
            displayGrid(seen);
            System.out.print("Enter row and column (example: 1 2) or 'flag row col': ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Game quit.");
                break;
            }

            String[] coordinate = input.split(" "); // Splits user's input into array of strings using space as the delimiter.
            if (coordinate.length == 2) {
                int x = Integer.parseInt(coordinate[0]);
                int y = Integer.parseInt(coordinate[1]);
                if (isValidCoordinate(x, y, row, col)) {
                    if (grid[x][y] == -1) {
                        gameOver = true; // If the selected tile contains a mine (value is -1), the game is over, and
                                         // gameOver is set to true.
                    } else if (grid[x][y] == 0 && seen[x][y] == 0) {
                        click(x, y, seen, grid); // If the selected tile is empty (value is 0) and has not been
                                                 // previously revealed, the click method is called to reveal this and
                                                 // neighboring tiles.
                    } else if (grid[x][y] > 0 && seen[x][y] == 0) {
                        seen[x][y] = grid[x][y]; // If the selected tile contains a number (greater than 0) and has not
                                                 // been previously revealed, it is revealed with the same number.
                    } else if (seen[x][y] != -9) {
                        System.out.println("Tile already revealed.");
                    }
                } else {
                    System.out.println("Invalid coordinates. Try again.");
                }
            } else if (coordinate.length == 3 && coordinate[0].equalsIgnoreCase("flag")) { // This checks if: the length
                                                                                           // of the coordinate array is
                                                                                           // 3, and the first element
                                                                                           // of the coordinate array is
                                                                                           // equal to the string
                                                                                           // "flag".
                int x = Integer.parseInt(coordinate[1]);
                int y = Integer.parseInt(coordinate[2]);

                if (isValidCoordinate(x, y, row, col)) {
                    if (seen[x][y] == -9) {
                        seen[x][y] = 0; // Unflag
                    } else if (seen[x][y] == 0) {
                        seen[x][y] = -9; // Flag
                    }
                } else {
                    System.out.println("Invalid coordinates. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter coordinates (example: '1 2') or 'flag row col'.");
            }

            gameWon = isGameWon(seen, grid);
            if (gameWon) {
                System.out.println("Congratulations! You win!");
                displayGrid(grid);
                break;
            } else if (gameOver) {
                System.out.println("Game over. You hit a mine!");
                displayGrid(grid);
            }
        }

        scanner.close();
    }

    // Creates the game grid with mines and empty cells.
    public static int[][] createGrid(int row, int col, double probability) {
        int[][] grid = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (Math.random() < probability) {
                    grid[i][j] = -1; // Mine
                } else {
                    grid[i][j] = 0; // Non-Mine
                }
            }
        }
        return grid;
    }

    // Creates the gridStatus with 0.
    public static int[][] createSeenGrid(int row, int col) {
        int[][] seen = new int[row][col];
        return seen;
    }

    // Displays the current state of the grid.
    public static void displayGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == -9) {
                    System.out.print("F ");
                } else if (grid[i][j] == -7) {
                    System.out.print("V ");
                } else if (grid[i][j] == -1) {
                    System.out.print("X ");
                } else {
                    System.out.print(grid[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Calculates + updates the grid with num of adjacent mines for each '0'.
    public static int[][] calculateAdjacentMines(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;
        int[][] updatedGrid = new int[numRows][numCols];
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (grid[row][col] == 0) {
                    // Calculate the number of adjacent mines
                    int adjacentMines = countAdjacentMines(grid, row, col);
                    updatedGrid[row][col] = adjacentMines;
                } else {
                    updatedGrid[row][col] = grid[row][col];
                }
            }
        }
        return updatedGrid;
    }

    // Counts the number of adjacent mines for a given cell.
    public static int countAdjacentMines(int[][] grid, int row, int col) {
        int count = 0;
        int numRows = grid.length;
        int numCols = grid[0].length;
        // Iterate over adjacent cells,
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                // Skip the current cell.
                if (r == row && c == col) {
                    continue;
                }
                // Check if the adjacent cell is within the grid boundaries.
                if (r >= 0 && r < numRows && c >= 0 && c < numCols) {
                    // Check if the adjacent cell contains a mine.
                    if (grid[r][c] == -1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // Check whether a given pair of coordinates falls within the valid range of a
    // grid with rows and columns.
    public static boolean isValidCoordinate(int x, int y, int row, int col) {
        return x >= 0 && x < row && y >= 0 && y < col;
    }

    /*
     * When we use the click function:
     * -We check if the index is out of bound.
     * -We check if we clicked on a mine.
     * -We check if we clicked on a number.
     * -If not both, then the tile is empty and we mark it as checked (-7) and click
     * on the tiles around it.
     */
    public static int[][] click(int x, int y, int[][] seen, int[][] grid) {
        int numRows = seen.length;
        int numCols = seen[0].length;
        // Check if the tile is out of bounds.
        if (x < 0 || x >= numRows || y < 0 || y >= numCols) {
            return seen;
        }
        // Check if the tile has already been clicked or is a mine.
        if (seen[x][y] != 0 || grid[x][y] == -1) {
            return seen;
        }
        // Reveal the tile.
        seen[x][y] = grid[x][y];
        // Check if the tile is empty.
        if (grid[x][y] == 0) {
            // Mark the tile as empty.
            seen[x][y] = -7;
            // Continuely call the click function for adjacent empty tiles.
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int neighborX = x + i;
                    int neighborY = y + j;
                    // Ensure that the neighbor coordinates are valid.
                    if (isValidCoordinate(neighborX, neighborY, numRows, numCols)) {
                        // Continuely reveal the neighbor tile if it has not already been revealed or
                        // flagged.
                        seen = click(neighborX, neighborY, seen, grid);
                    }
                }
            }
        }
        // Stop revealing further tiles if the tile is a number (1 to 9).
        return seen;
    }

    public static boolean isGameWon(int[][] seen, int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        // Iterate through the grid to check for win conditions.
        for (int x = 0; x < numRows; x++) {
            for (int y = 0; y < numCols; y++) {
                // If there is a mine that is not flagged, the game is not won.
                if (grid[x][y] == -1 && seen[x][y] != -9) {
                    return false;
                }
                // If there is an empty tile that is not revealed, the game is not won.
                if (grid[x][y] == 0 && seen[x][y] == 0) {
                    return false;
                }
            }
        }

        // If no mines are left and all tiles are revealed or flagged, the game is won.
        return true;
    }
}
