public class Exercise5_39 {
    public static void main(String[] args) {
        // Base salary is 5,000, therefore we only need to
        // make 25,000 from commission to reach the 30,000 goal.
        final int COMMISSION_GOAL = 25000;

        double commission = 0;
        double sales = 0;
        double commissionRate = 0.08;
        while (commission < COMMISSION_GOAL) {
            // We will reset commission to 0 until it will be greater than 25000 to leave the loop
            commission = 0;
            // If the sales is greater than 15,000,
            // then calculate the lower commissioned rates first
            double nextSales = sales;
            if (nextSales > 10000) {
                commission += 5000 * commissionRate;
                commission += 5000 * (commissionRate + 0.02);
                nextSales -= 10000;
            }

            // The remaining sale value after the next sales will have a constant 0.12 commission rate
            commission += nextSales * (commissionRate + 0.04);

            // We will increment sales by 1,000 to find the minimum sales in order to make $25,000;
            if (commission < COMMISSION_GOAL)
                sales += 1;
        }

        // Display Result
        System.out.printf("The minimum sales required to to make $30,000 is $%.2f", sales);
        System.out.printf("\nThe total commission made is $%.2f", commission);
    }
}
