
public class VariableAssignment2 {
    public static void main(String[] args) {
        // Declare variables with different data types
        String str1 = "H";
        int num1 = 3110;
        String str2 = " W";
        double num2 = 0.1;
        char char1 = 'r';
        int num3 = 1;
        String str3 = "d ";
        double num4 = 2.0;
        boolean bool1 = true;

        // Concatenate the variables into a final string
        String finalString = str1 + num1 + str2 + (num2 + num3) + char1 + num3 + str3 + num4 + " " + bool1;

        // Print the final concatenated string
        System.out.println(finalString);
    }
}
