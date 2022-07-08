/**
 * This class represent linked list of rectangles.
 * The representation is made by a list that maintains the list of rectangles.
 *
 * @author Yitzhak Bar-or
 * @version 1.0
 */
public class RectList {
    // Atributes
    private RectNode _head;// attribute which indicates the beginning of the linked list

    // Constructor 1
    /**
     * Constructor for objects in class RectList.
     * this constructor creates an empty list.
     * and initializes the top list to null
     */
    public RectList() {
        _head = null;
    }

    // Method 1- addRect
    /**
     * The method addRect - getts rectangle as a parameter.
     * and adds it to the end of the list.
     * If the rectangle is Already on the list, the method will do nothing.
     * Time complexity is O(n).
     * becuase the the method depends on the length of the list.
     * Space complexity is O(1).
     * because there is max 2 object that created the pointer.
     * 
     * @param recA Represent the rectangle which will be added to the end of the
     *             list if it does not exists in the list already.
     */
    public void addRect(RectangleA recA) {
        RectNode addOnes = new RectNode(recA);
        if (_head == null) // in case the list is empty
        {
            _head = addOnes; // set new node inside the list with the given rectangle
        }

        else // in case the list is not empty
        {
            RectNode ptr = _head; // before the loop set the pointer on head of the list
            while (ptr.getNext() != null) // check all the way(not included the last node)
            {
                if (ptr.getRect().equals(recA))// in case the rectangle equals
                {
                    return; // dont do nothing
                }
                ptr = ptr.getNext();
            }
            if (!(ptr.getRect().equals(recA)))// check the last node and in case there is not similar rectangle
            {
                ptr.setNext(addOnes);
                // create new node in the end of the list with the given rectangle inside.
            }
        }
    }// end of method 1- addRect

    // Method 2- howManyWithPoint
    /**
     * The method accepts point (object from the Point class) parameter
     * and returns the num of rectangles in the list -
     * whose southwestern point is the given point.
     * If there are no rectangles in the list
     * or there are no rectangles in the list where the point "p" is their southwest
     * point -
     * the method returns 0.
     * Time complexity is O(n).
     * Becuase the the method depends on the length of the list
     * Space complexity is O(1).
     * Because we create just two variables.
     * 
     * @param p Represent point which we checking how many rectangle in the
     *          list(southwestern).
     * @return Represent num of rectangles in the list whose southwestern point is
     *         the given point.
     */
    public int howManyWithPoint(Point p) {
        if (_head == null)// in case the list empty
        {
            return 0; // return 0
        }
        RectNode ptr = _head;
        int counter = 0;
        while (ptr != null)// in case the ptr not empty
        {
            if (ptr.getRect().getPointSW().equals(p)) {
                counter++;
            }
            ptr = ptr.getNext();
        }
        return counter;
    }// end of method 2- howManyWithPoint

    // Method 3 - longestDiagonal
    /**
     * The method Returns the longest diagonal length between all rectangles in the
     * list.
     * If there are no rectangles in the list (the list is empty) the method will
     * return 0.
     * Time complexity is O(n).
     * Becuase the the method go through all over the list so it depends on the
     * length of the list.
     * Space complexity is O(1).
     * Because we create var that are constant in the memory
     * through the run time exept currentDiagonal
     * that is created over and over but it still O(1).
     * 
     * @return Represent the longest diagonal length between all rectangles in the
     *         list.
     */
    public double longestDiagonal() {
        if (_head == null)// in case the list empty
        {
            return 0; // return 0
        }
        RectNode ptr = _head;
        double theMaxDiagonal = 0; // create some varible
        while (ptr != null)// in case the list is not empty
        {
            double currentDiagonal = ptr.getRect().getDiagonalLength(); // calculate
            if (currentDiagonal > theMaxDiagonal) {
                theMaxDiagonal = currentDiagonal;
            }
            ptr = ptr.getNext();
        }
        return theMaxDiagonal;
    }// end of method 3- longestDiagonal

    // Method 4- mostLeftRect
    /**
     * The method returns a copy of the southwest point of the most left rectangle
     * on the list.
     * One rectangle is more left than another, if it is southwestern point
     * is to the left of the southwestern point of the other rectangle.
     * If there is more than one rectangle that is the most left,
     * The method returns a copy of the southwest point of The first rectangle among
     * them on the list.
     * If there are no rectangles in the list (the list is empty) The method return
     * null.
     * Time complexity is O(n)
     * Becuase the the method goes through all the list so it depends on the
     * length of the list
     * Space complexity is O(1)
     * Because we create variables that are constant in the memory
     * through the run time exept Point currentSW that is created over and over but
     * it still O(1) by the explenation
     * of Sharon that it doesnt influence the SPACE complexity.
     * 
     * @return Represent a copy of the southwest point of the most left rectangle on
     *         the list.
     */
    public Point mostLeftRect() {
        if (_head == null)// in case the list empty
        {
            return null; // return null
        }
        RectNode ptr = _head;
        Point SW = new Point(ptr.getRect().getPointSW());
        while (ptr != null)// in case the list is not empty
        {
            Point currentSW = new Point(ptr.getRect().getPointSW());
            if (currentSW.isLeft(SW)) {
                SW = currentSW;
            }
            ptr = ptr.getNext();
        }
        return new Point(SW);
    }// end of method 4 - mostLeftRect

