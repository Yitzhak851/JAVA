public class Assignment521 {
    public static int[] getDigits(int number) {
        int length=(int)(Math.log10(number))+1;
        int[] res = new int[length];
        int i=0;
        while(number>0){
            res[i]=number%10;
            number/=10;
            i++;
        }
        return res;
    }
    public static boolean isPalindrome(int[] arr) {
        boolean palindromeWord=true;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != arr[arr.length-(i)-(1)]){
                palindromeWord=false;
            }
        }
        return palindromeWord;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome((getDigits(Integer.parseInt(args[0])))));
    }
}


