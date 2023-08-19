public class test {
    public static void main(String[] args) {
        String input = args[0];                     // get first word from the user into String name 'input'
        int wordCount = countWords(input);          // create int box name 'countWord' = put founction into
        System.out.println("Number of words in the string: " + wordCount);
    }
    public static int countWords(String str) {
        int count = 0;
        boolean in = false;
        for (int i=0; i<str.length(); i++) {    // i=0, o<5 || 1<5 ||... 4<5 || 5<5
            if (str.charAt(i) == ' ') {         // ' '=true ||     ||...  
                if (in) {count++; in = false;}  //          //     // 
            }else {in = true;}
        }
        if (in) {count++;} //1
        return count;
    }
}
