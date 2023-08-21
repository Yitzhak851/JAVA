public class Test {
    public static boolean isPrime(int a) {
        boolean t =true;
        for(int i=2; i<a; i++){
            if(a%i==0){
                t=false;
            }
        }
        return t;
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        if(n>=2){
            for(int i=2; i<n; i++){
                if(isPrime(i)){
                    System.out.println(i);
                }
                
            }
        }
    }
}
