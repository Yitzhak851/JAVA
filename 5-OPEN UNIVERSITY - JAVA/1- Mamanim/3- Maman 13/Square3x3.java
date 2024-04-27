/**
 * This Class representing a square 2D array of integers in size 3×3 .
 *
 * @author Yitzhak Bar-or
 * @version 1.0
 */
public class Square3x3 {
    private int _array[][];
    private static final int DEFAULT_ROW = 3;
    private static final int DEFAULT_COL = 3;
    private static final int DEFAULT_VAL = -1;

    /**
     * First Constructor for objects of class Square3X3. Constructs and initializes
     * a 2-dimensional
     * array of the size 3X3, with the values of –1 in each cell.
     *
     */
    public Square3x3() {
        _array = new int[DEFAULT_ROW][DEFAULT_COL];
        for (int i = 0; i < DEFAULT_ROW; i++) {
            for (int j = 0; j < DEFAULT_COL; j++) {
                _array[i][j] = DEFAULT_VAL;
            }
        }
    }

    /**
     * Second Constructor construct a 2-dimensional array of the size 3X3, whose
     * values are taken from the given
     * array. If the given array’s size is bigger than 3X3, only the first 3X3 cells
     * are taken. If the
     * given array is smaller, the rest of the cells are initialized to –1. the the
     * given array
     * may be non-symmetrical, or may even have rows of different lengths.
     * 
     * @param array The given Array.
     */
    public Square3x3(int[][] array) {
        this();
        for (int i = 0; i < array.length && i < _array.length; i++) {
            for (int j = 0; j < array[i].length && j < _array[i].length; j++) {
                _array[i][j] = array[i][j];
            }
        }
    }

    /**
     * Copy constructor. Constructs a 2-dimensional array of the size 3X3, whose
     * values are
     * taken from the array of the given Square3x3 object.
     * 
     * @param other The array from which to construct the new object
     */
    public Square3x3(Square3x3 other) {
        this();
        if (other != null) {
            for (int i = 0; i < _array.length; i++) {
                for (int j = 0; j < _array[0].length; j++) {
                    this._array[i][j] = other._array[i][j];
                }
            }
        }
    }

    /**
     * Returns the value of a cell by the given row and the column
     *
     * @param row the row of the array which the cell are in
     * @param col the column of the array which the cell are in
     * @return a value of the cell by the given row and the column
     */
    public int getCell(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return DEFAULT_VAL;
        }
        return _array[row][col];
    }

    /**
     * Sets the value of a cell to a given value
     *
     * @param row   The row of the array which the cell are in
     * @param col   The column of the array which the cell are in
     * @param value The new value of the given cell
     */
    public void setXY(int row, int col, int value) {
        if (row < 3 && row >= 0 && col < 3 && col >= 0) {
            _array[row][col] = value;
        }
    }

    /**
     * Returns a string representation of the array
     *
     * @return a string that represents the array
     */
    public String toString() {
        String retStr = "";
        int j = 0;
        for (int i = 0; i < _array.length; i++) {
            for (j = 0; j < _array[0].length - 1; j++) {
                retStr += _array[i][j] + "\t";
            }
            retStr += _array[i][j] + "\n";
        }
        return retStr;
    }

    /**
     * Check if the array has all the number from 1 to 9.
     *
     * @return true if the array has all the number from 1 to 9.
     */
    public boolean allThere() {
        boolean[] check = new boolean[9];
        for (int b = 0; b < check.length; b++) {
            check[b] = false;
        }
        for (int i = 0; i < _array.length; i++) {
            for (int j = 0; j < _array[i].length; j++) {
                int m = _array[i][j] - 1;
                if (m < 0 || m >= check.length) {
                    return false;
                }
                check[m] = true;
            }
        }
        for (int b = 0; b < check.length; b++) {
            if (!check[b]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Takes a boolean array and sets the value (true/false) of the cells from 1 to
     * 9 according to the given row
     *
     * @param row    The row that is checken
     * @param values The boolean array that its value are sets by the value of the
     *               given row
     */
    public void whosThereRow(int row, boolean[] values) {
        if (row >= 0 && row < DEFAULT_ROW) {
            for (int j = 0; j < _array[row].length; j++) {
                int m = _array[row][j];
                if (m > 0 && m < values.length) {
                    values[m] = true;
                }
            }
        }

    }

    /**
     * Takes a boolean array and sets the value (true/false) of the cells from 1 to
     * 9 according to the given column
     *
     * @param col    The column that is checken
     * @param values The boolean array that its value are sets by the value of the
     *               given column
     */
    public void whosThereCol(int col, boolean[] values) {
        for (int i = 0; i < _array.length; i++) {
            if (col < 0 || col >= _array[i].length) {
                continue;
            }
            int m = _array[i][col];
            if (m > 0 && m < values.length) {
                values[m] = true;
            }
        }
    }
}