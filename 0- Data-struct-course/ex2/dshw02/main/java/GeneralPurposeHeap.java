/*
 * It is a generic class - heap class
 * capable of storing any object with one restriction:
 * The heap can store Compara-able objects.
 * @author - Yitzhak Bar or
 * @version - 27/04/24
 */
public class GeneralPurposeHeap<T> {
    // Fields
    int initialCapacity;
    T[] initialData;
    T element;

    // Consructor's
    public GeneralPurposeHeap() {
        //
    }

    public GeneralPurposeHeap(int initialCapacity) {
        //
    }

    public GeneralPurposeHeap(T[] initialData) {
        //
    }

    // Operator's of this ADT
    public void insert(T element) {
        //
    }

    public T findMin() {
        
        //
        //return T;
    }

    public int getSize() {
        //
        return -1;
    }

    public T deleteMin() {
        //
    }

    public void mergeHeap(GeneralPurposeHeap<T> otherHeap) {
        //
    }
}
