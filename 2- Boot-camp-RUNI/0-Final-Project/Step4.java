public class Step4 {
    	//get statusgrid and minegrid and return opengrid
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
    public static void main(String[] args) {
		int n = 10; // Integer.parseInt(args[0]); // get 10
		int m = 10; // Integer.parseInt(args[1]); // get 10
		double p = 0.1; // Double.parseDouble(args[2]); // get 0.1
		createGrid(n, m, p);
		
    }
}

// <!-- Step 4:  -->
// Write a function that receives a coordinate, and a 2d-array 
//of ints of the current status of all tiles, 
//“clicks” the value in it, and returns the 2d-array of the current status of all the tiles.

// Bonus step 4.1: If a clicked tile has no mine neighbors – automatically “click” all
// adjacent tiles (and keep going).

