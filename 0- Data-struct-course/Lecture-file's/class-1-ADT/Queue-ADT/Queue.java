import java.util.*;

import org.w3c.dom.Node;

// FIFO - First In, First Out
// generic absract data type
public class Queue<T> {
    // fields
    private Node<T> head;
    private Node<T> last;

    // constructor - create emty Queue
    public Queue() {
        first = null;
        last = null;
    }
    // create null
    // create with value

    // operation

    // insert
    public void insert(T firsT, T value) {
        if (last == null) {
            firsT = new Node<T>(x);
            last = first;
        } else {
            last.SetNext(new Node<T>(x));
            last = last.GetNext();
        }
    }

    // remove
    // head-value
    // isEmpty ?
    public boolean isEmpty() {
        return first == null;
    }

    // toString

    public static void main(String[] args) {

    }
}
