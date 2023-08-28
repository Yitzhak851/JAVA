public class Step1 {
    // receives the size of the grid nxm, and the probabiility of a mine.
	// creates a matching random grid
	public static int[][] createGrid(int n, int m, double p) {
		int[][] grid = new int[n][m];
		for (int row = 0; row < grid.length; row++) {
			for (int j = 0; j < grid[row].length; j++) {
				if (Math.random() < p) {
					grid[row][j] = -1;
				}
			}
		}
		return grid;
	}
    	// Receives a grid, and prints it
	public static void displayGrid(int[][] mineGreed) {
		for (int row = 0; row < mineGreed.length; row++) {
			for (int j = 0; j < mineGreed[row].length; j++) {
				if (mineGreed[row][j] == -1) {
					System.out.print("x ");
				} else {
					System.out.print(mineGreed[row][j] + " ");
				}
			}
			System.out.println();
		}
	}
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);			// get 3
		int m = Integer.parseInt(args[1]);			// get 5
		double p = Double.parseDouble(args[2]);		// get 0.3
		int[][] mineGreed = createGrid(n, m, p);
        displayGrid(mineGreed);

    }
}

// <!-- Step 1:  -->
// Write a function that receives grid-dimensions(10X10) and a probability(0.1)=, 
// and returns a 2d-array of ints with -1 for every mine, and 0 for every non-mine.