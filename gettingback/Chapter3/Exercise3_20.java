import java.util.*;
public class Exercise3_20 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter the temperature in Fahrenheit: ");
        double userTemperature = input.nextDouble();
        System.out.print("Enter the wind speed in miles per hour: ");
        double userWindSpeed = input.nextDouble();

        // Check if user input is valid
        boolean validTemperature = false;
        boolean validWindSpeed = false;
        if (userTemperature >= -58 && userTemperature <= 41) {
            validTemperature = true;
        }
        if (userWindSpeed >= 2) {
            validWindSpeed = true;
        }

        // Display Result if user input is valid
        if (validTemperature && validWindSpeed) {
            // calculate the wind-chill temperature
            double finalTemperature = 35.74 + (0.6215 * userTemperature) - (35.75 * Math.pow(userWindSpeed, 0.16)) +
                    (0.4275 * userTemperature * Math.pow(userWindSpeed, 0.16));

            System.out.println("The wind chill index is " + Math.round(finalTemperature * 100000) / 100000.0);
        }
        // If user input is invalid, then let user know the reason
        if (!validTemperature)
            System.out.println("The inputted temperature " + userTemperature + " is invalid. Must be between -58F and 41F");
        if (!validWindSpeed)
            System.out.println("The inputted wind speed " + userWindSpeed + " is invalid. Must be greater than 2");
    }
}
