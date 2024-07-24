public class GeneralPurposeHeap<T extends Comparable<T>> {
    // Storage for elements in the heap
    private T[] dataArray;
    // Number of items currently in the heap
    private int size;
    // Max number of items this heap can hold without expanding
    private int currentMaxCapacity;
    // A reasonable starting capacity for heaps. Heap will expand if capacity is exceeded
    private static final int DEFAULT_HEAP_CAPACITY = 32;

    /**
     * Create a new, empty heap.
     */
    public GeneralPurposeHeap() {
        this(DEFAULT_HEAP_CAPACITY);
    }

    /**
     * Create a new, empty heap with the provided capacity.
     */
    @SuppressWarnings("unchecked")
    public GeneralPurposeHeap(int initialCapacity) {
        // We will keep dataArray[0] unused. This lets us pretend it's an array that is indexed from 1 instead of 0.
        // That's nice for keeping the code close to the pseudocode in the slides, making it easier to understand.
        dataArray = (T[]) new Comparable[initialCapacity + 1];
        size = 0;
        this.currentMaxCapacity = initialCapacity;
    }

    /**
     * Create a heap and populate it with initial data. The runtime is linear in the length of the provided array
     */
    public GeneralPurposeHeap(T[] initialData) {
        this(initialData.length);
        System.arraycopy(initialData, 0, dataArray, 1, initialData.length);
        size = initialData.length;
        buildHeap();
    }

    /**
     * Add a new element to the heap. The heap property is maintained by percolation (up).
     * If the heap is already full, the capacity will be doubled before insertion.
     */
    public void insert(T element) {
        if (size == currentMaxCapacity) {
            doubleCapacity();
        }
        size++;
        dataArray[size] = element;
        percolateUp(size, element);
    }

    /**
     * Return the minimum element of this heap.
     * No modifications are made to the heap itself.
     */
    public T findMin() {
        if (size == 0) {
            throw new IllegalStateException("An empty Heap has no minimum");
        }
        return dataArray[1];
    }

    public int getSize() {
        return size;
    }

    /**
     * Delete and return the minimum element from this heap.
     * Calling this function on an empty heap throws an exception.
     */
    public T deleteMin() {
        if (size == 0) {
            throw new IllegalStateException("Cannot delete order from an empty Heap");
        }
        T smallestElement = dataArray[1];
        dataArray[1] = dataArray[size];
        percolateDown(1, dataArray[1]);
        dataArray[size] = null;
        size--;
        return smallestElement;
    }

    /**
     * Merges another heap's elements into this heap. The runtime is O(n) (where n is the new number of elements)
     * sine buildHeap is used as a subroutine.
     */
    public void mergeHeap(GeneralPurposeHeap<T> otherHeap) {
        int newSize = this.getSize() + otherHeap.getSize();

        if (newSize > currentMaxCapacity) {
            // Keeps the size of the dataArray a power of 2
            this.setNewCapacity(2 * Math.max(this.currentMaxCapacity, otherHeap.currentMaxCapacity));
        }

        int srcStart = 1;
        int destStart = this.getSize() + 1;
        int numToCopy = otherHeap.getSize();
        System.arraycopy(otherHeap.dataArray, srcStart, this.dataArray, destStart, numToCopy);

        this.size = newSize;
        this.buildHeap();
    }

    private void doubleCapacity() {
        this.setNewCapacity(2 * currentMaxCapacity);
    }

    /**
     * Increase the size of the data array to newCapacity. An exception is thrown if an attempt to reduce the capacity
     * is made. This runs in O(n) time since all elements are copied over to the new array.
     */
    @SuppressWarnings("unchecked")
    private void setNewCapacity(int newCapacity) {
        if (newCapacity < this.getSize()) {
            throw new IllegalStateException("Cannot set capacity below number of elements");
        }
        T[] newDataArray = (T[]) new Comparable[newCapacity + 1];
        int stopIndex = Math.min(dataArray.length, newDataArray.length);
        System.arraycopy(dataArray, 0, newDataArray, 0, stopIndex);
        this.dataArray = newDataArray;
        this.currentMaxCapacity = newCapacity;
    }

    /**
     * Restructure data array to have the heap property. This runs in O(n) time.
     */
    private void buildHeap() {
        for (int index = size / 2; index >= 1; index--) {
            percolateDown(index, dataArray[index]);
        }
    }

    private void percolateUp(int index, T element) {
        if (index == 1) {
            dataArray[index] = element;
            return;
        }

        int parentIndex = index / 2;
        T parentElement = this.parent(index);

        if (parentElement.compareTo(element) < 0) {
            dataArray[index] = element;
        } else {
            dataArray[index] = parentElement;
            percolateUp(parentIndex, element);
        }
    }

    private void percolateDown(int index, T element) {
        int leftChildIndex = 2 * index;

        if (leftChildIndex > this.size) {
            // We can directly create add the element as a leaf
            dataArray[index] = element;
        } else if (leftChildIndex == this.size) {
            // The element will either be the only child of leftChild element or vice-versa depending on which is sooner
            T leftChild = leftChild(index);
            if (leftChild.compareTo(element) < 0) {
                // leftChild will be the parent of element, element is a leaf
                dataArray[index] = leftChild;
                dataArray[leftChildIndex] = element;
            } else {
                // element will be the parent of leftChild, leftChild remains a leaf as before
                dataArray[index] = element;
            }
        } else {  // i.e., leftChildIndex < this.size
            int smallerElementIndex = leftChild(index).compareTo(rightChild(index)) < 0 ? leftChildIndex : leftChildIndex + 1;
            if (dataArray[smallerElementIndex].compareTo(element) < 0) {
                dataArray[index] = dataArray[smallerElementIndex];
                percolateDown(smallerElementIndex, element);
            } else {
                dataArray[index] = element;
            }
        }
    }

    /**
     * Calculate index of parent for node contained at provided index
     */
    private T parent(int index) {
        int parentIndex = index / 2;
        validateIndex(parentIndex);
        return dataArray[parentIndex];
    }

    /**
     * Calculate index of left child for node contained at provided index
     */
    private T leftChild(int index) {
        int childIndex = 2 * index;

        validateIndex(childIndex);
        return dataArray[childIndex];
    }

    /**
     * Calculate index of right child for node contained at provided index
     */
    private T rightChild(int index) {
        int childIndex = 2 * index + 1;

        validateIndex(childIndex);
        return dataArray[childIndex];
    }

    /**
     * Throw an exception if index is not valid for underlying data array
     */
    private void validateIndex(int index) {
        if (!isValidIndex(index)) {
            throw new IndexOutOfBoundsException(String.format("Cannot access index %d in GeneralPurposeHeap's underlying array", index));
        }
    }

    /**
     * Return boolean representing whether index is valid for underlying data array.
     * Note: since we index our array from 1, 0 is not a valid index
     */
    private boolean isValidIndex(int index) {
        return 1 <= index && index < dataArray.length;
    }
}
