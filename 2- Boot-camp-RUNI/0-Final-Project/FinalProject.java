public class FinalProject {
	public static int[][] changeGrid(int a, int b, int[][] createStatus, int[][] mineGreed) {
		if (mineGreed[a][b] == -1) {
			System.out.println("\n\n================ Game over ! ================\n");
		} else if (mineGreed[a][b] == 0) {
			for (int i = (a - 1); i <= (a + 1) ; i++) {
				for (int j = (b - 1); j <= (b + 1); j++) {
					if (i >= 0 && i < mineGreed.length && j >= 0 && j < mineGreed[0].length) {
						createStatus[i][j] = mineGreed[i][j];
						if(createStatus[i][j]==0){
							for(int x = i-1; x<=i+1; x++){
								for(int y = j-1; y<=j+1; y++){
									if (x >= 0 && x < mineGreed.length && y >= 0 && y < mineGreed[0].length){
										createStatus[x][y]= mineGreed[x][y];
									}
								}
							}
						}
					}
				}
			}
		} else {
			createStatus[a][b] = mineGreed[a][b];
		}
		return createStatus;
	}

	public static int[][] createStatus(int a, int b) {
		int[][] grid = new int[a][b]; // f.x: 10X10
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = 9;
			}
		}
		return grid;
	}

	// function that receives a coordinate, and returns the value in that
	// coordinate.
	public static int valOnCoor(int a, int b, int[][] arr) {
		int res = arr[a][b];
		return res;
	}

	// receives grid with mines, changes every 0 to the number of adjacent mines,
	// and returns it.
	public static int[][] checkMine(int[][] inputArray) {
		int numRows = inputArray.length;
		int numCols = inputArray[0].length;
		int[][] outputArray = new int[numRows][numCols];
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				if (inputArray[i][j] == -1) {
					outputArray[i][j] = -1; // Preserve mines
				} else {
					int mineCount = 0; // count mines in the neighboring cells
					for (int x = (i - 1); x <= (i + 1); x++) {
						for (int y = (j - 1); y <= (j + 1); y++) {
							if (x >= 0 && x < numRows && y >= 0 && y < numCols && inputArray[x][y] == -1) {
								mineCount++;
							}
						}
					}
					outputArray[i][j] = mineCount;
				}
			}
		}
		return outputArray;
	}

	// receives size of grid nXm, and probabiility of a mine >> creates a matching
	// random grid.
	public static int[][] createGrid(int n, int m, double p) {
		int[][] grid = new int[n][m]; // f.x: 10X10
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (Math.random() < p) {
					grid[i][j] = -1;
				}
			}
		}
		return grid;
	}

	// Receives a grid, and prints it
	public static void displayGrid(int[][] mineGreed) {
		for (int i = 0; i < mineGreed.length; i++) {
			for (int j = 0; j < mineGreed[i].length; j++) {
				if (mineGreed[i][j] == -1) {
					System.out.print("X"); // print X
				} else {
					System.out.print(mineGreed[i][j]); // print "0"
				}
			}
			System.out.println(); // print "/n"
		}
	}

	public static void main(String[] args) {
		System.out.println("\n\n================Welcome to Minesweeper ! ================\n"); // chose some cordinate

		int n = 10; // Integer.parseInt(args[0]); // get 10
		int m = 10; // Integer.parseInt(args[1]); // get 10
		double p = 0.1; // Double.parseDouble(args[2]); // get 0.1
		int[][] mineGreed = createGrid(n, m, p);
		displayGrid(createStatus(n, m)); // print the array of 1111
		System.out.println();
		System.out.println("Please give me cordination of something: "); // chose some cordinate
		int a = Integer.parseInt(args[0]); //
		int b = Integer.parseInt(args[1]); //

		displayGrid(changeGrid(a, b, createStatus(n, m), checkMine(mineGreed))); // - newgrid with the cell that the
																					// user open
		System.out.println();

		displayGrid(mineGreed); // Receives a grid, and prints it(with mines)
		System.out.println();

		displayGrid(checkMine(mineGreed)); // Receives a grid, and prints it(with mines)
		System.out.println();

		System.out.println();

	}
}