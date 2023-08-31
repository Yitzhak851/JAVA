import java.util.Scanner;  // Import the Scanner class
public class FinalProject {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("\n=============== Welcome to Minesweeper game ! ============ ");
		System.out.println("Please enter height and width, ");
		System.out.println("of the grid that you want to play ! ");
		System.out.println("and proprty of mines you would like to play (0-1).");
		System.out.print("Height (at integer number): "); 
		int n = myObj.nextInt(); 
		System.out.print("Width (at integer number): ");
		int m = myObj.nextInt(); 
		System.out.print("Proprty (at double number between 0-1): ");
		double p = myObj.nextDouble(); 
		System.out.println("\n============== Excellent! lets tell you how the game work ==============\n");
		System.out.println("The game is very simple!");
		System.out.println("The program should asked for 2 integer coordinates (one at a time), ");
		System.out.println("and what to do with the tile (0 for left-click, 1 for right click (flag).");
		System.out.println("The grid is then printed If a non-mine tile is chosen, ");
		System.out.println("it is replaced with a number signifying the number of mines adjacent to it.");
		System.out.println("If a mine is clicked, the grid so far is printed, showing all unflagged mines,");
		System.out.println("and the game ends!");
		System.out.println("\n============== Start play ! this is your grid: (good luck!) ==============\n");
		int[][] playGreed = createGrid(n, m, p);
		displayGrid(mapGrid(n, m)); // print the array of 9999

		// while (game==true) {
			//play
		// }
		//print - you lose

		
		System.out.println("\n== Please enter your move(one at a time)==");
		System.out.println("== and what todo with the tile (0=unflag, 1=flag): ==\n");
		System.out.print("Row (at integer number): "); 
		int x = myObj.nextInt(); 
		System.out.print("Coloum (at integer number): ");
		int y = myObj.nextInt(); 
		System.out.print("Flag or Unflag (0 for un-flag, 1 for flag): ");
		int z = myObj.nextInt();

// Step 9: displayGrid(gameMethod);
//method: public static [][] gameMethod(x,y,z,[][]map,[][]grid){
			//crete[][] arr
			//
			//return arr map+opencel
			//if cell==-1 - boolen game= false
			//play 
// 		  } 
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
		int res = 1;
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
		//display the user should have
		//change the mapGrid[][] to the changeGrid[][]
		//	display(changeGrid(int[][] updateGrid, int[][] mapGrid));
		return arr;
	}
// Step 7: Get status and mineGrid --> returns if the game is complete.
}
//Step 8: Understand how to get user input for the coordinates. 
// Write a matching function for getting user input (clicks/flags). 
// Include handling for invalid inputs (flagging a marked tile, tile that doesn’t exist, and so on).
// Step 8: Connect everything.
// Bonus Step – split to functions in more places that make sense – such as the user input.
// Bonus Step – think about runtime. Are there are times you go over the entirety of a 2d grid (which takes a long time) and you don’t actually need to?


// Checklist before submission:
//[] Can you play your game?
//[] Is the game making sense? 
//[] Are the games’ rules being followed by the computer?
//[] Does it tell you if you lost, and stop the game correctly?
//[] Does it tell you if you win, and stop the game correctly?
//[] Can you break your game with type-correct input 
//[] (so its fine if your game crashes when given a string when it expects an int. It shouldn’t crash if you try to access tile [7][7] in a 4x4 array, just tell the user and way for a different response.
//[] Is there repeated code?
//[] Is everything using conventions? 
//[] This includes indentation, variable naming, variable typing, method naming, and other things I’m probably not thinking about currently.