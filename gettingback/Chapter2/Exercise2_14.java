import java.util.*;

public class Exercise2_14 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter weight in pounds: ");
        double userWeight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double userHeight = input.nextDouble();

        // define the given constants
        double poundToKg = 0.45359237;
        double inchToMeter = 0.0254;

        // convert the user input to correct units of measure
        double weightInKg = userWeight * poundToKg;
        double heightInMeter = userHeight * inchToMeter;

        // calculate BMI
        double resultBMI = weightInKg / (heightInMeter * heightInMeter);

       // Display Result
       System.out.println("BMI is " + Math.round(resultBMI * 10000) / 10000.0);
    }
}
