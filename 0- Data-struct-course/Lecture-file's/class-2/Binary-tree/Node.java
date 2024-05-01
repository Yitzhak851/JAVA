public class Node {
    // fields
    int value;
    Node left;
    Node right;

    // constructor
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }// end of node constructor

    public Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

}// end of class