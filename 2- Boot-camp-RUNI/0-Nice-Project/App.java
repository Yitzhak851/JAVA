import java.util.Scanner;   // import the Scanner class
public class App {
    static String[][] arrValue = new String[14][16];
    static{ 
    arrValue[0][6] = "K";
    arrValue[0][7] = "M";
    arrValue[0][8] = "S";
    arrValue[0][9] = "H";

    arrValue[1][4] = "H";
    arrValue[1][5] = "A";
    arrValue[1][6] = "O";
    arrValue[1][7] = "S";
    arrValue[1][8] = "Y";
    arrValue[1][9] = "E";
    arrValue[1][10] = "I";
    arrValue[1][11] = "R";

    arrValue[2][2] = "E";
    arrValue[2][3] = "R";
    arrValue[2][4] = "G";
    arrValue[2][5] = "L";
    arrValue[2][6] = "N";
    arrValue[2][7] = "T";
    arrValue[2][8] = "I";
    arrValue[2][9] = "T";
    arrValue[2][10] = "M";
    arrValue[2][11] = "D";
    arrValue[2][12] = "A";
    arrValue[2][13] = "L";

    arrValue[3][1] = "O";
    arrValue[3][2] = "C";
    arrValue[3][3] = "E";
    arrValue[3][4] = "E";
    arrValue[3][5] = "E";
    arrValue[3][6] = "I";
    arrValue[3][7] = "R";
    arrValue[3][8] = "T";
    arrValue[3][9] = "R";
    arrValue[3][10] = "K";
    arrValue[3][11] = "I";
    arrValue[3][12] = "E";
    arrValue[3][13] = "D";
    arrValue[3][14] = "D";

    arrValue[4][1] = "H";
    arrValue[4][2] = "N";
    arrValue[4][3] = "U";
    arrValue[4][4] = "E";
    arrValue[4][5] = "T";
    arrValue[4][6] = "V";
    arrValue[4][7] = "A";
    arrValue[4][8] = "C";
    arrValue[4][9] = "A";
    arrValue[4][10] = "M";
    arrValue[4][11] = "E";
    arrValue[4][12] = "R";
    arrValue[4][13] = "A";
    arrValue[4][14] = "I";

    arrValue[5][0] = "E";
    arrValue[5][1] = "T";
    arrValue[5][2] = "L";
    arrValue[5][3] = "R";
    arrValue[5][4] = "N";
    arrValue[5][5] = "P";
    arrValue[5][6] = "O";
    arrValue[5][7] = "I";
    arrValue[5][8] = "A";
    arrValue[5][9] = "P";
    arrValue[5][10] = "L";
    arrValue[5][11] = "O";
    arrValue[5][12] = "T";
    arrValue[5][13] = "C";
    arrValue[5][14] = "S";
    arrValue[5][15] = "O";

    arrValue[6][0] = "D";
    arrValue[6][1] = "C";
    arrValue[6][2] = "C";
    arrValue[6][3] = "E";
    arrValue[6][4] = "L";
    arrValue[6][5] = "C";
    arrValue[6][6] = "A";
    arrValue[6][7] = "L";
    arrValue[6][8] = "T";
    arrValue[6][9] = "M";
    arrValue[6][10] = "E";
    arrValue[6][11] = "S";
    arrValue[6][12] = "O";
    arrValue[6][13] = "K";
    arrValue[6][14] = "G";
    arrValue[6][15] = "B";

    arrValue[7][0] = "O";
    arrValue[7][1] = "S";
    arrValue[7][2] = "D";
    arrValue[7][3] = "K";
    arrValue[7][4] = "E";
    arrValue[7][5] = "Y";
    arrValue[7][6] = "O";
    arrValue[7][7] = "T";
    arrValue[7][8] = "N";
    arrValue[7][9] = "C";
    arrValue[7][10] = "J";
    arrValue[7][11] = "V";
    arrValue[7][12] = "A";
    arrValue[7][13] = "C";
    arrValue[7][14] = "U";
    arrValue[7][15] = "U";

    arrValue[8][0] = "C";
    arrValue[8][1] = "I";
    arrValue[8][2] = "S";
    arrValue[8][3] = "A";
    arrValue[8][4] = "I";
    arrValue[8][5] = "L";
    arrValue[8][6] = "A";
    arrValue[8][7] = "N";
    arrValue[8][8] = "O";
    arrValue[8][9] = "F";
    arrValue[8][10] = "E";
    arrValue[8][11] = "M";
    arrValue[8][12] = "E";
    arrValue[8][13] = "A";
    arrValue[8][14] = "I";
    arrValue[8][15] = "G";

    arrValue[9][1] = "S";
    arrValue[9][2] = "R";
    arrValue[9][3] = "E";
    arrValue[9][4] = "H";
    arrValue[9][5] = "P";
    arrValue[9][6] = "I";
    arrValue[9][7] = "C";
    arrValue[9][8] = "C";
    arrValue[9][9] = "R";
    arrValue[9][10] = "I";
    arrValue[9][11] = "T";
    arrValue[9][12] = "K";
    arrValue[9][13] = "R";
    arrValue[9][14] = "S";

    arrValue[10][1] = "M";
    arrValue[10][2] = "I";
    arrValue[10][3] = "S";
    arrValue[10][4] = "S";
    arrValue[10][5] = "I";
    arrValue[10][6] = "O";
    arrValue[10][7] = "N";
    arrValue[10][8] = "T";
    arrValue[10][9] = "E";
    arrValue[10][10] = "C";
    arrValue[10][11] = "L";
    arrValue[10][12] = "E";
    arrValue[10][13] = "T";
    arrValue[10][14] = "E";

    arrValue[11][2] = "Y";
    arrValue[11][3] = "C";
    arrValue[11][4] = "E";
    arrValue[11][5] = "R";
    arrValue[11][6] = "C";
    arrValue[11][7] = "E";
    arrValue[11][8] = "S";
    arrValue[11][9] = "E";
    arrValue[11][10] = "A";
    arrValue[11][11] = "B";
    arrValue[11][12] = "E";
    arrValue[11][13] = "D";

    arrValue[12][4] = "E";
    arrValue[12][5] = "R";
    arrValue[12][6] = "I";
    arrValue[12][7] = "W";
    arrValue[12][8] = "L";
    arrValue[12][9] = "T";
    arrValue[12][10] = "O";
    arrValue[12][11] = "L";

    arrValue[13][6] = "N";
    arrValue[13][7] = "L";
    arrValue[13][8] = "S";
    arrValue[13][9] = "D";
}
//-------------------------------------------------------------
    public static String[][] displayStatus(String[][] arrValue) {
        for(int i=0; i<arrValue.length; i++){
            for(int j=0; j<arrValue[i].length; j++){
                if(arrValue[i][j]== null){
                    System.out.print("   ");
                }else{
                    System.out.print(" "+ arrValue[i][j] + " ");
                }
            }
            System.out.println();
        }
        return arrValue;
    }
//-------------------------------------------------------------
    public static String[][] findWord(String str,String[][] arrValue) {
        int wordLength = str.length();
        int n=0;
        for(int i=0; i<arrValue.length; i++){
            for(int j=0; j<arrValue[i].length; j++){
                if(arrValue[i][j] == str.charAt(n)){
                    for (int x = i - 1; x <= i + 1; x++) {
                        for (int y = j - 1; y <= j + 1; y++) {
                            if (x >= 0 && x < arrValue.length && y >= 0 && y < arrValue[0].length) {
                                if (arrValue[i][j] == null){
                                }
                            }
                        }
                    }
                }
                continue;
            }
        }   
        // run the 2D arrValue and find the str word
        // return the 2D arrStatus with mark the str word
        return arrStatus;
    }
//-------------------------------------------------------------
    public static void main(String[] args) {
	System.out.println("\t \n ====== Welcome to the game ! ======\n");    
    displayStatus(arrValue);    
    Scanner scanner = new Scanner(System.in);
	System.out.println("\nPlease give me some word that you want me to find: \n");
	String str = scanner.toString(); //   >> given: "CRIME"
    //
    //
    findWord(str,arrValue);
    }
}
