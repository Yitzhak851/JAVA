public class Assignment533 {
    public static boolean search(int[] arr, int a) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==a){
                return true;
            }
        }
        return false;
    }
    public static int[] sortArray(int[] arr) {
		int[] sortedArray = new int[arr.length];
        int i=0;
        for(int res=findMax(arr); i < arr.length; res--){
            if(search(arr,res)){
                sortedArray[i]=res;
                i++;
            }
        }
        return sortedArray;
	}
    public static int findMax(int[] arr) {
		int res =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > res){
				res=arr[i];
			}
		}
		return res;
	}

    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        int[] sortArr = sortArray(arr);
        for(int i=0; i<sortArr.length; i++){
            System.out.println(sortArr[i]);
        }
    }
}

// Given an array of n integers, find the number with the highest value and put it in the first cell of
// the array, the second highest number in the second cell, …, the lowest number in the last cell.
// In other words, sort the array. - [V]
// Clarification: the array should be declared and initialized in your main function
// For example: (for the input array {1, 6, 3, 9, 5, 2, 10})
// java Assignment3
// 10
// 9
// 6
// 5
// 3
// 2
// 1
