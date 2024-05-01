public class Node {
    // fields
    int value; // data
    Node next = null; // pointer to the next node

    // constructor's
    // 0) - create Node = new Node(this.val, next);
    // 1) - add nodes to list create Node = new Node(this.val, next);
    // 2) - remuve nodes from list
    // 3) - indexOf
    // 4) - valueAt
    // 5) - getter and setters

    /*
     * construct a node with the given value
     * the new node will pointer to null
     */
    public Node(int value) {
        // call to the other constructor with next = null
        this(value, null);
    }

    /*
     * construct a node with the given value
     * the new node will pointer to the new node
     */
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    /*
     * this operator get the value of the next Node
     */
    public int getValue() {
        return this.value;
    }

    /*
     * this operator get the value of the next Node
     */
    public void setValue(int value) {
        this.value = value;
    }

    /*
     * 
     */
    public Node getNext() {
        return this.next;
    }

    /*
    *
    */
    public void setNext(Node next) {
        this.next = next;
    }

    /*
     * construct a node with the given value
     * the new node will pointer to the new node
     */
    public String toString() {
        return "" + value;
    }
}