import java.util.List;

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
    public void add(T value);
    public void add(T index, T value);
    public int indexOf(T value);
    public int valueAt(T index);


    public String toString(){
        if(size == 0){
            return "()";
        }
        String 
    }
}
