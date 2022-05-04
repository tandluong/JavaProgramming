import java.util.*;

public class Exercise2_1 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a degree in Celsius: ");
        double celsiusInput = input.nextDouble();

        // Compute Fahrenheit from Celsius input
        double fahrenheit = 9 / 5.0 * celsiusInput + 32;

        // Display result
        // Rounded to the hundredth
        System.out.println((int)(celsiusInput * 100) / 100.0 + " Celsius is " + (int)(fahrenheit * 100) / 100.0 + " Fahrenheit.");
    }
}
