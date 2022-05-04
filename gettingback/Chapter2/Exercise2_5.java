import java.util.*;

public class Exercise2_5 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        // Compute gratuity and total price
        double gratuityPercent = gratuityRate / 100;
        double gratuity = subtotal * gratuityPercent;
        double totalPrice = subtotal + gratuity;

        // Display Result
        System.out.println("The gratuity is $" + (int)(gratuity * 100) / 100.0 +
                " and total is $" + (int)(totalPrice * 100) / 100.0);
    }
}
