/**
 * Represents an array of 3x3 objects, every object is a square3x3 array.
 *
 * @author Yitzhak Bar or
 * @version 1.0
 */
public class Sudoku {
    private Square3x3[][] _sudoku = new Square3x3[3][3];
    private static final int SUDOKU_LENGTH = 10;

    /**
     * First Constructor for objects of class Sudoku. Constructs and initializes a
     * 2-dimensional
     * array of the size 3X3, with a Square3x3 object in each cell.
     *
     */
    public Sudoku() {
        for (int i = 0; i < _sudoku.length; i++) {
            for (int j = 0; j < _sudoku[i].length; j++) {
                _sudoku[i][j] = new Square3x3();
            }
        }
    }

    /**
     * Second Constructor construct a 2-dimensional array of the size 3X3, whose
     * objects are taken from the given
     * array, and copy the value of this objects to a new Sudoku board.
     * 
     * @param array The given Array.
     */
    public Sudoku(Square3x3[][] square3x3Array) {
        this();
        for (int i = 0; i < _sudoku.length; i++) {
            for (int j = 0; j < _sudoku[i].length; j++) {
                _sudoku[i][j] = square3x3Array[i][j];
            }
        }
    }

    /**
     * Check if the Sudoku array has all the number from 1 to 9 in every object, row
     * and column.
     *
     * @return true if the Sudoku is legit by the laws of Sudoku.
     */
    public Boolean isValid() {

        for (int i = 0; i < _sudoku.length; i++) {
            for (int j = 0; j < _sudoku[i].length; j++) {
                if (_sudoku[i][j].allThere() == false) {
                    return false;
                }
                boolean[] getRow = new boolean[SUDOKU_LENGTH];
                boolean[] getCol = new boolean[SUDOKU_LENGTH];
                for (int k = 0; k < _sudoku.length; k++) {
                    _sudoku[j][k].whosThereRow(i, getRow);
                    _sudoku[k][j].whosThereCol(i, getCol);
                }
                for (int p = 1; p < getRow.length; p++) {
                    if (getRow[p] != true || getCol[p] != true) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}