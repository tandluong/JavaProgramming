import java.util.*;

public class Exercise2_4 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare the constant for pounds to kilograms
        final double POUNDS_TO_KILOGRAMS = 0.454;

        // Prompt user for input
        System.out.print("Enter a number in pounds: ");
        double poundsInput = input.nextDouble();

        // Compute conversion from pounds to kilogram
        double kilogram = poundsInput * POUNDS_TO_KILOGRAMS;

        // Display Result
        System.out.println(poundsInput + " pounds is " + (int)(kilogram * 1000) / 1000.0 + " kilograms");
    }
}
