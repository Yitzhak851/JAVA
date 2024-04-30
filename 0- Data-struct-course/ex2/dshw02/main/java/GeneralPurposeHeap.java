/*
 * It is a generic class - heap class
 * capable of storing any object with one restriction:
 * The heap can store Compara-able objects.
 * @author - Yitzhak Bar or
 * @version - 27/04/24
 */

import java.util.*;

public class GeneralPurposeHeap<T extends Comparable<T>> {
    // ============== fields ==============

    private int size; // number of elements in the heap
    private T[] heap; // array of elements - heap
    // private int initialCapacity;
    // private T element;

    // ============== constructor ==============
    public GeneralPurposeHeap() {
        this(20);
    }

    // ============== constructor ==============
    @SuppressWarnings("unchecked")
    public GeneralPurposeHeap(int initialCapacity) {
        // checks if the initial capacity is less than 1, if so throws an exception
        if (initialCapacity < 1)
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity + " Capacity must be at least 1");
        // Initializes the heap array with the initial capacity and the size of the heap
        this.heap = (T[]) new Comparable[initialCapacity];
        this.size = 0;
    }

    public GeneralPurposeHeap(T[] initialData) {
        this.size = initialData.length;
        this.heap = Arrays.copyOf(initialData, size); // copies the elements of init. array to the heap array
        for (int i = size / 2; i >= 0; i--) { // loop for percing down the heap
            percolateDown(i);
        }
    }

    // ============== Operation's of this ADT =============
    // ============== void fofo ==============

    public void percolateDown(int i) {
        while (hasLeftChild(i)) {
            int smallestClildIndex = getLeftChildIndex(i);
            if (hasRightChild(i) && rightChild(i).compareTo(leftChild(i)) < 0) {
                smallestClildIndex = getRightChildIndex(i);
            }
            if (heap[i].compareTo(heap[smallestClildIndex]) < 0) {
                break;

            } else {
                swap(i, smallestClildIndex);
            }
            i = smallestClildIndex;
        }
    }

    public void percolateUp(int index) {
        while (hasParent(index) && parent(index).compareTo(heap[index]) > 0) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public void swap(int indexOne, int indexTwo) {
        T temp = heap[indexOne];
        heap[indexOne] = heap[indexTwo];
        heap[indexTwo] = temp;
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
        T temp = heap[0];
        heap[0] = heap[size - 1];
        heap[size - 1] = temp;
        size--;
        percolateDown(0);
        return temp;
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

    // ============== getters ==============

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

    // ============== private methods ==============

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
