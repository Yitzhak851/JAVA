import java.util.Scanner;

public class TimeConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        double seconds = scanner.nextDouble();
        
        int hours = (int) (seconds / 3600);
        int minutes = (int) ((seconds % 3600) / 60);
        int secs = (int) (seconds % 60);
        
        int milliseconds = (int) ((seconds * 1000) % 1000);
        
        System.out.println("Time in HH:mm:ss format: " + formatTime(hours, minutes, secs));
        System.out.println("Time in HH:mm:ss:uuu format: " + formatTimeWithMilliseconds(hours, minutes, secs, milliseconds));
        
        scanner.close();
    }
    
    public static String formatTime(int hours, int minutes, int seconds) {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    
    public static String formatTimeWithMilliseconds(int hours, int minutes, int seconds, int milliseconds) {
        return String.format("%02d:%02d:%02d:%03d", hours, minutes, seconds, milliseconds);
    }
}