package done;
/*
 * The program recieves an integer from the user.
 * and then prints all consecutive powers of 5.
 */
class MathExample {
	public static int allConsecutivePowers5(int a) {
		int loop=1;
		for(int i=1; i<=a; i++){
			loop *= 5;
			System.out.println(" " +loop);
		}
		return loop;
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		allConsecutivePowers5(n);
	}
}