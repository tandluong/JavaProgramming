import java.util.*;

public class Exercise2_13 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter the monthly savings amount: ");
        double userAmount = input.nextDouble();

        // calculate the monthly interest
        double monthlyInterest = 0.05/12;

        // calculate monthly savings
        double monthOne = userAmount * (1 + monthlyInterest);
        double monthTwo = (userAmount + monthOne) * (1 + monthlyInterest);
        double monthThree = (userAmount + monthTwo) * (1 + monthlyInterest);
        double monthFour = (userAmount + monthThree) * (1 + monthlyInterest);
        double monthFive = (userAmount + monthFour) * (1 + monthlyInterest);
        double monthSix = (userAmount + monthFive) * (1 + monthlyInterest);

        // Display Result
        System.out.print("After the sixth month, the account value is $" + Math.round(monthSix * 100) / 100.0);
    }
}
