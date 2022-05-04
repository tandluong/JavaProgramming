import java.util.*;

public class ComputeLoan {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user input for annual interest rate in percentage, e.g. 7.25%
        System.out.print("Enter annual interest rate, e.g., 7.25%: ");
        double annualInterestRate = input.nextDouble();

        // Obtain the monthly interest rate
        // Convert % to decimal by diving by 100
        // Convert annual to monthly by dividing by 12
        // Monthly interest rate = annual interest rate / (100 * 12)
        double monthlyInterestRate = annualInterestRate / 1200;

        // Prompt user input for numbers of years
        System.out.print("Enter number of years as an integer, e.g., 5: ");
        byte numberOfYears = input.nextByte();

        // Prompt user input for loan amount
        System.out.print("Enter loan amount, e.g., 120000.95: ");
        int loanAmount = input.nextInt();

        // Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Calculate interest fee
        double interestFee = totalPayment - loanAmount;

        // Display result
        System.out.println("The interest fee is: $" + (int)(interestFee * 100) / 100.0);
        System.out.println("The monthly payment is: $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is: $" + (int)(totalPayment * 100) / 100.0);
    }
}
