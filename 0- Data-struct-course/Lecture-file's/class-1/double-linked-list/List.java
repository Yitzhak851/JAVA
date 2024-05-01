public class List {
    // fields
    Node first;
    int size = 0;

    // constructor
    // 0) - create list List l1 = new List();
    // 1) - add nodes to list
    // 2) - remuve nodes from list
    // 3) - indexOf
    // 4) - valueAt

    /*
     * construct an empty list
     */
    public List() {
        first = null;
        size = 0;
    }

    public void addToFirst(int value) {
        if (size == 0) {
            Node current = new Node(value);
            size++;
        }
        Node current = new Node(value);
        size++;

    }

    public String toString() {
        if (size == 0) {
            return "()";
        }
        String str = "(";
        Node current = first;
        while (current != null) {
            str += current.value + " ";
            current = current.next;
        }
        return str.substring(0, str.length() - 1) + ")";
    }
}
