import java.util.*;
public class Exercise3_18 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the weight of the package: ");
        double weight = input.nextDouble();

        // Categorize weight class based on input
        double cost = 0;
        if (weight > 0 && weight <= 1) {
            cost = 3.5;
        }
        if (weight > 1 && weight <= 3) {
            cost = 5.5;
        }
        if (weight > 3 && weight <= 10) {
            cost = 8.5;
        }
        if (weight > 10 && weight <= 20) {
            cost = 10.5;
        }
        if (weight > 20 && weight < 50) {
            cost = 10.5;
        }

        if (weight < 50) {
              System.out.println("The weight of the package is " + weight + " lbs. The shipping cost is $" + cost);
        }
        else
            System.out.println("The weight of the package is " + weight + " lbs. The package cannot be shipped");

    }
}
