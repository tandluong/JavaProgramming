import java.util.*;
public class Exercise3_33 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        // Determine the price per weight and compare which one is better
        double cost1 = weight1 / price1;
        double cost2 = weight2 / price2;

        final double EPSILON = 1E-14;

        // Display Result
        if (cost1 > cost2)
            System.out.println("Package 1 has a better price.");
        if (cost1 < cost2)
            System.out.println("Package 2 has a better price.");
        // Cannot compare double value due to their floating point; use EPSILON
        if (Math.abs(cost1 - cost2) < EPSILON)
            System.out.println("Two packages have the same price.");
    }
}
