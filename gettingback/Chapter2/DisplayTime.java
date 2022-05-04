import java.util.*;

public class DisplayTime {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        // Calculate minutes and remaining seconds
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        // Display result
        System.out.println(seconds + " seconds is " + minutes + " minutes and " +
                remainingSeconds + " seconds");
    }
}
