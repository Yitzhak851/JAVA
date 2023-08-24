public class Test {
        public static int countWords(String sentence) {
        int count = 0; // Initialize count as 1 since the last word won't have a space after it
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        return count;   
    }
        public static void main(String[] args) {
        String sentence = args[0];      //get "hi you" (6-length)
        System.out.println("Number of words in the string: " + countWords(sentence));
    }
}

