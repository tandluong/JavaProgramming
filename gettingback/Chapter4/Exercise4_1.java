import java.util.*;
public class Exercise4_1 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();

        // Compute the area of a pentagon with the given length
        double s = 2 * length * Math.sin(Math.PI / 5);
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

        // Display result
        System.out.printf("The area of the pentagon is %.2f", area);
    }
}
