public class Assignment334 {
    public static void main(String[] args) {
        String input = args[0]; // "racecar"
        if (palindromeTest(input) == true) {
            System.out.println("String " + input + " is a palindrome");
        } else {
            System.out.println("String " + input + " is a not palindrome");
        }
    }

    public static boolean palindromeTest(String str) {
        boolean palindromeWord=true;
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length(); j > 0; j--) {
                if (str.charAt(i) == str.charAt(j)){
                    palindromeWord=true;
                    i++;
                }else{
                    palindromeWord=false;
                }
            }
            if(palindromeWord==false){
                i=str.length();
            }else{
                palindromeWord=true;
            }
        }
        return palindromeWord;
    } 
}