import java.util.*;
public class Exercise4_26 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an amount: ");
        String amount = input.next();

        boolean checkAmount = amount.contains(".") && !amount.startsWith(".");
        String dollars = "0";
        String change = "0";

        if (checkAmount) {
            // Get the dollar and change amount by using getting the first substring
            dollars = amount.substring(0, amount.indexOf('.'));
            change = amount.substring(amount.indexOf('.') + 1);
        }
        else {
            System.out.println("Please enter a value in dollars and/or change, e.g., 11.56");
            System.exit(1);
        }

        // Convert the Strings to Integer
        int dollarValue = Integer.parseInt(dollars);
        int changeValue = Integer.parseInt(change);

        // We don't need to extract the dollar amount
        // We need to extract the amount of change to each coin
        int numberOfQuarters = changeValue / 25;
        changeValue %= 25;
        int numberOfDimes = changeValue / 10;
        changeValue %= 10;
        int numberOfNickels = changeValue / 5;
        changeValue %= 5;
        int numberOfPennies = changeValue;

        String checkPenny = switch (numberOfPennies) {
            case 2,3,4: yield "pennies";
            default: yield "penny";
        };

        // Display Result
        System.out.printf("""
                Your amount $%s consist of:
                %d dollar(s)
                %d quarter(s)
                %d dime(s)
                %d nickel(s)
                %d %s
                """, amount, dollarValue, numberOfQuarters, numberOfDimes,
                numberOfNickels, numberOfPennies, checkPenny);
    }
}
