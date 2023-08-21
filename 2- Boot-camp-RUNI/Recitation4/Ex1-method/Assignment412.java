// Write a program that greets the user according to the current time of day.
// The main() method receives two arguments via the command-line: (1) the name of the user
// and (2) the current hour of the day, in 24 hour format (e.g., 18 means 18:00)
// The method should print out a corresponding greeting. The printing should be done in a
// single separate method (i.e., not in main).
// The greetings are:
// • 06:00-11:00 – “good morning”
// • 12:00-16:00 – “good afternoon”
// • 17:00-20:00 – “good evening”
// • 21:00-05:00 – “good night”
// Hint: the method might be void greet(String name, int hourOfDay).
// Notes:
// (1) In your main, check that exactly two arguments are given. If not, print the statement
// "Please enter your name and the current hour"
// (2) If the hour given is < 0 or > 24, print the statement “There is no such time, [name]” where
// name is the name given by the user.
// Running examples:
// run AssignmentTwo Daniel 8
// Good Morning, Daniel!
// run AssignmentTwo Bilbo 42
// There is no such time, Bilbo!

public class Assignment412 {
    public static void main(String[] args) {
        String str = args[0];
        int n = Integer.parseInt(args[1]);

    }

}
