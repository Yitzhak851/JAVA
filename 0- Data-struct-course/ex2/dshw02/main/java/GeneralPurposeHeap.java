/*
 * It is a generic class - heap class
 * capable of storing any object with one restriction:
 * The heap can store Compara-able objects.
 * @author - Yitzhak Bar or
 * @version - 27/04/24
 */
// GeneralPurposeHeap class:
// As you can see in the code listing towards the end of this PDF, GeneralPurposeHeap has three
// constructors for you to implement. They each serve a different purpose to users.
// The GeneralPurposeHeap class should have the following methods:
// • Constructor taking no parameters. Creates a heap with a sensible default capacity
//      (“sensible” is subjective; use your best judgement).
// • Constructor taking a single parameter, an int “initialCapacity” which defines the initial
//      number of elements the heap can store before resizing.
// • Constructor taking a single parameter, an array “initialData”. If you use “T” as the type
//      variable of GeneralPurposeHeap then the type of this parameter should be T[].
//      (If this description doesn’t make sense to you, consider reading about Generic Types in
//      Java).
// Important note: 
// your implementation must run in linear time (linear in the size of the  resulting heap).
// Take particular care when implementing mergeHeap. 
// This method takes a second heap as a parameter and “merges” that heap’s elements into the current heap. 
// I.e., after merging otherHeap and the heap represented by this:
// • otherHeap has not been altered in any way,
// • this contains the union of the elements of this (before the merge) and of otherHeap
// • this still satisfies the heap property
// Important note: 
// your implementation must run in linear time (linear in the size of the resulting heap).
// Insert into a Heap which is full should not cause an error. 
// The Heap should grow in capacity to hold more elements, then insert the element as normal.
// deleteMin/findMin on an empty heap should throw an exception

import java.util.ArrayList;
import java.util.List;

public class GeneralPurposeHeap<T> {
    // ============== fields ==============
    int initialCapacity;
    T[] initialData;
    T element;

    // ============== constructor ==============
    // done
    public GeneralPurposeHeap() {
        this.initialCapacity = initialCapacity;
        this.initialData = initialData;
        this.element = element;
    }

    // done
    public GeneralPurposeHeap(int initialCapacity) {
        this.initialCapacity = initialCapacity;
    }

    // done
    public GeneralPurposeHeap(T[] initialData) {
        this.initialData = initialData;
    }

    // ============== Operator's of this ADT ==============
    // TODO
    // Insert into a Heap which is full should not cause an error
    // The Heap should grow in capacity to hold more elements, then insert the element as normal.
    public void insert(T element) {
        if (getSize() == 0) {
            initialData[0] = element;
        }
        if (getSize() == initialData.length) {
            // grow in capacity
            // insert the element as normal
        } else {

            // insert the element as normal

        }
    }

    // deleteMin/findMin on an empty heap should throw an exception
    // TODO
    public T findMin() {
        // if (getSize() == 0) {
        // throw new Exception("Empty heap");
        // }
        return null;
    }

    public int getSize() {
        return initialData.length;
    }

    public T deleteMin() {
        return null;
    }

    public void mergeHeap(GeneralPurposeHeap<T> otherHeap) {
        //
    }

    public static void main(String[] args) {
        // GeneralPurposeHeap<MoltOrder> orderHeap = new GeneralPurposeHeap<>();
        // orderHeap.insert(order1);
        // orderHeap.insert(order2);
        // orderHeap.insert(order3);
    }

} // end class
