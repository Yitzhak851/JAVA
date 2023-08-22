
public class Ex1 {
    public static void main(String[] args) {
        String first = args[0];
        String second = args[1];

        int firstInt = Integer.parseInt(first);
        int secondInt = Integer.parseInt(second);
        int sum1 = firstInt + secondInt;

        System.out.println("first input : " + first);
        System.out.println("first input : " + second);
        System.out.println("sum1 input : " + sum1);

    }
}