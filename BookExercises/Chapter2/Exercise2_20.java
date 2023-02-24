import java.util.*;
public class Exercise2_20 {
    public static void main(String[] args) {
        // create Scanner Object
        Scanner input = new Scanner(System.in);
        // prompt user for input
        System.out.print("Enter the balance and interest rate (e. g., 3 for 3%): ");
        double userBalance = input.nextDouble();
        double userAnnualInterestRate = input.nextDouble();

        // calculate the interest rate with the given input
        double interest = userBalance * (userAnnualInterestRate / 1200);

        // Display Results
        System.out.println("The interest is " + Math.round(interest * 100000) / 100000.0);
    }
}
