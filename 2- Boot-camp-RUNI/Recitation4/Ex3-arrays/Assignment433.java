public class Assignment433 {
    public static int exampleMethod(int num, int[] array) {
        boolean b=false;
        for(int i=0; i<array.length; i++){      //run {0--->n}
            if(num>array[i]){                   // if (?) num(1) > {1,2,3,...--->n}
                for(int j=i; j<array.length; j++){
                    if(array[i] + array[j] == num){
                        System.out.print( "(" + array[i] + " , " + array[j] + ")");
                        System.out.println();
                        b=true;
                    }   
                }
            }
        }
        if (b == false){
            System.out.println("No pairs!!");
        }
        return num;
    }
    public static void main(String[] args) {
        int num = 3;
        int [] array = {1,2,3,4,5,6};
        System.out.println("The num is: " +num + " ");
        System.out.print("The array is: {" );
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+",");
        }
        System.out.println("}" );
        System.out.println("This program receives 2 arguments (integer and array with nums) ");
        System.out.println("Then, the program prints all the numbers pairs whose sum equals to the num");
        exampleMethod(num, array);
    }
}