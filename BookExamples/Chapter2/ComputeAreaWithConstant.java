import java.util.*;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        // Declare a constant
        final double PI = 3.14159;

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute Area
        double area = radius * radius * PI;

        // Display Result
        System.out.println("The area for the circle of radius " + radius +
                " is " + area);
    }
}
