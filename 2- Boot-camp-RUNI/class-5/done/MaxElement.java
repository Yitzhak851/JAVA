package done;
public class MaxElement {
	public static int findMax(int[] arr) {
		int res =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > res){
				res=arr[i];
			}
		}
		return res;
	}

	// >> java MaxElement 1 2 3 4 5 (return 5)
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		System.out.println("The max num is: "+ findMax(arr));
		
	}
}