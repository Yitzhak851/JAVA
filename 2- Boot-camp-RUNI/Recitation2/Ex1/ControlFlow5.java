
public class ControlFlow5 {
    public static void main(String[] args) {
        // Define the start and end times
        int startHour = 8;
        int startMinute = 45;
        int endHour = 11;
        int endMinute = 15;

        // Calculate the time spent in class
        int hours = endHour - startHour;
        int minutes = endMinute + startMinute;

        // Adjust for negative minutes
        // if (minutes == 60) {
        //     hours++;
        // } else if ((minutes % 60) ) {

        // }

        // Print the result
        System.out.println("The class is " + hours + " hours and " + minutes + " minutes long.");
    }
}
