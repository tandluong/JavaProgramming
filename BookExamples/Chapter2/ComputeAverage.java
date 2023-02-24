import java.util.*;

public class ComputeAverage {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter three number: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        // Compute the average
        double average = (num1 + num2 + num3) / 3;

        // Display the result
        System.out.println("The average of " + num1 + " " + num2 + " " + num3 +
                " is " + average);
    }
}
