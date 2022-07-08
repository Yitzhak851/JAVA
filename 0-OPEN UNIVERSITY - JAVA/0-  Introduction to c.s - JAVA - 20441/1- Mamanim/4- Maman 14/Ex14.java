/**
 * class Ex14
 *
 * @author (Yitzhak Bar Or)
 * @version (1.0)
 */
public class Ex14 {// start the class
    /**
     * This method returns the minimum difference
     * between cells of two given numbers inside a given array.
     * if one of the num is Not found in the array,
     * the method returns Integer. MAX_VALUE.
     * the time comlexity of of the method is 0(n)
     * the method goes through the loop for 1 time.
     * the space comlexity is 0(1)
     * because there is no new variables added through the loop
     * and the variables are constant.
     * 
     * @param a is the array that we check.
     * @param x is one from the two num that we check the minimal distance between
     *          them. that we check.
     * @param y is one from the two num that we check the minimal distance between
     *          them.
     * @return the minimum between two cells of x and y. that has the given num is a
     *         given array.
     */
    public static int findMinDiff(int[] a, int x, int y) {
        int n = a.length;// Represents the current minimal difference between the two num.
        if (a.length <= 1) {
            return 0;
        }
        int x_index = n, y_index = n;// calculate just in case the two given num are found
        int min_diff = Integer.MAX_VALUE;// declartion
        for (int i = 0; i < n; i++) {// calculate the next step
            if (a[i] == x) {
                x_index = i;// in case x like i
                if (y_index != n)
                    min_diff = Integer.min(min_diff, Math.abs(x_index - y_index));// calculate the min num
            }
            if (a[i] == y) {
                y_index = i;// in case x like i
                if (x_index != n)
                    min_diff = Integer.min(min_diff, Math.abs(x_index - y_index));// calculate the min num
            }
        } // end of the loop
        return min_diff;
    }// end of the 1 method

    /**
     * This method accepts as param a two dimenstional array that is rotational
     * sorted.
     * and a searchable value.
     * if the value is in the array the method returns true.
     * if not- the method returns false.
     * the time complication is 0(log n)
     * because we are using the opportunity to have a rotantional sorted
     * and every time we find the value quarter we are dividing in 2
     * to focus in the quarter it self and leave the rest.
     * the SPACE comlexity is 0(1) because the n depends on the given array length.
     * and this is constant.
     * 
     * @param mat  Square array Name.
     * @param x    Represents a number entered by the user.
     * @param minX Represents the min width cells in the square array.
     * @param minY Represents the min high cells in the square array.
     * @param maxX Represents the max width cells in the square array.
     * @param maxY Represents the min high cells in the square array.
     * @return returns whether the x is in the array.
     */

    public static boolean search(int[][] mat, int x) {
        int minX = 0, minY = 0, maxX = mat.length - 1, maxY = mat.length - 1;// declartion
        while (maxY != minY && maxX != minX) {// calculate and dividing the array
            if (x < mat[minX][(maxY + minY) / 2 + 1]) { // first
                maxY = (maxY + minY) / 2;
                maxX = (maxX + minX) / 2;
            } else if (x < mat[(maxX + minX) / 2 + 1][(maxY + minY) / 2 + 1]) { // second
                minY = (maxY + minY) / 2 + 1;
                maxX = (maxX + minX) / 2;
            } else if (x < mat[(maxX + minX) / 2 + 1][minY]) { // third
                minY = (maxY + minY) / 2 + 1;
                minX = (maxX + minX) / 2 + 1;
            } else { // forth
                maxY = (maxY + minY) / 2;
                minX = (maxX + minX) / 2 + 1;
            }
        }
        if (mat[minX][minY] == x) {
            System.out.println("row = " + minX + "\ncol = " + minY);
            return true;
        }
        return false;
    }// end of the 2 method

    /**
     * This method gets an array of integers.
     * the method returns true if it is possible to divide all the members.
     * of the array into two equal groups of equal size so that the sum of the
     * members in the two groups is equal.
     *
     * @param arr the array that is given to check.
     * @return true if it is possible to divide all the members of the array into
     *         two equal groups of equal size.
     */
    public static boolean equalSplit(int[] arr) {
        if (arr.length % 2 != 0) {
            return false;
        } // if the array length is not divided into 2 equal groups even don't check it.
        return equalSplit(arr, 0, 0, 0, 0, 0);
    }

    private static boolean equalSplit(int[] arr, int i, int sum1, int sum2, int num1, int num2) {
        if (i == arr.length) // check if we got the end of array
            return sum1 == sum2 && num1 == num2; // checking if the groups are equal in size and sum.
        return equalSplit(arr, i + 1, sum1 + arr[i], sum2, num1 + 1, num2) ||
                equalSplit(arr, i + 1, sum1, sum2 + arr[i], num1, num2 + 1);
        // recursion, checking with adding or decreasing the value in the cell and add
        // to one group or the other.
    }// end of the 3 method

    /**
     * This method accepts as an integer parameter n,
     * and returns true if the number is a special number
     * according to the format - and otherwise returns false.
     *
     * @param n is the parameter which we checking.
     * @return true if the num is a special num according the format.
     */

    public static boolean isSpecial(int n) {
        if (n <= 0)
            return false;// if the num ig negativeaccording the rules is not into the setting and don't
                         // even check it.
        return isSpecial(2, n);
    }

    private static boolean isSpecial(int k, int n) {
        if (k > n) {// if k num is higher than the curren location of the given num
            return true;// because it is clear that the num is a special num
        }
        if (n % k == 0) {// if the current num is locate in a location that will be deleted in this
                         // round.
            return false;
        }
        return isSpecial(k + 1, n - n / k);// reduce the n to his new location and promote the delete round in one step.
    }// end of the 4 method

}// end of the class
