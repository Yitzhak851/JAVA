

public class Assignment32 {
    public static void main(String[] args) {
        String argument1 = args[0];
        String argument2 = args[1];
        boolean areEqual = argument1.equals(argument2);

        // Will print ‘true’ if argument1 equals argument2, ‘false’ otherwise
        if (areEqual == true) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}
