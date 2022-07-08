/**
 * This class represents node in a linked list that has a rectangle inside.
 *
 * @author Yitzhak Bar-or
 * @version 1.0
 */
public class RectNode {
    // Atributes
    private RectangleA _rect; // Attribute of the rectangle inside the node
    private RectNode _next; // pointer in the list for the next node

    // Constructor 1
    /**
     * 1- Constructor for objects of the class.
     * Constructs new RectNode with the RectangleA specified in.
     * 
     * @param r Represent the RectNode Rectangle.
     */
    public RectNode(RectangleA r) {
        _rect = new RectangleA(r);
        _next = null;
    }

    // Constructor 2
    /**
     * 2- Constructor for objects of class RectNode.
     * Constructs new RectNode with the specified RectangleA
     * initialize the _next RectNode to n.
     * 
     * @param r Represent the RectNode Rectangle.
     * @param n Represent the next element pointer.
     */
    public RectNode(RectangleA r, RectNode n) {
        _rect = new RectangleA(r);
        _next = n;
    }

    // Constructor 3
    /**
     * 3- Copy constructor for objects of class RectNode.
     * Constructs RectNode by use another RectNode.
     *
     * @param r Represent the other RectNode from which to construct the new
     *          RectNode.
     */
    public RectNode(RectNode r) {
        this._rect = new RectangleA(r._rect);
        this._next = r._next;
    }

    // Method 1
    /**
     * Return the Rectangle of the RectNode.
     * Time and space complexity is O(1)
     * because there is a constant object
     * that takes constant amount of time and space to run
     * 
     * @return Represent the Rectangle of the RectNode.
     */
    public RectangleA getRect() {
        return new RectangleA(_rect);
    }

    // Method 2
    /**
     * Returns the next element pointer of the RectNode.
     * Time and space complexity is O(1)
     * because there is a constant object
     * that takes a constant amount of time and space to run
     * 
     * @return Represent the Rectangle of the RectNode.
     */
    public RectNode getNext() {
        return _next;
    }

    // Method 3
    /**
     * Sets the RectangleA of the RectNode.
     * Time and space complexity is O(1)
     * because there is a constant object
     * that takes a constant amount of time and space to run
     * 
     * @param r Represent the new RectangleA of the RectNode.
     */
    public void setRect(RectangleA r) {
        _rect = new RectangleA(r);
    }

    // Method 4
    /**
     * Sets the next element Pointer of the RectNode.
     * Time and space complexity is O(1).
     * because there is a constant object
     * that takes a constant amount of time and space to run
     * 
     * @param next - Represent the new next element Pointer of the RectNode.
     */
    public void setNext(RectNode next) {
        _next = next;
    }
}
