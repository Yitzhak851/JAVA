
public class Assignment44 {
    public static void main(String[] args) {
        int numMin = 3;
        int numMax = 5;
        int sum1 = 0;

        if (((numMax < 0) || (numMin < 0)) || (numMax < numMin)) {
            System.out.println("Please insert minNum and maxNum positive number && numMax must be larger than numMin");
        } else {

            for (int i = numMin; i <= numMax; i++) {
                sum1 += i;
            }
            System.out.println("" + sum1);

        }
    }
}

