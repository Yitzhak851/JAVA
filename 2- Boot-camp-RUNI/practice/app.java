import java.util.Scanner;

class app {
    static int[][] bBoard; // 'backstage' game board , isn't visible to the player.
    static String[][] fBoard; // the board that is shown to the player
    static int rows; // amount of rows
    static int colomns; // sum of collomns
    static int noMineCount; // used to determine how many unknown non mine tiles remains in the player
                            // board.

    /*
     * create the board based on the scale and the chance of a mine to appear.
     * assign values to the class attributes.
     */
    public static void createBoard(int row, int col, double chance) {
        bBoard = new int[row][col];
        fBoard = new String[row][col];
        noMineCount = row * col;
        rows = row;
        colomns = col;
        // creates the backstage board.
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < colomns; j++) {
                if (Math.random() < chance) {
                    bBoard[i][j] = -1; // -1 is the assigned value to express a mine.
                    noMineCount--;
                } else
                    bBoard[i][j] = 0; // temporary value for non mine tile.
            }
        }
        surroundingMinesCounter();
        // creates the board shown to the player
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colomns; j++) {
                fBoard[i][j] = "?";
            }
        }
    }

    /*
     * Prints the front-board.
     */
    public static void printBoard() {
        for (int i = 0; i < rows; i++) {
            if (i < 10)
                System.out.print(" " + i + "| ");
            else
                System.out.print(i + "| ");
            for (int j = 0; j < colomns; j++) {
                if (j < 10)
                    System.out.print(fBoard[i][j] + " ");
                else
                    System.out.print(" " + fBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("   ");
        for (int j = 0; j < colomns; j++) {
            if (j < 10)
                System.out.print("__");
            else
                System.err.print("____");
        }
        System.out.println();
        System.out.print("   ");
        for (int j = 0; j < colomns; j++) {
            if (j == 0)
                System.out.print(" " + j + " ");
            else
                System.out.print(j + " ");
        }
    }

    /*
     * Prints the backstage board
     */
    public static void printBackBoard() {
        for (int i = 0; i < rows; i++) {
            if (i < 10)
                System.out.print(" " + i + "| ");
            else
                System.out.print(i + "| ");
            for (int j = 0; j < colomns; j++) {
                if (bBoard[i][j] == -1)
                    System.out.print(bBoard[i][j] + " ");
                else
                    System.out.print(" " + bBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("   ");
        for (int j = 0; j < colomns; j++) {
            if (j < 10)
                System.out.print("___");
            else
                System.err.print("____");
        }
        System.out.println();
        System.out.print("    ");
        for (int j = 0; j < colomns; j++)
            System.out.print(" " + j + " ");

    }

    /*
     * a validation check to make sure a chosen tile remains in the borders of the
     * gameboard.
     */
    public static boolean isValid(int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < colomns;
    }

    /*
     * returns the amount of surrounding mines in a scope of 3x3 of a given
     * coordinate.
     */
    public static int checkMines(int x, int y) {
        int count = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (isValid(i, j)) {
                    if (bBoard[i][j] == -1)
                        count++;
                }
            }
        }
        return count;
    }

    /*
     * assign a new value to a non-mine tile , based on surrounding mines.
     */
    private static void surroundingMinesCounter() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colomns; j++) {
                if (bBoard[i][j] == 0) {
                    bBoard[i][j] = checkMines(i, j);
                }
            }
        }
    }

    /*
     * a function that recives a coordinate of a tile which has no surrounding mines
     * starts a chain reaction of 'clicking' surrounding tiles
     * 
     */
    public static void blankZones(int x, int y) {
        fBoard[x][y] = "_";
        bBoard[x][y] = -2; // assigned value for a tile which has no surrounding mines after it has been
                           // 'clicked'.
        noMineCount--;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (isValid(i, j)) {
                    if (bBoard[i][j] == 0) // recursive action in case a surrounding tile also has no surrounding mines.
                    {
                        blankZones(i, j);
                    } else if (bBoard[i][j] == -1 || bBoard[i][j] == -2) // do nothing if its a mine or an already
                                                                         // checked tile
                        continue;
                    else // the tile has surrounding mines , print to the user the amount of surrounding
                         // mines.
                    {
                        if (fBoard[i][j] == "?") // safety measure so that it won't count a tile that is already known.
                        {
                            noMineCount--;
                            fBoard[i][j] = "" + bBoard[i][j];
                        }

                    }
                }
            }
        }
    }

    /*
     * the function is used in case a user as clicked a second time a known tile
     * if there are the same amount of flags as mines in the surrounding tile
     * the function auto clicks the surrounding tiles , even if it is a mine.
     * the function returns a boolean that determined based on a mine clicked.
     */
    public static boolean surroundClicker(int x, int y) {
        boolean failCheck = true;
        int flagCount = 0; // counts surrounding flags
        int[] unknownTileCount = new int[14]; // saves the coordinates of unknown tiles , 14 is the limit situation (1
                                              // known tile 1 mine 1 flag)
        int r = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (isValid(i, j)) {
                    if (fBoard[i][j] == "!")
                        flagCount++;
                    else if (fBoard[i][j] == "?") // saves unknown coordinates
                    {
                        unknownTileCount[r] = i;
                        r++;
                        unknownTileCount[r] = j;
                        r++;

                    }

                }
            }
        }
        // if the amount of flags is equal to surrounding mines , click the unknown
        // tiles.
        if (flagCount == bBoard[x][y]) {
            for (int i = 0; i < r; i += 2) {
                boolean tempFailCheck = true;
                tempFailCheck = click(unknownTileCount[i], unknownTileCount[i + 1]);
                if (tempFailCheck == false) // if a mine was selected , returns false only after reveals the entire
                    failCheck = tempFailCheck;
            }
        }
        return failCheck;
    }

    /*
     * used to click a tile and act differently based on the valid scenario, return
     * a boolean to determine a lost.
     */
    public static boolean click(int x, int y) {
        // anti flag clicking - can't click a flagged tile.
        if (fBoard[x][y] == "!") {
            System.out.println("ERROR: cannot click a flagged tile , please unflag before clicking");
            return true;
        } else if (fBoard[x][y] == "?") // unknown tile
        {
            // clicked a mine.
            if (bBoard[x][y] == -1) {
                fBoard[x][y] = "*";
                return false;
            } else if (bBoard[x][y] == 0)
                blankZones(x, y);
            else if (bBoard[x][y] == -2)
                return true;
            else {
                noMineCount--;
                fBoard[x][y] = "" + bBoard[x][y];
            }
        } else // known tile - double clicking
        {
            return surroundClicker(x, y);
        }
        return true;
    }

    /*
     * sets a flag at given coordinate
     */
    public static void flag(int x, int y) {
        if (fBoard[x][y] == "!") // cancel flag
            fBoard[x][y] = "?";
        else {
            if (fBoard[x][y] != "?")
                System.out.println("cannot flag a known tile , please select an unknown tile");
            else {
                fBoard[x][y] = "!";
            }
        }
    }

    /*
     * if the player has lost - show all mines that weren't flagged
     * if the player has won - flag all tiles that are 'unknown'
     * since the player has won unkown tiles are mines for sure.
     */
    public static void endBoard(int scenario) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colomns; j++) {
                if (scenario == 0) {
                    if (bBoard[i][j] == -1 && fBoard[i][j] != "!")
                        fBoard[i][j] = "*";
                } else {
                    if (fBoard[i][j] == "?")
                        flag(i, j);
                }

            }
        }
    }

    /*
     * receives a boolean which determine a win or a lose and print a fitting
     * situation.
     */
    public static void gameOver(boolean result) {
        // User won
        if (result == true) {
            System.out.println("\n\n~~!~~~~~~!~~~~~~~~~WINNER~~~~~!~~~~~~~!~~~");
            System.out.println("____");
            System.out.println("|^ ^|");
            System.out.println("|* *|");
            System.out.println("|_U_| /");
            System.out.println("  | /");
            System.out.println(" /|");
            System.out.println("/ |");
            System.out.println("  |");
            System.out.println(" //\n");
            endBoard(1);
            printBoard();
        }
        // User lost
        else {
            System.out.println("            ________");
            System.out.println("           |      X |");
            System.out.println("\\____\\_____|  |     |");
            System.out.println("/    /     |      X |");
            System.out.println("           |________| ");
            System.out.println("You have lost, better luck next time");
            endBoard(0);
            System.out.println();
            printBoard();
        }
    }

    /*
     * the 'manager' of the game
     * runs the turns and activate scenerios
     */
    public static void start() {
        int x, y;
        System.out.println("\n\n\n*****|MINESWEEPER|*****");
        System.out.println("This is your board:\n");
        printBoard();
        System.out.println("\nPlease enter a coordinate to continue playing");
        Scanner userInput = new Scanner(System.in);
        x = userInput.nextInt();
        userInput.nextLine();
        y = userInput.nextInt();
        userInput.nextLine();
        boolean result = true;
        while (result) {
            if (isValid(x, y)) {
                System.out.println("Would you like to click or flag?\n1.Click\n2.Flag");
                int check = userInput.nextInt();

                // a while loop to make sure the user input is valid.
                do {
                    if (check == 1) {
                        result = click(x, y);
                    } else if (check == 2)
                        flag(x, y);
                    else {
                        System.out.println("ERROR: invalid input , please enter either 1 or 2");
                        check = userInput.nextInt();
                    }

                } while (check != 1 && check != 2);

                if (result == false) // stops the loop , the user lost.
                    break;
                System.out.println("-----------------------------------\n\n");
                printBoard();
            } else {
                System.out.println(
                        "ERROR: invalid coordinates , please enter new coordination in the range of the board:0- "
                                + (rows - 1) + ",0-" + (colomns - 1));
            }

            // stop the while loop because we have reached the point where there are no
            // remaining unknown tile - the player won.
            if (noMineCount == 0) {
                break;
            }
            System.out.println("\nenter coordinates");
            x = userInput.nextInt();
            userInput.nextLine();
            y = userInput.nextInt();
            userInput.nextLine();
        }
        userInput.close(); // closes the system.in stream so that we won't encounter a resource leak.
        gameOver(result);
    }

    /*
     * take from the player the configuration of the gameboard he wants
     * sizes and probability of a mine
     */
    public static void opening() {
        int x, y;
        double chance;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the height and width ");
        x = input.nextInt();
        while (x <= 0) {
            System.out.println("ERROR: Invalid size , please enter new height that is bigger than 0");
            x = input.nextInt();
        }
        y = input.nextInt();
        while (y <= 0) {
            System.out.println("ERROR: Invalid size , please enter new width that is bigger than 0");
            y = input.nextInt();
        }

        System.out.println("Please enter a probability for a mine to appear , between 0 and 1");
        chance = input.nextDouble();
        while (chance >= 1 || chance <= 0) {
            System.out.println("ERROR: Invalid chance , please enter a number between 0 and 1");
            chance = input.nextDouble();
        }
        createBoard(x, y, chance);
        // printBackBoard(); // optimal for seeing the back stage board , obviously make
        // the game easier.
        start();
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO MINESWEEPER");
        opening();
    }
}