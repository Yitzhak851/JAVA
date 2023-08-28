public class test {
    public static int[] getDigits(int number) {      // getDigits(754368) returns [8,6,3,4,5,7]
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
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);  //get 1234
        int[] arr = getDigits(number);        // use method getDigits to conver number to aray
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        
    }
}
