import java.util.*;
public class Exercise4_4 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();

        // Calculate the area of the hexagon
        double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));

        // Display result
        System.out.printf("The area of the hexagon is %.2f", area);
    }
}