    // Method 5
    /**
     * The method Return a copy of the northeast point of the highest rectangle in
     * the list.
     * One rectangle is higher than another rectangle if its northeastern point is
     * higher than that of the other.
     * If there is more than one rectangle at the highest northeast point,
     * the method returns A copy of the northeastern point of the first rectangle on
     * the list.
     * If there are no rectangles in the list (the list is empty) the method will
     * return null.
     * Time complexity is O(n)
     * Becuase the method depends on the length of the list
     * Space complexity is O(1)
     * Because we create variables that are constant in the memory.
     * 
     * @return Represent copy of the southwest point of the most left rectangle on
     *         the list.
     */
    public Point highestRect() {
        if (_head == null)// in case the list is empty
        {
            return null; // return null
        }
        RectNode ptr = _head;
        Point NE = new Point(ptr.getRect().getPointNE());
        while (ptr != null)// in case the list is not empty
        {
            Point currentNE = new Point(ptr.getRect().getPointNE());// varible we create
            if (currentNE.isAbove(NE)) {
                NE = currentNE;
            }
            ptr = ptr.getNext();
        }
        return new Point(NE);
    }// end of method 5 - highestRect

    // Private method A- Help findidng the rectangle with the most right point
    private Point mostRightRect() {
        if (_head == null)// in case the list is empty
        {
            return null; // return null
        }
        RectNode ptr = _head;
        Point NE = new Point(ptr.getRect().getPointNE());
        while (ptr != null)// in case the list is not empty
        {
            Point currentNE = new Point(ptr.getRect().getPointNE()); // private varible
            if (currentNE.isRight(NE)) {
                NE = new Point(currentNE);
            }
            ptr = ptr.getNext();
        }
        return new Point(NE);
    }// end of the Private method A

    // Private method B- Help finding the rectangle with lowest Point
    private Point lowestRect() {
        if (_head == null)// in case the list is empty
        {
            return null; // return null
        }
        RectNode ptr = _head;
        Point SW = new Point(ptr.getRect().getPointSW());
        while (ptr != null) {
            Point currentSW = new Point(ptr.getRect().getPointSW());// private varible
            if (currentSW.isUnder(SW)) {
                SW = new Point(currentSW);
            }
            ptr = ptr.getNext();
        }
        return new Point(SW);
    }// end of the Private method B

    // Method 6- minimalContainer
    /**
     * The method Returns a new rectangle.
     * which is the rectangle with the minimum area that could contains all the
     * rectangles in the list.
     * In case there are no rectangles in the list the method will return null.
     * Time complexity is O(n).
     * Space complexity is O(1).
     * we are not inserting variables that depends on the length of the list.
     * 
     * @return Represent new rectangle with the min area that could contains all the
     *         rectangles in the list.
     */
    public RectangleA minimalContainer() {
        if (_head == null)// in case the list is empty and is no rectangles in the list
        {
            return null; // return null
        }
        Point pointNE = new Point(this.mostRightRect().getX(), this.highestRect().getY());
        /*
         * The north east point which mean the most right
         * and the most high point of the rectangle
         * has the x coordinate of the most right rectangle
         * and the y coordinate of the highest rectangle
         */

        Point pointSW = new Point(this.mostLeftRect().getX(), this.lowestRect().getY());
        /*
         * The south west point which mean the most left
         * and the most lower point of the rectangle
         * has the x coordinate of the most left rectangle
         * and the y coordinate of the lowest rectangle
         */

        RectangleA minimalContainer = new RectangleA(pointSW, pointNE);
        return minimalContainer;

    }// end of the method 6 - minimalContainer

    // Method 7
    /**
     * The method returns string of characters that representing the list of
     * rectangles.
     * The string should be in the format:
     * Note that there are no spaces in the string that represents the point.
     * For example, the method will return a string in the following format:
     * The list has 3 rectangles.
     * 1. Width = 5 Height = 4 PointSW = (2,1)
     * 2. Width = 4 Height = 7 PointSW = (2,1)
     * 3. Width = 5 Height = 4 PointSW = (3.1)
     * If there are no rectangles in the list,
     * the method will return a string in the following format:
     * The list has 0 rectangles.
     * TIME complexity is O(n)
     * Because the method goes all over the list, and keep on a direct relation.
     * Space complexity is O(n)= the length of the string is maintain a direct
     * relation with the length of the list.
     */
    public String toString() {
        RectNode ptr = _head;
        String finalStr = new String();
        String str = "";
        int i = 0; // i represents the sum of the num of rectangles in the list and num of
                   // rectangle itself.
        for (i = 0; ptr != null;) {
            if (ptr.getRect() != null) {
                i++;
                str += "\n" + i + ". " + ptr.getRect().toString();
            }
            ptr = ptr.getNext();
        }
        finalStr = "The list has " + i + " rectangles." + str;
        return finalStr;
    }// end of the method toSrting - 7

    // Good luck :)

}// end of the class RectList