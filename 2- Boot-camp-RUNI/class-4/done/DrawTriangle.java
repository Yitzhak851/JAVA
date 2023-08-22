/*
 * Draws a right-angled triangle made of '*' of a given height
 * NOTE: We assume positive height
 * >>run java DrawTriangle 5
 * 1- *****
 * 2- ****
 * 3- ***
 * 4- **
 * 5- *
 */
package done;

public class DrawTriangle {
	public static void main(String[] args) {
		int h = Integer.parseInt(args[0]);
		for(int j=h;j>=1;j--){
			for (int i=1; i<=j; i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
