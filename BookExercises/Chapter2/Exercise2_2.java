import java.util.*;

public class Exercise2_2 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create a final constant for PI
        final double PI = Math.PI;

        // Prompt user for input
        System.out.print("Enter the radius and length of a cylinder: ");
        double radiusInput = input.nextDouble();
        double lengthInput = input.nextDouble();

        // Compute for area and volume
        double area = radiusInput * radiusInput * PI;
        double volume = area * lengthInput;

        // Display result
        System.out.println("The area is: " + (int)(area * 10000) / 10000.0);
        System.out.println("The volume is: " + (int)(volume * 10) / 10.0);
    }
}
