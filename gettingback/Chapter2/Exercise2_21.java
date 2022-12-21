import java.util.*;
public class Exercise2_21 {
    public static void main(String[] args) {
        // create Scanner Object
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter investment amount: ");
        double userInvestmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double userAnnualInterestRate = input.nextDouble();
        System.out.print("Enter the numbers of years: ");
        int userNumberOfYears = input.nextInt();

        // Calculate future investment value
        double userMonthlyInterestRate = userAnnualInterestRate / 1200;
        double futureInvestmentValue = userInvestmentAmount * Math.pow(1 + userMonthlyInterestRate, userNumberOfYears*12);

        // Display Result
        System.out.println("Accumulated value is: $" + (int)(futureInvestmentValue * 100) / 100.0);
    }
}
