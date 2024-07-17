import java.util.Scanner; // import the Scanner class

public class LinkedListBy2Arra {
    static int[] arrA = new int[10]; // Data
    static int[] arrB = new int[10]; // Pointer
    static Scanner s = new Scanner(System.in); // get element
    static int x; // element value
    static int y; // element index
    static int head = -1;
    static boolean runThisProg; // Tell me when stop to run this program

    // main implement addFirst
    public static void main(String[] args){
        startMessage();
        fofo1(); // init all pointer in arrB to be (-1) = NULL
        fofo2(); // init all data at arrA to be (0) = EMPTY
        while (fo1(arrA)) { // while we have empty cell - play
            interactionFofo(); // this fofo get info from user about data + pointer NODE
            // if arrB (-1) empty: y = the last index of the last pointer - head
            if (fofo3(arrB)) {
                head = y; 
            }
            if(arrB[y] != -1 && head != -1){ // if arrB-pointer to another Node - go by this map of Node until you get some null(-1) Node 
                int tmp = arrB[y];
                while (arrB[tmp] != -1) {
                    y = arrB[tmp];
                }
                // run all over the array until you have a emty cell
                for (int i = 0; i < arrB.length; i++) {
                    if (arrB[i] == -1) {
                        arrB[i-1] =  
                    }
                }
                } else {
                    arrA[y] = x; // place the data
                    arrB[y] = -1; // pointer
            }
        }
        System.out.println("We dont have a place to continue this game!");
    }

    public static void startMessage() {
        System.out.println("This program implement 'Linked-List' of integer by 2 array's {int[] arr}:) ");
    }

    public static void interactionFofo() {
        System.out.println("Please give me some Integer-Node:");
        x = s.nextInt();
        System.out.println("Please give me the index you want to save this Node at the 2 array's: ");
        y = s.nextInt();
    }

    public static boolean fo1(int[] arrA) {
        for (int i = 0; i < arrA.length; j++) {
            // if we have empty cell runThisProg
            if (arrA[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void fofo1() {
        for (int i = 0; i < arrB.length; j++) {
            arrB[i] = -1; // all the cels start with -1 value - pointer to null
        }
    }

    public static void fofo2() {
        for (int i = 0; i < arrA.length; j++) {
            arrB[i] = 0; // all the cels start with 0 value - empty
        }
    }

    public static boolean fofo3(int[] arrB){
        for (int i = 0; i < arrB.length; i++) {
            if (arrB[i] != -1) {
                return false;
            }
        }
        return true;
    }

    public static int fofo2(int nextNodeArrB) {

        return nextNodeArrB;
    }

}
