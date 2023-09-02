import java.util.Scanner;// Import the Scanner class
public class MineSweeper {
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
		int [][] grid = buildGrid(n,m,p);
		int [][] fieldHidden = setupGrid(grid);
        System.out.print("Enter Row Number: ");
        int a = s.nextInt();
        System.out.print("Enter Column Number: ");
        int b = s.nextInt();
		System.out.println(valCoor(a,b,fieldHidden));
		display(clickCoor(a, b, fieldHidden));
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
	public static int valCoor(int a, int b, int[][] fieldHidden ){
		int res = fieldHidden[a][b];
		return res;
	}
	public static int[][] clickCoor(int a, int b, int[][] fieldHidden){
		int[][] fieldVisible = fieldHidden;
		fieldVisible[a][b] = 8;
		if(fieldHidden[a][b]== 0){
			for (int i = 0; i < fieldVisible.length; i++) {
				for (int j = 0; j < fieldVisible[0].length; j++) {
					for (int x = (i - 1); x <= (i + 1); x++) {
						for (int y = (j - 1); y <= (j + 1); y++) {
							if (fieldHidden[a][b] == 0) {
								fieldVisible[a][b] = 8;
							}
						}
					}
				}
			}
			
		}
		return fieldVisible;
	}

	public static int[][] display(int[][] fieldHidden){
		System.out.print("\t ");
		for(int i=0; i<fieldHidden.length; i++){
			System.out.print(" " + i + "  ");
		}
		System.out.print("\n");
		for(int i=0; i<fieldHidden.length; i++){
			System.out.print(i + "\t| ");
			for(int j=0; j<fieldHidden.length; j++){
				if(fieldHidden[i][j]==0){
					System.out.print("?");
				} else if(fieldHidden[i][j]==-1){
					System.out.print("?");
				}else{
					System.out.print("?");
				}
				System.out.print(" | ");
			}
			System.out.print("\n");	
		}
		return fieldHidden;
	}	


	public static int[][] buildVisbble(int[][] fieldHidden){
		int[][] fieldVisible = new int[fieldHidden.length][fieldHidden[0].length];
		return fieldVisible;
	}
	public static int[][] displayVisible(int[][] fieldHidden){
		int[][] fieldVisible = new int[fieldHidden.length][fieldHidden[0].length];
		System.out.print("\t ");
		for(int i=0; i<fieldVisible.length; i++){
			System.out.print(" " + i + "  ");
		}
		System.out.print("\n");
		for(int i=0; i<fieldVisible.length; i++){
			System.out.print(i + "\t| ");
			for(int j=0; j<fieldVisible.length; j++){
				if(fieldVisible[i][j]==0){
					System.out.print("?");
				}
				System.out.print(" | ");
			}
			System.out.print("\n");	
		}
		return fieldVisible;
	}
	public static int[][] displayFix(int[][] fieldHidden){
		int[][] fieldVisible = fieldHidden;
		System.out.print("\t ");
		for(int i=0; i<fieldVisible.length; i++){
			System.out.print(" " + i + "  ");
		}
		System.out.print("\n");
		for(int i=0; i<fieldVisible.length; i++){
			System.out.print(i + "\t| ");
			for(int j=0; j<fieldVisible.length; j++){
				if(fieldVisible[i][j]==0){
					System.out.print(" ");
				}else if(fieldVisible[i][j]==9){
					System.out.print("X");
				}else{
					System.out.print(fieldVisible[i][j]);
				}
				System.out.print(" | ");
			}
			System.out.print("\n");	
		}
		return fieldVisible;
	}
	public static int[][] displayHidden(int[][] fieldHidden){
		System.out.print("\t ");
		for(int i=0; i<fieldHidden.length; i++){
			System.out.print(" " + i + "  ");
		}
		System.out.println();
		for(int i=0; i<fieldHidden.length; i++){
			System.out.print(i + "\t| ");
			for(int j=0; j<fieldHidden.length; j++){
				if(fieldHidden[i][j]==0){
					System.out.print(" ");
				}else if(fieldHidden[i][j]==9){
					System.out.print("9");
				}else{
					System.out.print(fieldHidden[i][j]);
				}
				System.out.print(" | ");
			}
			System.out.print("\n");	
		}
		return fieldHidden;
	}
	public static int [][] playMove(int [][] fieldHidden, int [][] fieldVisible){
        Scanner sc= new Scanner(System.in);
        System.out.print("\nEnter Row Number: ");
        int i= sc.nextInt();
		while(i >= fieldHidden.length && i <= fieldHidden.length){
			System.out.println("Incorrect Input!!");
			System.out.println("Please Enter Row Number again: ");
			i= sc.nextInt();
		}
        System.out.print("Enter Column Number: ");
        int j= sc.nextInt();
		while(j >= fieldHidden[0].length && j <= fieldHidden[0].length){
			System.out.println("Incorrect Input!!");
			System.out.println("Please Enter coloum Number again: ");
			j= sc.nextInt();
		}
        System.out.print("Enter 1 for open or 0 to flag : ");
        int z= sc.nextInt();
		while(z != 1 && z!=0){
			System.out.println("Incorrect Input!!");
			System.out.println("Please Enter 1=open or 0=flag/unflag: ");
			z= sc.nextInt();
		}
		if (z==0){
			fieldVisible = addFlagToGrid(i,j,fieldVisible, fieldHidden);
			return fixVisble(i, j,fieldVisible, fieldHidden);
		}
		return fixVisble(i, j,fieldVisible, fieldHidden);
		
	}
	public static int[][] fixVisble(int a, int b, int[][] fieldVisible, int[][] fieldHidden) {
		if (fieldHidden[a][b] == 9) {
			System.out.println("\n\n================ Game over ! ================\n");
			displayHidden(fieldHidden);
		} else if (fieldHidden[a][b] == 0) {
			fieldVisible[a][b] = 0;
			
		} else {
			fieldVisible[a][b] = fieldHidden[a][b];
		}
		return fieldVisible;
	}
	public static void gameInstructions(){
		System.out.println("Please enter height and width, ");
		System.out.println("of the grid that you want to play ! ");
		System.out.println("and proprty of mines you would like to play (0-1).");
	}
	public static void gridMessage(){
		System.out.println("\n|============ Excellent! this is your grid game !! ==========|\n");
	}
	// Step 5: Get coordinate + mapGrid --> return "FLAG"
	public static int[][] addFlagToGrid(int a, int b, int[][] fieldVisible, int[][] fieldHidden) {
		fieldVisible[a][b] = 8;
		if(fieldVisible[a][b] != 8){
			fieldVisible[a][b] = 8;
		} else {
			fieldVisible[a][b] = fieldHidden[a][b];
		}
		return fieldVisible;
	}
}






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

// Step 2: Get n*m sizes op grid --> returns fieldVisible status (status value def = 9)
	// public static int[][] fieldVisible(int n, int m) {
	// 	int[][] fieldVisible = new int[n][m]; // f.x: 10X10
	// 	for (int i = 0; i < fieldVisible.length; i++) {
	// 		for (int j = 0; j < fieldVisible[i].length; j++) {
	// 			fieldVisible[i][j] = 9;
	// 		}
	// 	}
	// 	return fieldVisible;
	// }
// Step 9: displayGrid(gameMethod);
// public static [][] gameMethod(x,y,z,[][]fieldVisible,[][]fieldHidden){
			//crete[][] arr
			//
			//return arr map+opencel
			//if cell==-1 - boolen game= false
			//play 
// 	} 