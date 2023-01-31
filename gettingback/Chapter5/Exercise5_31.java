import java.util.*;
public class Exercise5_31 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualInterest = input.nextDouble();
        System.out.print("Enter the number of months: ");
        int month = input.nextInt();

        // Declare known variables
        double monthlyInterestRate = annualInterest / 1200;

        // Create Table Header
        System.out.printf("\n%s %10s\n", "Month", "CD Value");

        // initial value
        double sum = amount;
        for (int i = 1; i <= month; i++) {
            sum = sum + (sum * monthlyInterestRate);

            // Display result
            System.out.printf("%-7d %.2f\n", i, sum);
        }
    }
}
