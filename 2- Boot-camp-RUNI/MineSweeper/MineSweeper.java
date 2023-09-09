/**
 * This class contain a "minesweeper" game.
 * @author (Yitzhak baror)
 * @version (03.09.2023)
 */
import java.util.Scanner;   // import the Scanner class
public class MineSweeper {  // start the public class MineSweeper
/* This method getting from the user sizes of the grid,
 * and return the grid with value of (-1) or (0) .
 */
    public static int[][] buildGrid(int n, int m, double p) {
		int[][] fieldHidden = new int[n][m];
		for (int i = 0; i < fieldHidden.length; i++) {
			for (int j = 0; j < fieldHidden[i].length; j++) {
				if (Math.random() < p) {
					fieldHidden[i][j] = (-1);
				} else {
					fieldHidden[i][j] = (0);
				}
			}
		}
		return fieldHidden;
	}
/* This method getting the grid with value of (-1) or (0) .
 * @mineCount -  count all the mines. near all tile with mines .
 * @return - tile with value that represent the sum of the mine near this tile. 
 */
    public static int[][] setupGrid(int[][] gridValue) {
		for (int i = 0; i < gridValue.length; i++) {
			for (int j = 0; j < gridValue[0].length; j++) {
				if (gridValue[i][j] == (-1) ){
					gridValue[i][j] = (-1);
				} else {
					int mineCount = 0; 
					for (int x = (i - 1); x <= (i + 1); x++) {
						for (int y = (j - 1); y <= (j + 1); y++) {
                            // Only if there is a mine in 8 squares around me count it,and only if the 8 squares are in the boundaries of the board
							if (x >= 0 && x < gridValue.length && y >= 0 && y < gridValue[0].length && gridValue[x][y] == (-1)) {
								mineCount++;
							}
						}
					}
                    // here i declrate the sum of the mines in the tile
					gridValue[i][j] = mineCount;
				}
			}
		}
		return gridValue;
	}
/* This method get number that represent flag/ open tile , coordinate and 2 array.
*  and return number of the coordinate.
*  if the number inside the tile is (-1) - founction at name flage get it
* and stop the game - otherwise the game continue.
*/
    public static int valCoor(int a, int b,int c, int[][] gridValue, int[][] gridStatus ){
        int res=0;
        if (c==1){
            res = gridValue[a][b];
            return res;
        } else{
            res = gridStatus[a][b];
            return res;
        }
	}

