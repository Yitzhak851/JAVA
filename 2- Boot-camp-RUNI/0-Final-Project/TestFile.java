import java.util.*;// Import the Scanner class

public class TestFile {
	public static void main(String[] args) {
		startMessage(); 		//foo()--> startMessage [get 2D arr from user]
		gameInstructions();		//foo()--> gameInstructions
		//foo()--> startGame 
		// int[][] playGreed = createGrid(n, m, p);
		// displayHidden(n,m); 				// print the array of 0 | 0 | 
	}
// foo() startMesage
	public static void gameInstructions() {
		System.out.println("\n|============ Excellent! lets create your game !! ==========|\n");
		System.out.println("Please enter height and width, ");
		System.out.println("of the grid that you want to play ! ");
		System.out.println("and proprty of mines you would like to play (0-1).");
	}
	
// foo() gameInstructions
	public static void startMessage() {
		System.out.println("\n|=============== Welcome to Minesweeper game ! =============|");		
		System.out.println("|The game is very simple! The program should asked for 2    |");
		System.out.println("|integer coordinates (one at a time), and what to do with   |");
		System.out.println("|the tile (0 for left-click, 1 for right click (flag).      |");
		System.out.println("|The grid is then printed If a non-mine tile is chosen,     |");
		System.out.println("|it is replaced with a number signifying the number of      |");
		System.out.println("|mines adjacent to it. If a mine is clicked, the grid so far|");
		System.out.println("|is printed, showing all unflagged mines, and the game ends!|");
	}
//method of palying while true
	// public static void playMethod() {
	// 	System.out.println("\n== Please enter your move(one at a time)==");
	// 	System.out.println("== and what todo with the tile (0=open, 1=flag/unflag): ==\n");
		
	// 	System.out.print("Row (at integer number): "); 
	// 	int x = myObj.nextInt(); 
	// 	System.out.print("Coloum (at integer number): ");
	// 	int y = myObj.nextInt(); 
	// 	System.out.print("Flag or Unflag (0 for open, 1 for flag/un-flag): ");
	// 	int z = myObj.nextInt();
	// }
// Step 0: Get n,m --> return displayHidenGrid 
	// public static void displayHidden(int n, int m){
	// 	int[][] arr = new int[n][m];
	// 	System.out.print("\t ");
	// 	for(int i=0; i<m; i++){
	// 		System.out.print(" " + i + "  ");
	// 	}
	// 	System.out.print("\n");
	// 	for(int i=0; i<m; i++){
	// 		System.out.print(i + "\t| ");
	// 		for(int j=0; j<m; j++){
	// 			if(arr[i][j]==0){
	// 				System.out.print("?");
	// 			}else if(arr[i][j]==100){
	// 				System.out.print("X");
	// 			}else{
	// 				System.out.print(arr[i][j]);
	// 			}
	// 			System.out.print(" | ");
	// 		}
	// 		System.out.print("\n");	
	// 	}
	// }
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
	// public static void displayGrid(int[][] mineGreed) {
	// 	for (int i = 0; i < mineGreed.length; i++) {
	// 		for (int j = 0; j < mineGreed[i].length; j++) {
	// 			if (mineGreed[i][j] == -1) {
	// 				System.out.print("X"); // print X
	// 			} else {
	// 				System.out.print(mineGreed[i][j]); // print "0"
	// 			}
	// 		}
	// 		System.out.println(); // print "/n"
	// 	}
	// }
// Step 2: Get gridMines, changes 0 to number of adjacent mines.
	// public static int[][] updateGrid(int[][] createGrid) {
	// 	int[][] updateGrid = new int[createGrid.length][createGrid[0].length];
	// 	for (int i = 0; i < createGrid.length; i++) {
	// 		for (int j = 0; j < createGrid[0].length; j++) {
	// 			if (createGrid[i][j] == -1) {
	// 				updateGrid[i][j] = -1; // Preserve mines
	// 			} else {
	// 				int mineCount = 0; // count mines in the neighboring cells
	// 				for (int x = (i - 1); x <= (i + 1); x++) {
	// 					for (int y = (j - 1); y <= (j + 1); y++) {
	// 						if (x >= 0 && x < createGrid.length && y >= 0 && y < createGrid[0].length && createGrid[x][y] == -1) {
	// 							mineCount++;
	// 						}
	// 					}
	// 				}
	// 				updateGrid[i][j] = mineCount;
	// 			}
	// 		}
	// 	}
	// 	return updateGrid;
	// }
// Step 2: Get n*m sizes op grid --> returns mapGrid status (status value def = 9)
	// public static int[][] mapGrid(int n, int m) {
	// 	int[][] mapGrid = new int[n][m]; // f.x: 10X10
	// 	for (int i = 0; i < mapGrid.length; i++) {
	// 		for (int j = 0; j < mapGrid[i].length; j++) {
	// 			mapGrid[i][j] = 9;
	// 		}
	// 	}
	// 	return mapGrid;
	// }
// Step 3: Get coordinate, and returns the value in that coordinate.
	// public static int returnVal(int a, int b) {
	// 	int res = 1;
	// 	return res;
	// }
}


		// System.out.println("\n\n================Welcome to Minesweeper ! ================\n");
        // setupField(1);
        // boolean flag = true;
        // while(flag){
        //     displayVisible();
        //     flag = playMove();
        //     if(checkWin()){
        //         displayHidden();
        //         System.out.println("\n================You WON!!!================");
        //         break;
        //     }
        // }
        // MineSweeper M = new MineSweeper();
        // M.startGame();

				// while (statusGame!=-1) {
			//play- 
			//chose 0,0,0
			//methot chekcell- 
			//
		// }
		//print - you lose


	// 	{
	// 	Scanner s = new Scanner(System.in);
	// 	System.out.print("Height (at integer number): "); 
	// 	int n = s.nextInt(); 
	// 	Scanner sc = new Scanner(System.in);
	// 	System.out.print("Width (at integer number): ");
	// 	int m = sc.nextInt(); 
	// 	Scanner sca = new Scanner(System.in);
	// 	System.out.print("Proprty (at double number between 0-1): ");
	// 	double p = sca.nextDouble(); 
	// }

	// 	System.out.println("\n============== Start play ! this is your grid: (good luck!) ==============\n");

