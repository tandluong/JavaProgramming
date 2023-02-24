import java.util.*;
public class Exercise5_42 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the commission goal: ");
        final int COMMISSION_SOUGHT = input.nextInt();

        double commission = 0;
        double sales;
        double commissionRate = 0.08;

        for (sales = 0; commission < COMMISSION_SOUGHT; ) { // We will increment sales value at the bottom
            // We will reset commission to 0 until it will be greater than 25000 to leave the loop
            commission = 0;

            // Create a new variable to take sales' current value to be manipulated
            double nextSales = sales;
            // If the sales is greater than 15,000,
            // then calculate the lower commissioned rates first
            if (nextSales > 10000) {
                commission += 5000 * commissionRate;
                commission += 5000 * (commissionRate + 0.02);
                nextSales -= 10000;
            }

            // The remaining sale value after the next sales will have a constant 0.12 commission rate
            commission += nextSales * (commissionRate + 0.04);

            // We will increment sales by 1,000 to find the minimum sales in order to make $25,000;
            if (commission < COMMISSION_SOUGHT)
                sales += 1;
        }

        // Display Result
        System.out.printf("The minimum sales required to to make $%d is $%.2f", COMMISSION_SOUGHT, sales);
        System.out.printf("\nThe total commission made is $%.2f", commission);
    }
}
