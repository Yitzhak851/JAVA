import java.util.Scanner;

public class AreaOfCircleCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Radius of the circle: ");
        double num1 = scanner.nextDouble();
        // Calculate the Area
        double area = Math.PI * Math.pow(num1, 2);
        System.out.println("The Area of the circle is: " + area);

        scanner.close();
    }
}
