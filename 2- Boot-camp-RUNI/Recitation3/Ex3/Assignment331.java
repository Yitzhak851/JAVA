public class Assignment331 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) { // i---->1000
            int sum1 = 0;
            for (int j = 1; j < i; j++) { // j--->999
                if (i % j == 0) {
                    sum1 += j;
                }
            }
            if(sum1==i){
                System.out.println(sum1);
            }
        }
    }
}
