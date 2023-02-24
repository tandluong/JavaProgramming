import java.util.*;
public class Exercise3_7 {
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
        if (numberOfDollars == 1)
            System.out.print(numberOfDollars + " dollar");
        else if (numberOfDollars > 1)
            System.out.print(numberOfDollars + " dollars");
        if (numberOfQuarters == 1)
            System.out.print(" and " + numberOfQuarters + " quarter");
        else if (numberOfQuarters > 1)
            System.out.print(" and " + numberOfQuarters + " quarters");
        if (numberOfDimes == 1)
            System.out.print(" and " + numberOfDimes + " dime");
        else if (numberOfDimes > 1)
            System.out.print(" and " + numberOfDimes + " dimes");
        if (numberOfNickels == 1)
            System.out.print(" and " + numberOfNickels + " nickel");
        else if (numberOfNickels > 1)
            System.out.print(" and " + numberOfNickels + " nickels");
        if (numberOfPennies == 1)
            System.out.print(" and " + numberOfPennies + " penny");
        else if (numberOfPennies > 1)
            System.out.print(" and " + numberOfPennies + " pennies");
    }
}
