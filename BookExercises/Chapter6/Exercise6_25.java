import java.util.Scanner;

public class Exercise6_25 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter time in milliseconds: ");
        long millis = input.nextLong();

        // Display result
        System.out.printf("%d milliseconds is %s", millis, convertMillis(millis));
    }

    public static String convertMillis(long millis) {
        // We know that a millisecond is 1000th of a second
        // Convert milliseconds to seconds
        long seconds = millis / 1000;
        // Convert seconds to minutes
        long minutes = seconds / 60;
        // Convert minutes to hours
        long hours = minutes / 60;

        // Now we have to get the current seconds and minutes
        // The hour can remain what is left of it.
        long getCurrentSecond = seconds % 60;
        long getCurrentMinute = minutes % 60;

        // return the time
        return hours + ":" + getCurrentMinute + ":" + getCurrentSecond;
    }
}
