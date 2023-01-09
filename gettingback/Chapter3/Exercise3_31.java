import java.util.*;
public class Exercise3_31 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convertType = input.nextInt();

        // Display different type of prompt based on user input
        switch (convertType) {
            case 0: System.out.print("Enter the dollar amount: "); break;
            case 1: System.out.print("Enter the RMB amount: "); break;
            default: System.out.println("Incorrect input"); System.exit(1);
        }
        double dollarAmount = input.nextDouble();

        // Determine the type of conversion with a switch
        // Convert the exchange rate with the exchange amount
        double totalValue = switch (convertType) {
            case 0: yield dollarAmount * exchangeRate;
            case 1: yield (int)Math.round((dollarAmount / exchangeRate) * 100) / 100.0;
            default: throw new IllegalArgumentException("");
        };

        // Display result
        switch (convertType) {
            case 0: System.out.println("$" + dollarAmount + " is " + totalValue + " yuan"); break;
            case 1: System.out.println(dollarAmount + " yuan is $" + totalValue);
        }
    }
}
