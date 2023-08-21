public class Assignment334 {
    public static boolean palindromeTest(String str) {
        boolean palindromeWord=true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!= str.charAt(str.length()-1-i)){
                palindromeWord=false;
            }
        }
        return palindromeWord;
    }
    public static void main(String[] args) {
        String input = args[0]; // "racecar"
        if (palindromeTest(input) == true) {
            System.out.println("String " + input + " is a palindrome");
        } else {
            System.out.println("String " + input + " is a not palindrome");
        }
    }

}