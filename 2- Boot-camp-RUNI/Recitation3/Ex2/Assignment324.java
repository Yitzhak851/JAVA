public class Assignment324 {
    public static void main(String[] args) {
        String input = args[0];                     // get ("hello")  from the user into String name 'input'
        int wordCount = countWords(input);          // create int box name 'countWord' = founction count words
        System.out.println("Number of words in the string: " + wordCount);
    }
    public static int countWords(String str) {
        int count = 0;                          //count=num of words
        boolean insideWord = false;              //
        for (int i=0; i<str.length(); i++) {    // i=0, o<9 || 1<9 ||... 6<9                 || 9<9
            if (str.charAt(i) == ' '){          //     true ||true ||...if==true >>          || 
                if (insideWord) {                //          ||     ||
                    count++;                    //          ||     ||
                    insideWord = false;          //          ||     ||
                }                               //          ||     ||...if==true >> count==1 || 
            }else{                              //          ||     ||
                insideWord = true;               //          ||     ||
            }                                   //          ||     ||
        }

        if (insideWord) {                        //          ||     ||
            count++;                            //          ||     ||
        }                                       //          ||     || count==2
        return count;
    }
}   
// str.length: "hello_you"
//              123456789