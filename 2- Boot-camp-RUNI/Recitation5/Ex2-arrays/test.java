public class test {
    public static int[] getDigits(int input) {      // getDigits(754368) returns [8,6,3,4,5,7]
        int length=0;
        for(int i=1; i<=input; i*=10){
            length++;
        }
        int[] arr = new int[length];
        for(int i=0; i<input; i++){
            for(int j=length; j>=1; j++){
                int multi = (j-1);
                int number = 1;
                for(int k = multi; k>1; k--){
                    number *= 10;
                }
                arr[i] = input/number;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);  //get 1234
        int[] arrays = getDigits(input);        //
        for(int i=0; i<arrays.length; i++){
            System.out.println(arrays[i]);
        }
        
    }
}
