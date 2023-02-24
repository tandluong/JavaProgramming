import java.util.*;

public class SalesTax {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        // Compute tax
        double tax = purchaseAmount * 0.06;

        // Display result
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
    }
}
