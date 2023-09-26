
/**
 * This class contain a "minesweeper" game.
 * @author (Yitzhak baror)
 * @version (26.09.2023)
 */
import java.util.Scanner; // import the Scanner class

public class MineSweeper { // start the public class MineSweeper
    // Declarate several static variables
    static int[][] gridValue;
    static int[][] gridStatus;
    static int n;
    static int m;
    static double p;
    static int x; // row that the user choose
    static int y; // col that the user choose
    static int c; // flag/open that the user choose
    static Scanner s = new Scanner(System.in);
    static boolean isGame = true;
    static boolean win = false;

    /*
     * This method getting from the user sizes of the grid,
     * and call the method "buildGrid" that create the grid's .
     * and call the method "start" that start the while loop of the game.
     */
    public static void openGame() {
        buildGrid(n, m, p); // creating the 2 grid's by the user values.
        start(); // start the while loop of the game.
    }

    /*
     * This method getting from the user sizes of the grid,
     * and create "gridValue" + "gridStatus" .
     */
    public static void buildGrid(int n, int m, double p) {
        gridValue = new int[n][m]; // build the gridValue
        for (int i = 0; i < gridValue.length; i++) {
            for (int j = 0; j < gridValue[i].length; j++) {
                if (Math.random() < p) {
                    gridValue[i][j] = (-1);
                } else {
                    gridValue[i][j] = (0);
                }
            }
        }
        setupGrid(); // update value on tile that neat a mine.
        gridStatus = new int[n][m]; // build the gridStatus (-7) equal isClose
        for (int i = 0; i < gridStatus.length; i++) {
            for (int j = 0; j < gridStatus[0].length; j++) {
                gridStatus[i][j] = -7;
            }
        }
    }

    /*
     * This method create the update gridValue.
     * the "mineCount" - count all the mines, near all tile with mines .
     */
    public static void setupGrid() {
        for (int i = 0; i < gridValue.length; i++) {
            for (int j = 0; j < gridValue[0].length; j++) {
                // if isMine => isMine
                if (gridValue[i][j] == (-1)) {
                    gridValue[i][j] = (-1);
                } else {
                    int mineCount = 0;
                    for (int x = (i - 1); x <= (i + 1); x++) {
                        for (int y = (j - 1); y <= (j + 1); y++) {
                            // Only if there is a mine in 8 squares around me count it,and only if the 8
                            // squares are in the boundaries of the board
                            if (x >= 0 && x < gridValue.length && y >= 0 && y < gridValue[0].length
                                    && gridValue[x][y] == (-1)) {
                                mineCount++;
                            }
                        }
                    }
                    // initional the sum of the mines in the tile
                    gridValue[i][j] = mineCount;
                }
            }
        }
    }

    /*
     * This method in fact is the mainly game.
     * and if the game - game-over so it print game over.
     */
    public static void start() {
        System.out.println("\n\t======= Grate, this is your grid, good luck! ====== \n");
        displayStatus(gridStatus); // show to user the grid.
        while (isGame) { // isGame defult is "true".
            userChoice(); // ask for coordinate - from user.
            playMove(); // do the move of the user choose
            checkWin(); // check if all the tile of gridStatus equal to gridValue win=true
            displayStatus(gridStatus); // show the grid status
            if (win) {
                isGame = false; // end the game
                System.out.println("\n\t==========You win !!============\n"); // print for the user - "You win"
            }
        }
    }

