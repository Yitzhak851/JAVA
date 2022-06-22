/**
 * The RectNode class represents a node in a linked list that has a rectangle in it.
 *
 * @author Elyasaf Tsarum
 * @version 22.01.22
 */
public class RectNode
{
    private RectangleA _rect; //attribute of rectangle inside the node
    private RectNode _next; //atribute pointer for the next node in the list

    /**
     * First constructor for objects of class RectNode.
     * Constructs a new RectNode with the specified RectangleA.
     * @param r The RectNode Rectangle.
     */
    public RectNode (RectangleA r){
        _rect = new RectangleA(r);
        _next = null;
    }

    /**
     * Second constructor for objects of class RectNode.
     * Constructs a new RectNode with the specified RectangleA
     * and initialize the _next RectNode to be n.
     * @param r The RectNode Rectangle.
     * @param n The next element pointer.
     */
    public RectNode (RectangleA r, RectNode n){
        _rect = new RectangleA(r);
        _next = n;
    }

    /**
     * Copy constructor for objects of class RectNode.
     * Constructs a RectNode using another RectNode.
     *
     * @param r The other RectNode from which to construct the new RectNode.
     */
    public RectNode (RectNode r){
        this._rect = new RectangleA(r._rect);
        this._next = r._next;
    }

    /**
     * Returns the Rectangle of the RectNode.
     * The TIME and the SPACE complexity is O(1) 
     * because during the time running there is a constant object 
     * that takes a constant amount of time and space to run
     * @return the Rectangle of the RectNode.
     */
    public RectangleA getRect(){
        return new RectangleA(_rect);
    }

    /**
     * Returns the next element pointer of the RectNode.
     * The TIME and the SPACE complexity is O(1) 
     * because during the time running there is a constant object 
     * that takes a constant amount of time and space to run
     * @return the Rectangle of the RectNode.
     */
    public RectNode getNext(){
        return _next;
    }

    /**
     * Sets the RectangleA of the RectNode.
     * The TIME and the SPACE complexity is O(1) 
     * because during the time running there is a constant object 
     * that takes a constant amount of time and space to run
     * @param r the new RectangleA of the RectNode.
     */
    public void setRect(RectangleA r){
        _rect = new RectangleA(r);
    }

    /**
     * Sets the next element Pointer of the RectNode.
     * The TIME and the SPACE complexity is O(1) 
     * because during the time running there is a constant object 
     * that takes a constant amount of time and space to run
     * @param next the new next element Pointer of the RectNode.
     */
    public void setNext(RectNode next){
        _next = next;
    }
}
