import java.util.*;

public class Exercise2_3 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create a constant for converting feet to meters
        final double FEET_TO_METERS = 0.305;

        // Prompt user for input
        System.out.print("Enter a value in feet: ");
        double feetInput = input.nextDouble();

        // Compute conversion
        double meters = feetInput * FEET_TO_METERS;

        // Display result
        System.out.println(feetInput + " feet is " + (int)(meters * 10000) / 10000.0 + " meters");
    }
}
