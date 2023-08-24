public class Assignment324 {
    public static int countWords(String str) {
        int count = 0;                       
        boolean insideWord = false;         
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == ' '){     
                if (insideWord) {       
                    count++;        
                    insideWord = false;
                }
            }else{
                insideWord = true;
            }  
        }
        if (insideWord) {
            count++;
        }
        return count;
    }
        public static void main(String[] args) {
        String input = args[0];                     // get ("hello")  from the user into String name 'input'
        int wordCount = countWords(input);          // create int box name 'countWord' = founction count words
        System.out.println("Number of words in the string: " + wordCount);
    }
}   
