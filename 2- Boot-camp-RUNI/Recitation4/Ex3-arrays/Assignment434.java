public class Assignment434 {
    public static int[] fibonacciSequence(int x) {
        int [] fibonacciArray = new int[x];
        
        int previuos=0;
        int current=1;
        for(int i=0; i<x; i++){
            fibonacciArray[i]=current;
            System.out.println(fibonacciArray[i]);
            int temp=current;
            current+=previuos;
            previuos=temp;
        }
        return fibonacciArray;
    }
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        fibonacciSequence(input);
    }
}



