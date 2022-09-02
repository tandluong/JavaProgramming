import java.util.*;

public class Exercise2_17 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter the temperature in Fahrenheit between -58°F and -41°F: ");
        double userTemperature = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double userWindSpeed = input.nextDouble();

        // calculate the wind-chill temperature
        double finalTemperature = 35.74 + (0.6215 * userTemperature) - (35.75 * Math.pow(userWindSpeed, 0.16)) +
                (0.4275 * userTemperature * Math.pow(userWindSpeed, 0.16));

        // Display Result
        System.out.println("The wind chill index is " + Math.round(finalTemperature * 100000) / 100000.0);
    }
}
