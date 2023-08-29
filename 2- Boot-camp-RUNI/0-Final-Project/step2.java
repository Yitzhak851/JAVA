public class step2 {
    public static int[][] updateGrid(int [][] grid) {
        int[][] gridUpdate = grid;

        for(int i=0; i<gridUpdate.length; i++){
            for(int j=0; j<gridUpdate[0].length; j++){
                if(gridUpdate[i][j]!=(-1){
                    for(int k= i; k<){

                    }
                }
            }
        }
    }
    // receives the size of the grid nxm, and the probabiility of a mine.
	// creates a matching random grid
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
        updateGrid(mineGreed);

    }
}

// <!-- Step 2:  -->
// Write a function that receives a grid of mines, changes every 0 to the
// number of adjacent mines, and returns it.