    public static int[][] openEmptyCells(int row, int col, int[][] gridValue, int[][] gridStatus) {
        // Check if the cell is out of bounds or has already been opened.
        if (row < 0 || row >= gridValue.length || col < 0 || col >= gridValue[0].length || gridStatus[row][col] == -5) {
            return gridStatus;
        }
        
        // Mark the current cell as opened.
    	gridStatus[row][col] = -5;
        
        // If the current cell is empty (value 0), recursively open its neighbors.
        if (gridValue[row][col] == 0) {
            // Define the 8 possible neighbor offsets.
            int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
            
            // Iterate through all neighbors.
            for (int i = 0; i < 8; i++) {
                int newRow = row + dr[i];
                int newCol = col + dc[i];
                
                // Recursively open adjacent empty cells.
                gridStatus = openEmptyCells(newRow, newCol, gridValue, gridStatus);
            }
        }
        
        return gridStatus;
    }


/* This method getting moves from user enter.
* and return int[][] array display of gridStatus
* if user choose coordinate with (-1) print GAME OVER and return gridValue and print it.
*/
    public static int[][] playMove(int a, int b,int c, int[][] gridValue, int[][] gridStatus){
        if(gridValue[a][b]== -1 && c==1){
            System.out.println("\n\t========GAME OVER!========\n");
            return gridValue;
        } else if (gridValue[a][b] == 0 && c==1){
            gridStatus[a][b] = -5;
            gridStatus = openEmptyCells(a,b, gridValue,gridStatus);
            return gridStatus;
        }else if ((gridValue[a][b] != 0 && gridValue[a][b] != -1)&&(c==1)){
            gridStatus[a][b] = gridValue[a][b];
            return gridStatus;
//--------------------------------------------------------------------------
        }else if(gridStatus[a][b]== -7 && c==0) {
            gridStatus[a][b] = -9;
            return gridStatus;
        } else if(gridStatus[a][b]== -9 && c==0 ){
            gridStatus[a][b] = -7;
            return gridStatus;
        } else if (gridStatus[a][b] == -5 && c==0){
            gridStatus[a][b] = -9;
            return gridStatus;
//--------------------------------------------------------------------------            
        } else {
            return gridStatus;
        }
	}
/* This method display the moves that the user enter.
* this method get int[][] array ant return display of gridStatus
* the number (-5) = represent tile that "isopen" = [ ]
* the number (-7) = represent tile that "isClose" = [?]
* the number (-9) = represent tile that "isFlag" = [F]
* the number (num) = represent tile that "isNum" = [num]
* the number (-1) = represent tile that "isMine" = [X]
*/
    public static int[][] displayStatus(int[][] gridStatus){
		System.out.print("\t ");
		for(int i=0; i<gridStatus.length; i++){
			System.out.print(" " + i + "  ");
		}
		System.out.print("\n");
		for(int i=0; i<gridStatus.length; i++){
			System.out.print(i + "\t| ");
			for(int j=0; j<gridStatus.length; j++){
				if(gridStatus[i][j]== -5 ){
					System.out.print(" ");
				} else if(gridStatus[i][j]== -7 ) {
					System.out.print("?");
                }else if(gridStatus[i][j]!=-1 && gridStatus[i][j]!=0 && gridStatus[i][j]!= -9){
					System.out.print(gridStatus[i][j]);
                } else if (gridStatus[i][j]== -9){
                    System.out.print("F");
                }else if(gridStatus[i][j] == 0){
					System.out.print(" ");                    
                }else{
                    System.out.print("X");
                }
				System.out.print(" | ");
			}
			System.out.print("\n");	
		}
		return gridStatus;
	} 
/* This method is the condition if the game can continue.
* if the user enter (-1) so the flag is false and "GAME OVER".
*/    
    public static boolean game(int a) {
        if(a==-1){
            return false;
        } else{
            return true;
        }
    }
/* This method is the condition if the game finish.
* if the gridStatus equal to gridValue.
* the user win!
*/
    public static boolean checkWin(int[][] gridValue, int[][] gridStatus) {
        for(int i=0; i<gridValue.length; i++){
            for(int j=0; j<gridValue[0].length; j++){
                if(gridValue[i][j]==-1 && (gridStatus[i][j]==-9 || gridStatus[i][j]==-7 ) ){
                    if(gridValue[i][j]!= -1 && (gridStatus[i][j]==-5 || gridStatus[i][j]==gridValue[i][j] )){
                        return true;
                    }
                }
            }
        }
        int count=0;
        for(int i=0; i<gridValue.length; i++){
            for(int j=0; j<gridValue[0].length; j++){
                if(gridValue[i][j]!= -1 && (gridStatus[i][j]==-5 || gridStatus[i][j]==gridValue[i][j] )){
                    count++;
                }
            }
        }
        if(count==(gridValue.length)*(gridValue[0].length)){
            return true;
        }
        return false;
    }
// small method that telling the user some instructers about the game
    public static void gameInstructions(){
		System.out.println("Please enter height and width, ");
		System.out.println("of the grid that you want to play ! ");
		System.out.println("and proprty of mines you would like to play (0-1).");
	}
/* This  is the main method.
*  this method play the game.
*  this method get from the user sizes of the game.
*  and build the grid game. 
*/
    public static void main(String[] args) {
        gameInstructions();
        Scanner s = new Scanner(System.in);
		System.out.print("Height (integer number between 0-20): ");
		int n = s.nextInt(); 
		while(n <= 0 || n >= 20){
			System.out.println("Incorrect Input!!");
			System.out.print("Please Enter number between 0-20 again: ");
			n= s.nextInt();
		}
		System.out.print("Width (integer number between 0-20): ");
		int m = s.nextInt(); 
		while(m <= 0 || m >= 20){
			System.out.println("Incorrect Input!!");
			System.out.print("Please Enter number between 0-20 again: ");
			m= s.nextInt();
		}
		System.out.print("Proprty (at double number between 0-1): ");
		double p = s.nextDouble();
		while(p < 0 || p > 1){
			System.out.println("Incorrect Input!!");
			System.out.print("Please Enter number between 0-1 again: ");
			p = s.nextInt();
		}
        int [][] gridValue = setupGrid(buildGrid(n,m,p));
        int[][] gridStatus = new int[gridValue.length][gridValue[0].length];
        for(int i=0; i<gridStatus.length; i++){
            for(int j=0; j<gridStatus[0].length; j++){
                gridStatus[i][j] = -7;
            }
        }
        System.out.println("\n\t======= Grate, this is your grid, good luck! ====== \n");
        displayStatus(gridStatus);
        boolean flag= true;
//--------------------------------------------------------------------------        
        while(flag){
            Scanner scan = new Scanner(System.in);
            System.out.print("\n\tEnter Row Number: ");
            int a = scan.nextInt();
            while(a < 0 || a >= gridValue.length){
			    System.out.println("Incorrect Input!!");
			    System.out.print("Please Enter number between grid length again: ");
			    a = s.nextInt();
		    }
            System.out.print("\tEnter Column Number: ");
            int b = scan.nextInt();
            while(b < 0 || b >= gridValue[0].length){
			    System.out.println("Incorrect Input!!");
			    System.out.print("Please Enter number between grid length again: ");
			    b = s.nextInt();
		    }            
            System.out.print("\tEnter 1=open/close, 0=flag/unflag: ");
            int c = scan.nextInt();
            while(c < 0 || c > 1){
			    System.out.println("Incorrect Input!!");
			    System.out.print("Please Enter number between 0-1: ");
			    c = s.nextInt();
		    }                 
            System.out.println("\tThe value on the coordinate: " + valCoor(a,b,c,gridValue,gridStatus)+"\n");
            displayStatus(playMove(a,b,c, gridValue,gridStatus));
            boolean win = false;
            win = checkWin(gridValue, gridStatus);
            if(win){
                System.out.println("\n\t==========You win !!============\n");
                flag=false;
            }else{
                flag = game(valCoor(a, b, c, gridValue, gridStatus));
            }
        }
    }	
}// end the public class MineSweeper