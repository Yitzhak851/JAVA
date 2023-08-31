public class FinalProject {
	public static void main(String[] args) {
		System.out.println("\n\n================Welcome to Minesweeper ! ================\n");//chose coor
		int n = 10; // Integer.parseInt(args[0]); // get 10
		int m = 10; // Integer.parseInt(args[1]); // get 10
		double p = 0.1; // Double.parseDouble(args[2]); // get 0.1
		int[][] playGreed = createGrid(n, m, p);
		displayGrid(playGreed);
		System.out.println();
		displayGrid(mapGrid(n, m)); // print the array of 1111
		System.out.println();
		System.out.println("Please give me cordination of something: "); // chose some cordinate
		int a = Integer.parseInt(args[0]); //
		int b = Integer.parseInt(args[1]); //
		System.out.println();
		// displayGrid(changeGrid(a, b, mapGrid(n, m), updateGrid(mineGreed))); // - newgrid with the cell that the user open
		displayGrid(addFlagToGrid(a,b, mapGrid(n, m)));

		// displayGrid(mineGreed); // Receives a grid, and prints it(with mines)
		// System.out.println();

		// displayGrid(updateGrid(mineGreed)); // Receives a grid, and prints it(with mines)
		// System.out.println();
		// System.out.println();
	}
// Step 1: Get n,m,p% mine --> return createGrid 
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
// Step 1: Get grid[][] --> return print it -1=x, else=0
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
// Step 2: Get gridMines, changes 0 to number of adjacent mines.
	public static int[][] updateGrid(int[][] createGrid) {
		int[][] updateGrid = new int[createGrid.length][createGrid[0].length];
		for (int i = 0; i < createGrid.length; i++) {
			for (int j = 0; j < createGrid[0].length; j++) {
				if (createGrid[i][j] == -1) {
					updateGrid[i][j] = -1; // Preserve mines
				} else {
					int mineCount = 0; // count mines in the neighboring cells
					for (int x = (i - 1); x <= (i + 1); x++) {
						for (int y = (j - 1); y <= (j + 1); y++) {
							if (x >= 0 && x < createGrid.length && y >= 0 && y < createGrid[0].length && createGrid[x][y] == -1) {
								mineCount++;
							}
						}
					}
					updateGrid[i][j] = mineCount;
				}
			}
		}
		return updateGrid;
	}
// Step 2: Get n*m sizes op grid --> returns mapGrid status (status value def = 9)
	public static int[][] mapGrid(int n, int m) {
		int[][] mapGrid = new int[n][m]; // f.x: 10X10
		for (int i = 0; i < mapGrid.length; i++) {
			for (int j = 0; j < mapGrid[i].length; j++) {
				mapGrid[i][j] = 9;
			}
		}
		return mapGrid;
	}
// Step 3: Get coordinate, and returns the value in that coordinate.
	public static int returnVal(int a, int b) {
		int res = arr[a][b];
		return res;
	}
// Step 4: Get coordinate + mapGrid + minegrid --> return opengrid
	public static int[][] changeGrid(int a, int b, int[][] mapGrid, int[][] updateGrid) {
		if (updateGrid[a][b] == -1) {
			System.out.println("\n\n================ Game over ! ================\n");
		} else if (updateGrid[a][b] == 0) {
			for (int i = (a - 1); i <= (a + 1) ; i++) {
				for (int j = (b - 1); j <= (b + 1); j++) {
					if (i >= 0 && i < updateGrid.length && j >= 0 && j < updateGrid[0].length) {
						mapGrid[i][j] = updateGrid[i][j];
						if(mapGrid[i][j]==0){
							for(int x = i-1; x<=i+1; x++){
								for(int y = j-1; y<=j+1; y++){
									if (x >= 0 && x < updateGrid.length && y >= 0 && y < updateGrid[0].length){
										mapGrid[x][y]= updateGrid[x][y];
									}
								}
							}
						}
					}
				}
			}
		} else {
			mapGrid[a][b] = updateGrid[a][b];
		}
		return mapGrid;
	}
// Step 5: Get coordinate + mapGrid --> return "FLAG"
	public static int[][] addFlagToGrid(int a, int b, int[][] mapGrid) {
		int [][] arr = mapGrid;
		arr[2][2]=8;
		if(arr[a][b] != 8){
			arr[a][b] = 8;
		} else {
			arr[a][b] = 9;
		}
		return arr;
	}
// Step 6: Get updateGrid + mapGrid --> prints the display the user should have.
	public static int[][] changeGrid( int[][] updateGrid, int[][] mapGrid) {
		int[][] arr = new int[mapGrid.length][mapGrid[0].length];
		
		return arr;
	}
}