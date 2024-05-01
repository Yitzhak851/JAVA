/*
 * It is a generic class - heap class
 * capable of storing any object with one restriction:
 * The heap can store Compara-able objects.
 * @author - Yitzhak Bar or
 * @version - 27/04/24
 */

import java.util.*;

public class GeneralPurposeHeap<T extends Comparable<T>> {
    // ============== fields/ properties ==============
    private int size; // number of elements in the heap
    private T[] heap; // array of elements - heap
    // ============== constructor ==============
    public GeneralPurposeHeap() {
        this(20);
    }
    @SuppressWarnings("unchecked")
    public GeneralPurposeHeap(int initialCapacity) {
        // checks if the initial capacity is less than 1, if so throws an exception
        if (initialCapacity < 1)
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity + " capacity must be at least 1");
        // Initializes the heap array with the initial capacity and the size of the heap
        this.heap = (T[]) new Comparable[initialCapacity];
        this.size = 0;
    }
    public GeneralPurposeHeap(T[] initialData) {
        this.size = initialData.length;
        this.heap = Arrays.copyOf(initialData, size);

        for (int i = size / 2; i >= 0; i--) {
            percolateDown(i);
        }
    }
    // ============== Operation's of this ADT =============
    // ============== void fofo ==========================+
    public void percolateDown(int i) {
        while (hasLeftChild(i)) {
            int smallest = getLeftChildIndex(i);
            if (hasRightChild(i) && rightChild(i).compareTo(leftChild(i)) < 0) {
                smallest = getRightChildIndex(i);
            }
            if (heap[i].compareTo(heap[smallest]) < 0) {
                break;

            } else {
                swap(i, smallest);
            }
            i = smallest;
        }
    }

    public void percolateUp(int i) {
        while (hasParent(i) && parent(i).compareTo(heap[i]) > 0) {
            swap(getParentIndex(i), i);
            i = getParentIndex(i);
        }
    }

    public void swap(int i1, int i2) {
        T tmp = heap[i1];
        heap[i1] = heap[i2];
        heap[i2] = tmp;
    }

    public void insert(T element) {
        isExtraCapacity();
        heap[size] = element;
        size++;
        percolateUp(size - 1);
    }

    public void isExtraCapacity() {
        if (size == heap.length) {
            heap = Arrays.copyOf(heap, size * 2);
        }
    }

    public void mergeHeap(GeneralPurposeHeap<T> otherHeap) {
        T[] newArray = Arrays.copyOf(heap, size + otherHeap.size);
        System.arraycopy(otherHeap.heap, 0, newArray, size, otherHeap.size);
        heap = newArray;
        size += otherHeap.size;
        for (int i = size / 2; i >= 0; i--) {
            percolateDown(i);
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // ============== data fofo =================

    public T findMin() {
        if (size == 0)
            throw new IllegalArgumentException("Empty Heap");
        return heap[0];
    }

    public T deleteMin() {
        if (size == 0)
            throw new IllegalArgumentException("Empty Heap");
        T tmp = heap[0];
        heap[0] = heap[size - 1];
        heap[size - 1] = tmp;
        size--;
        percolateDown(0);
        return tmp;
    }

    public boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    public boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    public boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    // ============== getters fofo ==============

    public int getLeftChildIndex(int parentIndex) {
        return (parentIndex * 2) + 1;
    }

    public int getRightChildIndex(int parentIndex) {
        return (parentIndex * 2) + 2;
    }

    public int getSize() {
        return size;
    }

    public int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    // ============== T fofo ==============

    public T leftChild(int index) {
        return heap[getLeftChildIndex(index)];
    }

    public T rightChild(int index) {
        return heap[getRightChildIndex(index)];
    }

    public T parent(int index) {
        return heap[getParentIndex(index)];
    }

} // end class
