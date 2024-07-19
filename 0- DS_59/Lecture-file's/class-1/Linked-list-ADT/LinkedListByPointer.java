
import java.util.List;
import org.w3c.dom.Node;

// This class represent class of linkedList by JAVA programming language .
// It is "generic-type" linked-list,
// it mean that <E> element can be Integer, String, Double linkedList...
// ut can be linked-list of names, of number ....

public class LinkedListByPointer<E> {
    public class Node<E> {
            private E data;
            private Node<E> next;
        
            public Node(E data){
                this.data = data;
                this.next = null;
            }
        
            public Node(E data, Node<E> next){
                this.data = value;
                this.next = next;
            }
        
            public String toString(){
                return "" + value;
            }
        }

// ================== fields ===============================
    private Node<E> first; // this field catch the "head" of the list
    private Node<E> tailNode; // this field catch the "tail" of the list
    private Node<E> next;
    private int size;   // this field represent the "size" of the list
    

// ================== constructor ==========================
    public LinkedListByPointer(){
        first = null;
        size = 0;
    }


// ================== operators =============================
    public void add(T valtT){
        Node<E> tmp = new Node<LinkedListByPointer.T>(valtT);  // <List.T> can be int, String, double, and...
        if (first == null) {
            first = tmp;
        } else {
            Node<E> currNode = first; // create newNode
            while (currNode.next != null ) {
                currNode = currNode.next;
            }
            currNode.next = tmp;
        }
        size++;
    }
    
    public void addFirst(T valtT){
        Node<E> newNode = new Node<LinkedListByPointer.T>(valtT);
        newNode.next = first;
        first = newNode;
        size++;
    }

    //public void add(T index, T value);
    
    public int indexOf(T valT){
        Node<E> currNode = first;
        int index = 0;
        while (currNode != null) {
            if (currNode.value == valT) {
                return index;
            }
            currNode = currNode.next;
            index++;
        }
        return -1;
    }
    
    //public int valueAt(T index);

    public int removeValue(T valT){
        Node<E> prev = null;
        Node<E> current = first;
        while (current != null && current.value != valT) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            return false;
        }
        if (prev == null) {
            first = first.next;
        } else {
            prev.next = current.next;
        }
        size--;
        return true;
    }

    public String toString(){
        if(size == 0){
            return "()";
        }
        String str = "(";
        Node<E> current = first;
        while (current != null) {
            str += current.value + " ";
            current = current.next;
        }
        return str.substring(0, str.length()-1+")");
    }

}
