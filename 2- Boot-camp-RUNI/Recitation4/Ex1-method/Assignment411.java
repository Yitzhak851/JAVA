// follows:
// The for each animal should be done in separate methods. In particular, in your main
// function, you should call one of four methods that will print the animal sounds to the screen.
// Running examples:
// >> run Assignment1 dog
// The dog goes woof
// >> run Assignment1 pikachu
// Sorry, we don't have that animal in stock.

public class Assignment411 {
    public static String cow(int a) {
        String str = "The cow goes 'moo'.";
        return str;
    }
    public static String dog(int a) {
        String str = "the dog goes 'woof'.";
        return str;
    }
    public static String sheep(int a) {
        String str = "the sheep goes 'meh'.";
        return str;
    }
    public static String crocodile(int a) {
        String str = "the crocodile is silent.";
        return str;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // get from the user 1-4
        if (n == 1) {
            System.out.println(cow(n));
        } else if (n == 2) {
            System.out.println(dog(n));
        } else if (n == 3) {
            System.out.println(sheep(n));
        } else if (n == 4) {
            System.out.println(crocodile(n));
        } else if (n < 1 || n > 4) {
            System.out.println("Sorry, we don't have that animal in stock.");
        }
    }
}
