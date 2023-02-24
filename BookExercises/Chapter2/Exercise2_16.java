import java.util.*;

public class Exercise2_16 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter the side: ");
        double sideInput = input.nextDouble();

        // calculate the area based on user input
        double hexagonArea = (3 * Math.pow(3, 0.5) * Math.pow(sideInput, 2)) / 2;

        // Display result
        System.out.println("The area of the hexagon is " + Math.round(hexagonArea * 10000) / 10000.0);
    }
}
