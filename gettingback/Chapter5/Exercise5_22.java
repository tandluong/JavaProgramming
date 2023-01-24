import java.util.*;
public class Exercise5_22 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.print("Annual interest Rate: ");
        double annualInterestRate = input.nextDouble();

        // find all the needed variables to determine interest fee, monthly payments, total payment,
        // interest fees, principal fee, and future balance
        int months = years * 12;
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, months));
        double totalPayment = monthlyPayment * months;
        double interestFee;
        double principalPay;
        double lastPayment;

        // Create Table Header
        System.out.printf("\nMonthly Payment: %.2f\nTotal Payment: %.2f\n", monthlyPayment, totalPayment);
        System.out.printf("\n%s %15s %15s %15s\n", "Payment#", "Interest", "Principal", "Balance");

        // Create a loop that keeps going until the number of months are achieved and balance should be near 0
        int count = 1;
        while (count <= months) {
            // make sure to update the defined variables on top
            interestFee = loanAmount * monthlyInterestRate;
            principalPay = monthlyPayment - interestFee;
            loanAmount -= principalPay;

            // Display result
            // keep numbers in the same spacing as payment# gets bigger
            if (count < 10)
                System.out.printf("%d %19.2f %15.2f %18.2f", count, interestFee, principalPay, loanAmount);
            else if (count < 99)
                System.out.printf("%d %18.2f %15.2f %18.2f", count, interestFee, principalPay, loanAmount);
            else if (count < 999)
                System.out.printf("%d %17.2f %15.2f %18.2f", count, interestFee, principalPay, loanAmount);

            // new line after every iteration
            System.out.println();
            count++;
        }
    }
}
