import java.util.*;

public class Exercise2_8 {
    public static void main(String[] args) {
        // Create object Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter the time zone offset to GMT: ");
        long timeZoneOffset = input.nextLong();

        // Obtain the milliseconds
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the seconds from milliseconds
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the minute from seconds
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the hour from the minutes
        long totalHour = totalMinutes / 60;

        // Compute time zone offset
        long currentTimeForUser = totalHour + timeZoneOffset;

        // Compute the current hour
        long currentHour = currentTimeForUser % 24;


        // Display result
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
