import java.util.*;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        // Display result
        System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
    }
}
