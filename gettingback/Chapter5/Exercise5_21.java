import java.util.*;
public class Exercise5_21 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();

        // Create Table Header
        System.out.printf("%-18s %-18s %-18s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        // Define given interest rate
        // only one that needs to increase
        // static variables
        int months = years * 12;
        double startingInterest = 5;
        double endingInterest = 8;
        double incrementInterest = 0.125;
        double monthlyInterestRate;


        while (startingInterest <= endingInterest) {
            // variable needs to continuously update
            monthlyInterestRate = startingInterest / 1200;
            // Calculate payment
            double monthlyPayment = loanAmount * monthlyInterestRate /
                    (1 - 1 / Math.pow(1 + monthlyInterestRate, months));

            double totalPayment = monthlyPayment * months;

            System.out.printf("%.3f%% %18.2f %20.2f", startingInterest, monthlyPayment, totalPayment);
            System.out.println();

            startingInterest += incrementInterest;
        }
    }
}
