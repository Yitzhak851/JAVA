public class Assignment435 {
    public static int printsMultiplicationTable(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print((arr[i])+ "|"+ " ");
            for (int j=0; j<arr.length; j++){
                System.out.print(" " + arr[i]*arr[j]);
            }
            System.out.println();
        }
        int num=1;
        return num;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,7,8};
        System.out.print("the array is: {");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("}");
        printsMultiplicationTable(arr);
    }
}