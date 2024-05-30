public class Node<T> {
// ================== fields ===============================
    private T value;
    private Node<T> next;

// ================== constructor ==========================
    public Node(T value){
        this(value, null);
    }
    public Node(T value, Node<T> next){
        this.value = value;
        this.next = next;
    }
// ================== operators =============================
    
    public String toString(){
        return "" + value;
    }
}
