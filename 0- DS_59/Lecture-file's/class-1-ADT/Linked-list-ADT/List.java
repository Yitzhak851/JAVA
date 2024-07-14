import java.util.List;

// This class represent class of linkedList
// by JAVA programming language .
// It is "generic-type" linked-list,
// it mean that <T> can be Integer, String, Double linkedList...
// ut can be linked-list of names, of number ....

public class List<T> {
// ================== fields ===============================
    private Node<T> first;
    private int size;

// ================== constructor ==========================
    public List(){
        first = null;
        size = 0;
    }


// ================== operators =============================
    public void add(T valtT){
        Node<T> tmp = new Node<List.T>(valtT);
        if (first == null) {
            first = tmp;
        } else {
            Node<T> currNode = first;
            while (currNode.next != null ) {
                currNode = currNode.next;
            }
            currNode.next = tmp;
        }
        size++;
    }
    
    public void addFirst(T valtT){
        Node<T> newNode = new Node<List.T>(valtT);
        newNode.next = first;
        first = newNode;
        size++;
    }

    //public void add(T index, T value);
    
    public int indexOf(T valT){
        Node<T> currNode = first;
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
        Node<T> prev = null;
        Node<T> current = first;
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
        Node<T> current = first;
        while (current != null) {
            str += current.value + " ";
            current = current.next;
        }
        return str.substring(0, str.length()-1+")");
    }
}
