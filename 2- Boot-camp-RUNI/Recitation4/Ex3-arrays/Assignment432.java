public class Assignment432 {
    public static int[] factorial(int x) { // get 5
        int[] factorialArray = new int[x+1]; // create factorialArray [5]
        System.out.println("0!= " + (factorialArray[0] = 1));
        int res=1;
        for (int i = 1; i < factorialArray.length; i++) {
            System.out.println(""+ i + "!= "+(factorialArray[i] = res));
            res *= ((i) + 1);
        }
        return factorialArray;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("The  factorials are: ");
        factorial(n);
    }
}
