import java.util.Scanner;

public class AreaOfCircleCalculate {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Radius of the circle: ");
        double num1 = scanner.nextDouble();

        System.out.print("The Area of the circle is: ");

        // Calculate the Area
	double area = Math.PI * Math.pow(num1, 2);
        System.out.println("The average of the three numbers is: " + area);

        scanner.close();
    }
}
