public class FinalProject {
	// function that receives a coordinate, and returns the value in that coordinate.
	public static int valOnCoor(int a, int b, int[][] arr) {
        int res = arr[a][b];
        return res;
    }
    //receives grid with mines, changes every 0 to the number of adjacent mines, and returns it.
    public static int[][] checkMine (int[][] inputArray) {
        int numRows = inputArray.length;
        int numCols = inputArray[0].length;
        int[][] outputArray = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (inputArray[i][j] == -1) {
                    outputArray[i][j] = -1; // Preserve mines
                }
                // count mines in the neighboring cells
                int mineCount = 0;
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
        return outputArray;
    }
    // receives size of grid nXm, and probabiility of a mine >> creates a matching random grid.
	public static int[][] createGrid(int n, int m, double p) {
		int[][] grid = new int[n][m];                       //f.x: 10X10
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
					System.out.print("X");          //print X
				} else {
					System.out.print(mineGreed[i][j]);  //print "0"
				}
			}
			System.out.println();                   //print "/n"
		}
	}
    public static void main(String[] args) {
        int n = 10;         //Integer.parseInt(args[0]);			// get 10
		int m = 10;         //Integer.parseInt(args[1]);			// get 10
		double p = 0.1;     //Double.parseDouble(args[2]);		    // get 0.1
		int[][] mineGreed = createGrid(n, m, p);
        displayGrid(mineGreed);  //Receives a grid, and prints it(with mines)
        System.out.println();
        displayGrid(checkMine(mineGreed));  //Receives a grid, and prints it(with mines)
		int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        valOnCoor(a, b, checkMine(mineGreed));
    }
}