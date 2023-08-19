// >> java Assignment5 “The quick brown"
// Number of words in the string: 3

public class Assignment324 {
    public static void main(String[] args) {    //main methot >> void >> recived to the user output
            int index = 0;
            int sum = 0;
            do {                                    //        i=1           ||      i=2 
                System.out.print(args[index]);      // args[0] print: The   || args[1] print: quick
                index++;                            // args[1]              || args[2] 
                sum += index;                       // sum = 0              || sum = 1
            } while (index >= 0);                   // while >> 
            
        // get args[index] from the user >>
        //call method that counting the num from " " to " "
        //call method that print the num of words
    }
    // public static int numOfWords(int b){ }//str.charAt(i) == ‘ ‘     //create method that counting the num from " " to " "
    // public static int stringToNum (int a){ }   //method which get input String and recieved outputs (int) representing the numOfWords("hi how are you") in the given string. 
}   




