import java.util.Scanner;// Import the Scanner class
public class MineSweeper {
	public static void main(String[] args) {
		int n = 10; 
		int m = 10; 
		double p = 0.1;
		int [][] gridValue = setupGrid(buildGrid(n,m,p));
        int[][] gridStatus = new int[gridValue.length][gridValue[0].length];
        for(int i=0; i<gridStatus.length; i++){
            for(int j=0; j<gridStatus[0].length; j++){
                gridStatus[i][j] = -7;
            }
        }
        boolean flag= true;
        while(flag){
            Scanner s = new Scanner(System.in);
            System.out.print("\n\tEnter Row Number: ");
            int a = s.nextInt();
            System.out.print("\tEnter Column Number: ");
            int b = s.nextInt();
            System.out.println("\tThe value on the coordinate: " + valCoor(a,b,gridValue)+"\n");
            displayStatus(playMove(a,b,gridValue,gridStatus));
            flag = game(valCoor(a, b, gridValue));        
        }
	}		
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
    public static int[][] setupGrid(int[][] fieldHidden) {
		for (int i = 0; i < fieldHidden.length; i++) {
			for (int j = 0; j < fieldHidden[0].length; j++) {
				if (fieldHidden[i][j] == (-1) ){
					fieldHidden[i][j] = (-1);
				} else {
					int mineCount = 0; 
					for (int x = (i - 1); x <= (i + 1); x++) {
						for (int y = (j - 1); y <= (j + 1); y++) {
                            //TODO - to right here what is the logic
							if (x >= 0 && x < fieldHidden.length && y >= 0 && y < fieldHidden[0].length && fieldHidden[x][y] == (-1)) {
								mineCount++;
							}
						}
					}
					fieldHidden[i][j] = mineCount;
				}
			}
		}
		return fieldHidden;
	}
	public static int valCoor(int a, int b, int[][] gridValue ){
        int res = gridValue[a][b];
		return res;
	}
	public static int[][] playMove(int a, int b, int[][] gridValue, int[][] gridStatus){
        if(gridValue[a][b]== -1){
            System.out.println("\n\t========GAME OVER!========\n");
            gridStatus=gridValue;
            return gridStatus;
        } else if (gridValue[a][b] == 0){
            gridStatus[a][b] = -5;
            return gridStatus;
        } else {
            gridStatus[a][b] = gridValue[a][b];
            return gridStatus;
        }
	}
	/*This method represent the moves that the user enter.
     * this method get int[][] array ant return display of gridStatus
     * the number (-5) = represent tile that "isopen" = [ ]
     * the number (-7) = represent tile that "isClose" = [?]
     * the number (-9) = represent tile that "isFlag" = [>]
     * the number (num) = represent tile that "isFlag" = [num]
     * the number (-1) = represent tile that "isMine" = [X]
     * 
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
                }else if(gridStatus[i][j]!=-1 && gridStatus[i][j]!=0){
					System.out.print(gridStatus[i][j]);
                }else if(gridStatus[i][j]== 0){
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
	public static int[][] displayValue(int[][] gridValue){
		System.out.print("\t ");
		for(int i=0; i<gridValue.length; i++){
			System.out.print(" " + i + "  ");
		}
		System.out.print("\n");
		for(int i=0; i<gridValue.length; i++){
			System.out.print(i + "\t| ");
			for(int j=0; j<gridValue.length; j++){
				if(gridValue[i][j]==0){
					System.out.print(" ");
				} else if(gridValue[i][j]==-1){
					System.out.print("X");
                } else {
					System.out.print(gridValue[i][j]);
				}
				System.out.print(" | ");
			}
			System.out.print("\n");	
		}
		return gridValue;
	}	
    public static boolean game(int a) {
        if(a==-1){
            return false;
        } else{
            return true;
        }
    }
}