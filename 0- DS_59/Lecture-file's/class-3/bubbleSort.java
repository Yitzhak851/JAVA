import java.util.Random;

public class bubbleSort {
    static int[] arr = new int[40];
    Random rand = new Random();

    public static void main(String[] args) {
        
    }

    public static void initArr(){
        for (int i = 0; i < arr.length; i++) {
            int randNum = rand.nextInt(100);
            arr[i] = randNum;
        }
    }
}
