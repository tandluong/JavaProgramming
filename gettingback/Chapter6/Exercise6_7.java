import java.util.Scanner;

public class Exercise6_7 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("The amount invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterest = input.nextDouble();

        double monthlyInterest = annualInterest / 1200;

        // Call printTable to display result
        int years = 30;
        printTable(amount, monthlyInterest, years);
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

    public static void printTable(double amount, double interest, int years) {
        System.out.printf("%-10s %s\n", "Years", "Future Value");
        for (int i = 1; i <= years; i++) {
            System.out.printf("%-10d %.2f\n", i, futureInvestmentValue(amount, interest, i));
        }
    }
}
