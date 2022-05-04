import java.util.*;

public class Exercise2_9 {
    public static void main(String[] args) {
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter v0, v1, and t: ");
        double v0Input = input.nextDouble();
        double v1Input = input.nextDouble();
        double timeInput = input.nextDouble();

        // Compute the formula
        double averageAcceleration = (v1Input - v0Input) / timeInput;

        // Display result
        System.out.println("The average acceleration is: " + (int)Math.round(averageAcceleration * 10000) / 10000.0);
    }
}
