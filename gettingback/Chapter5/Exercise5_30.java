import java.util.*;
public class Exercise5_30 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double interest = input.nextDouble();
        System.out.print("Enter the number of months: ");
        int month = input.nextInt();

        // Declare known variables
        final double MONTHLY_INTEREST_RATE = interest / 1200;
        final double MONTHLY_SAVINGS = 1 + MONTHLY_INTEREST_RATE;

        // starting value
        double sum = 0;
        for (int i = 1; i <= month; i++) {
            sum = (amount + sum) * MONTHLY_SAVINGS;
        }

        // Display Result
        System.out.printf("After %d months, the value of the account is %.3f\n", month, sum);
    }
}
