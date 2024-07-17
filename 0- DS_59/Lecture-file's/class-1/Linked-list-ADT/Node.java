import java.util.List;

/*
 * This class represent Generic Node.
 * @author - Yitzhak851
 * @version - 14/07/24
 */

public class Node<E> {
// ================== fields ===============================
    private E data;
    private Node<E> next;

// ================== constructor ==========================
    public Node(E data){
        this.data = data;
        this.next = null;
    }

    public Node(E data, Node<E> next){
        this.data = value;
        this.next = next;
    }
    
// ================== operators =============================
    
    public String toString(){
        return "" + value;
    }
}
