import java.util.Random;

public class Sorter {
    private static final Random rand = new Random(); // Create staticRandomObject-4-generate-random-Num
    // ======================================== quickSort ========================================
    public static <T extends Comparable<T>> void quickSort(T[] array){
        // Call private-QuickSort-method-with-full-range-of-the-array
        quickSort(array,0,array.length-1);
    }
    private static <T extends Comparable<T>> void quickSort(T[] array, int low, int high){
        // base-case
        if(low < high){
            // Partition the array and get the pivot index
            int pivot = pivotAndPartition(array,low, high);
            // Recursively call
            // sort the elements before and after the pivot
            quickSort(array,low,pivot-1);
            quickSort(array,pivot+1,high);
        }
    }
    private static <T extends Comparable<T>> int pivotAndPartition(T[] array, int low, int high){
        //another version of choosing int randPivot = low + (int)(Math.random() * (high-low));
        // Swap the pivot with the last element of the range
        swap(array,high,rand.nextInt(high-low+1)+low);
        // Get the pivot value
        T pivot = array[high];
        // Initialize the index for elements smaller than the pivot
        int i = low -1;
        // Iterate over each element in the range
        for(int j = low; j < high; j++){
            // If the current element is smaller or equal to the pivot
            if(array[j].compareTo(pivot) <= 0){
                // Increment the smaller elements index and swap the current element with the element at the new index
                i++;
                swap(array, i,j);
            }
        }
        // Swap the pivot with the first element that is larger than it
        swap(array, i+1, high);
        // Return the pivot index
        return i+1;
    }
    private static <T extends Comparable<T>> void swap(T[] array, int i, int j){
        if(i != j){
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    // ======================================== MergeSortNoRecursion ==============================
    public static <T extends Comparable<T>> void mergeSortNoRecursion(T[] array){
        // Get the length of the array
        int n = array.length;
        // Outer loop to control the size of the subarrays
        for(int size = 1 ; size <= n; size=size*2){
            // Inner loop to move through the array and sort subarrays of the current size
            for(int left = 0; left < n-1; left =left+size*2){
                // Calculate the middle and right indices of the current subarray
                int mid = Math.min(n,left+size);
                int right = Math.min(n,left+size*2);
                // Call the merge function to sort and merge the current subarray
                merge(array,left,mid,right);
            }
        }
    }
    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> void merge(T[] array, int left, int mid, int right){
        // Calculate the sizes of the two subarrays
        int n1 = mid - left;
        int n2 = right - mid;
        // Create two temporary arrays and copy the elements of the subarrays into them
        T[] leftArray =(T[]) new Comparable[n1];
        T[] rightArray = (T[]) new Comparable[n2];
        System.arraycopy(array,left,leftArray,0,n1);
        System.arraycopy(array,mid,rightArray,0,n2);
        // Initialize indices for the two subarrays and the merged array
        int i =0;
        int j=0;
        int k = left;
        // Merge the two subarrays back into the original array
        while(i < n1 && j < n2){
            // If the current element in the left subarray is smaller or equal, move it to the merged array
            if(leftArray[i].compareTo(rightArray[j]) <= 0){
                array[k++] = leftArray[i++];
                // Otherwise, move the current element in the right subarray to the merged array
            }else{
                array[k++] = rightArray[j++];
            }
        }
        // If there are remaining elements in the left subarray, move them to the merged array
        while(i < n1){
            array[k++] = leftArray[i++];
        }
        // If there are remaining elements in the right subarray, move them to the merged array
        while(j < n2){
            array[k++] = rightArray[j++];
        }
    }
    // ======================================== RadixSort ========================================
    public static void radixSort(Long[] array, int bitsPerDigit){
        Long max = findMax(array);         // Find the maximum value in the array
        int maxDigit = (int)(Math.log(max)/Math.log(1 << bitsPerDigit)) + 1; // Calculate the maximum number of digits needed for the radix sort
        // Perform counting sort for each digit position
        for(int i = 0; i < maxDigit; i++){
            countingSort(array,bitsPerDigit,i);
        }
    }
    private static Long findMax(Long[] array){
        // Initialize max with the first element of the array
        Long max = array[0];
        // Iterate through the array to find the maximum value
        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    private static  void countingSort(Long[] arr, int bitsPerDigit, int digitIndex){
        int[] count = new int[1 << bitsPerDigit];
        Long[] output = new Long[arr.length];
        for(Long value : arr){
            int digit = extractDigit(value,bitsPerDigit,digitIndex);
            count[digit]++;
        }
        for(int i = 1; i < count.length; i++){
            count[i] += count[i - 1];
        }
        for(int i = arr.length - 1; i >= 0; i--){
            int digit = extractDigit(arr[i],bitsPerDigit,digitIndex);
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }
        System.arraycopy(output,0,arr,0,arr.length);
    }
    private static int extractDigit(Long key, int bitsPerDigit, int digitIndex){
        //Shifting key to the right by (bitsPerDigit * digitIndex).
        Long siftedKey = key >> (bitsPerDigit * digitIndex);
        /*      This line extracts a digit from a number.
        1 << bitsPerDigit: This shifts 1 to the left by bitsPerDigit places,
        creating a binary number with a 1 in the bitsPerDigit position.
        (1 << bitsPerDigit) - 1:
        Subtracting 1 turns all bits to the right of the bitsPerDigit position into 1s, creating a mask.
        shiftedKey & ((1 << bitsPerDigit) - 1):
        This applies the mask to shiftedKey using a bitwise AND operation, isolating the digit.
        (int)(shiftedKey & ((1 << bitsPerDigit) - 1)): This casts the result to an integer.
         */
        int digit = (int)(siftedKey & ((1 << bitsPerDigit) - 1 ));
        return digit;
    }
}


