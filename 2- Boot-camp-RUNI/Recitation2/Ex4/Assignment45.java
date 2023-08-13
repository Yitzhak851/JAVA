

public class Assignment45 {

    public static void main(String[] args) {
        int numMin = 2;
        int numMax = 7;
        int sum1 = 0;

        if (((numMax < 0) || (numMin < 0)) || (numMax < numMin)) {
            System.out.println("Please insert minNum and maxNum positive number && numMax must be larger than numMin");
        } else {

            for (int i = numMin; i <= numMax; i++) {
                
                while ((i % 3) == 0) {
                    System.out.println("" + i  );
                    i++;
                }
            }
        }
    }
}
