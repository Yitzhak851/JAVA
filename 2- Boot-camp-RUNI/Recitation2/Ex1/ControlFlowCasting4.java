public class ControlFlowCasting4 {
    public static void main(String[] args) {
        int myHeigt = 176;
        int meters = myHeigt / 100;
        int centimeters = myHeigt % 100;

        System.out.println("This program convert height in centimeters to height in meters");
        System.out.println("My height is " + meters + " meters and " + centimeters + " centimeters. ");
    }
}
