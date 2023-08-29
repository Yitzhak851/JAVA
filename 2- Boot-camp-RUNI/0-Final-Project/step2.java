public class Step2 {
    //receives grid with mines, changes every 0 to the number of adjacent mines, and returns it.
    public static int[][] updateGrid(int [][] grid) {
        int[][] updateGrid = grid;
        for(int i=0; i<updateGrid.length; i++){
            for(int j=0; j<updateGrid[0].length; j++){
                if(j==0){
                    if(updateGrid[i][j]==(-1)){
                    updateGrid[i][(j+1)]=1;
                    }
                } else if (j>0 && j<updateGrid[0].length) {
                    if(updateGrid[i][j]==(-1)){
                    updateGrid[i][(j-1)]=1;
                    updateGrid[i][(j+1)]=1;
                    }
                }else{
                    updateGrid[i][(j-1)]=1;
                }
            }
        }
        return updateGrid;
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
					System.out.print("X");
				} else {
					System.out.print(mineGreed[i][j]);
				}
			}
			System.out.println();
		}
	}
    public static void main(String[] args) {
        int n = 10;         //Integer.parseInt(args[0]);			// get 10
		int m = 10;         //Integer.parseInt(args[1]);			// get 10
		double p = 0.1;     //Double.parseDouble(args[2]);		    // get 0.1
		int[][] mineGreed = createGrid(n, m, p);
        displayGrid(mineGreed);  //Receives a grid, and prints it(with mines)
        System.out.println();
        displayGrid(updateGrid(mineGreed));  //Receives a grid, and prints it(with mines)
        
    }
}
