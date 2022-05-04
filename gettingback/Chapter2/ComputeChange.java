import java.util.*;

public class ComputeChange {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        // Convert double to whole number
        int remainingAmount = (int)(amount * 100);

        // Find the number of dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies
        int numberOfPennies = remainingAmount;

        // Display result
        System.out.println("Your amount: $" + amount + " consists of: ");
        System.out.println("    " + numberOfDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
    }
}
