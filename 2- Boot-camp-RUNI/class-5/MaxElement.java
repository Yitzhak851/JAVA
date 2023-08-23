public class MaxElement {
	/*
	 * recieves an array of integers
	 * returns the maximal integer found in the array
	 */
	public static int findMax(int[] arr) {
		int max=1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[i+1]){
				max=i;
				return max;
			}
		}
		return max;
	}

	// >> java MaxElement 1 2 3 4 5 (return 5)
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		findMax(arr);
	}
}