    /*
     * This method display the grid status of the game.
     * this method get int[][] array ant return display of the grid.
     * the number (-5) = represent tile that "isopen" = [ ]
     * the number (-7) = represent tile that "isClose" = [?]
     * the number (-9) = represent tile that "isFlag" = [F]
     * the number (num) = represent tile that "isNum" = [num]
     * the number (-1) = represent tile that "isMine" = [X]
     * the number (0) = represent tile that "isEmpty" = [ ]
     */
    public static void displayStatus(int[][] array) {
        System.out.print("\t ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + i + "  ");
        }
        System.out.print("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "\t| ");
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == -5) { // tile "isopen" = [ ]
                    System.out.print(" ");
                } else if (array[i][j] == -7) { // tile "isClose" = [?]
                    System.out.print("?");
                } else if (array[i][j] > 0) { // tile that "isNum" = [num]
                    System.out.print(array[i][j]);
                } else if (array[i][j] == -9) { // tile "isFlag" = [F]
                    System.out.print("F");
                } else if (array[i][j] == 0) { // tile that "isEmpty" = [ ]
                    System.out.print(" ");
                } else {
                    System.out.print("X");
                }
                System.out.print(" | ");
            }
            System.out.print("\n");
        }
    }

    /*
     * This method work withe the "sccaner" object.
     * it getting - coordinate from the user.
     * and if the coordinate are not corect the founction ask for correct value.
     * if the coordinate are correct - the game continue.
     * and the founction "playMove" - work.
     */
    public static void userChoice() {
        System.out.print("\n\tEnter Row Number: ");
        x = s.nextInt();
        while (x < 0 || x >= gridValue.length) {
            System.out.println("Incorrect Input!!\nPlease Enter number between grid length again: ");
            x = s.nextInt();
        }
        System.out.print("\tEnter Column Number: ");
        y = s.nextInt();
        while (y < 0 || y >= gridValue[0].length) {
            System.out.println("Incorrect Input!!\nPlease Enter number between grid length again: ");
            y = s.nextInt();
        }
        System.out.print("\tEnter 1=open/close, 0=flag/unflag:");
        c = s.nextInt();
        while (c != 0 && c != 1) {
            System.out.print("\nIncorrect Input!!\nPlease Enter 0 or 1: ");
            c = s.nextInt();
        }
        System.out.println();
    }

    /*
     * This method getting moves from "userChoice".
     * and initional it in the "gridStatus".
     * if user choose coordinate with (-1) = print GAME OVER,
     * and return gridValue and print it.
     * if everthing correct - "displayStatus" + "checkWin" + continue.
     */
    public static void playMove() {
        if (gridValue[x][y] == -1 && c == 1) { // if isMine && open
            System.out.println("\n\t========GAME OVER!========\n");
            isGame = false;
            displayStatus(gridValue); // show gridValue
        } else if ((gridValue[x][y] == 0 && gridStatus[x][y] != -5) && c == 1) { // if isEmpty && isClose && open
            openEmptyCells(x, y);
        } else if ((gridValue[x][y] > 0) && (gridStatus[x][y] == -7) && (c == 1)) { // if isNum && isClose -> open
            gridStatus[x][y] = gridValue[x][y];
        } else if (gridStatus[x][y] == -7 && c == 0) { // if "isClose" && flag
            gridStatus[x][y] = -9; // init "isFlag"
        } else if (gridStatus[x][y] == -9 && c == 0) { // if "isFlag" && flag
            gridStatus[x][y] = -7; // init "isClose"
        } else if (gridStatus[x][y] == -5 && c == 0) { // if "isopen" && flag
            gridStatus[x][y] = -9; // init "isFlag"
        } else if ((gridStatus[x][y] == -5 || gridStatus[x][y] > 0 && c == 1)) { // if "isopen" || isNum && open
            System.out.println("\n\t====== you allready open this tile, please choose another tile!! ===== \n");
        }
    }

    /*
     * This method get coordinate and 2 array.
     * if the user choose emty tile this method return all the empty tile arange +
     * tile with number.
     * if the number inside the tile is (-1) - this method doesnt open it.
     */
    public static void openEmptyCells(int x, int y) {
        // stop conditions:
        // if out of range - stop
        if ((x < 0 || x > gridValue.length - 1) || (y < 0 || y > gridValue[x].length - 1)) {
            return;
        }
        // if gridValue isMine - stop
        if (gridValue[x][y] == -1) {
            return;
        }
        // if gridStatus == isOpen || gridStatus isFlag
        if ((gridStatus[x][y] == -5) || (gridStatus[x][y] == -9)) {
            return;
        }
        // if isNum
        if ((gridValue[x][y] > 0)) {
            gridStatus[x][y] = gridValue[x][y]; // open and stop
            return;
        }
        // if you dont busted in any stop comdition - open this tile
        gridStatus[x][y] = -5;
        // and start the recutsion
        openEmptyCells(x + 1, y);
        openEmptyCells(x - 1, y);
        openEmptyCells(x, y + 1);
        openEmptyCells(x, y - 1);
        return;
    }

    /*
     * This method is the condition if the game finish.
     * if the gridStatus equal to gridValue.
     * the user win!
     */
    public static void checkWin() {
        boolean b = true;
        for (int i = 0; i < gridValue.length; i++) {
            for (int j = 0; j < gridValue[0].length; j++) {
                // run 2d-arrays (gridValue + gridStatus)
                // if this condition not true = the user not win yet .
                // if ((isClose || isFlag) && is NOT Mine )
                if ((gridStatus[i][j] == -9 || gridStatus[i][j] == -7) && gridValue[i][j] != -1) {
                    b = false;
                }
            }
        }
        if (b) {
            win = true;
        } else {
            win = false;
        }
    }

    /*
     * This is the main method, this method open the game MineSweeper.
     * the method get at the command line: sizes of the game and property.
     */
    public static void main(String[] args) {
        n = Integer.parseInt(args[0]);
        m = Integer.parseInt(args[1]);
        p = Double.parseDouble(args[2]);
        openGame();
    }
}// end the public class MineSweeper
