public class LinkedListBy2Arra {
    static char[] arrD = new char[8];  // Data - basic type array(int/char)
    static int[] arrP = new int[8];  // Pointer

    public static void main(String[] args){
        fofo1(); // init all arrN 
        fofo2();
        printDataStatus();
    } // end main-method

    public static void startMessage() {
        System.out.println("Implement 'Linked-List' by 2 array's \n ");
    }

    public static void fofo1() {
        int x = -1;
        for (int i = 0 ; i < arrP.length ; i++) {
            arrP[i] = x;
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

    public static void printArray(){
        for (int i = 0; i < arrD.length; i++) {
            System.out.println("\t" + arrD[i] + "\t" + arrP[i]);
        }
    }

    public static void helper2(){
        System.out.println("================================================");
    }

    public static void printDataStatus(){
        System.out.println("\tD\tN");
        System.out.println("\t=\t=\n");
        printArray();
    }

}

// import java.util.Scanner; // import the Scanner class
// public class LinkedListBy2Arra {
//     static char[] arrD;  // Data - basic type array(int/char)
//     static int[] arrP;  // Pointer
    
//     static int LData;
//     static int Ln;  // length of the List
//     static int Lfree; // if Lfree = -1 it means we dont have space otherwise 
//     static int Lhead = -1; // pointer to the head of the List
//     static int q;
    
//     static boolean runThisProg; // Tell me when stop to run this program
//     static Scanner s = new Scanner(System.in); // get element
//     static String x; // element value
//     static int y; // element index

//     // main method
//     public static void main(String[] args){
//         startMessage(); // start message
//         helper1(); // do what Yael do
        
//         printDataStatus();
        
//         helper2();
//         System.out.println("\ninsertFront('x');\n");
//         insertFront('x');
        
//         printDataStatus();


//     } // end main-method

//     public static void startMessage() {
//         System.out.println("Implement 'Linked-List' by 2 array's \n ");
//     }

//     public static void fofo1() {
//         int temp = -1;
//         for (int i = 0 ; i < arrP.length ; i++) {
//             arrP[i] = temp; // all the cels start with -1 value - pointer to null
//             temp++;
//         }
//     }

//     public static void fofo2() {
//         for (int i = 0; i < arrD.length; i++) {
//             arrD[i] = 'z'; // all the cels start with 'z' value = empty
//         }
//     }

//     public static boolean fo1(char[] arrD) {
//         for (int i = 0; i < arrD.length; i++) {
//             // if we have empty cell runThisProg
//             if (arrD[i] == 'z') {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void interactionFofo() {
//         System.out.print("Add char-Node = ");
//         x = s.next();
//         System.out.print("At Index = ");
//         y = s.nextInt();
//     }

//     public static void printArray(){
//         for (int i = 0; i < arrD.length; i++) {
//             System.out.println("\t" + arrD[i] + "\t" + arrP[i]);
//         }
//     }

//     public static void helper1(){
//         Ln = 8;
//         arrD = new char[Ln]; // length of Data array
//         arrP = new int[Ln]; // length of Pointer array 
//         Lhead = 3;
//         // init like Yael
//         arrD[1] = 'c';
//         arrD[3] = 'a';
//         arrD[5] = 'b';
//         Lfree = 6;
//     }

//     // insertFront(int[] arrP,char x);
//     public static void insertFront(char x){
//         // q is helper variable
//         if (Lfree != -1) {
//             q = Lfree; // helper pointer that pointer about the free node
//         } else {
//             System.out.print("overflow");
//         }
//         arrD[q] = x;
//         Lfree = arrP[Lfree];
//         arrP[q] = Lhead;
//         Lhead = q;
//     }


//     public static void helper2(){
//         System.out.println("========================");
//         System.out.println("========================");
//         System.out.println("========================");
//     }

//     public static void printDataStatus(){
//         System.out.println("\tD\tP");
//         System.out.println("\t=\t=\n");
//         printArray();
//     }

//     // public static boolean fofo3(int[] arrP){
//     //     for (int i = 0; i < arrP.length; i++) {
//     //         if (arrP[i] != -1) {
//     //             return false;
//     //         }
//     //     }
//     //     return true;
//     // }

// }
