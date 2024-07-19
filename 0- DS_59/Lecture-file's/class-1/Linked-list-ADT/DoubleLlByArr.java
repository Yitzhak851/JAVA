import java.util.Scanner;

public class DoubleLlByArr {
    static Scanner s = new Scanner(System.in);
    static int len = s.nextInt();
    static char[] arrD = new char[len]; // Data - basic type array(int/char)
    static int[] arrN = new int[len];  // Pointer next
    static int[] arrP = new int[len];  // Pointer prev

    public static void startMessage() {
        System.out.println("Implement 'Linked-List' by 2 array's \n ");
    }

    public static void fofo1() {
        int x = -1;
        for (int i = 0 ; i < arrN.length ; i++) {
            arrN[i] = x;
            x++; // all the cels start with -1 value - pointer to null
        }
    }

    public static void fofo2(){
        char c = 'A';
        for (int i = 0; i < arrD.length; i++) {
            arrD[i] = c;
            c++;
        }
    }

    public static void fofo3() {
        int x = -1;
        for (int i = 0 ; i < arrP.length ; i++) {
            arrP[i] = x;
            x++; // all the cels start with -1 value - pointer to null
        }
    }

    public static void printArray(){
        for (int i = 0; i < arrD.length; i++) {
            System.out.println("\t" + arrD[i] + "\t" + arrN[i] + "\t" + arrP[i]);
        }
    }

    public static void printDataStatus(){
        System.out.println("\tD\tN\tP");
        System.out.println("\t=\t=\t=\n");
        printArray();
    }
    
    public static void welcomeMeesage(){
        System.out.println("==================== Welcome ========================");
    }

    public static void main(String[] args){
        welcomeMeesage();
        System.out.print("Give me length for the array: ");
        len = s.nextInt();
        fofo1(); // init all arrN 
        fofo2();
        printDataStatus();
    } // end main-method

}

