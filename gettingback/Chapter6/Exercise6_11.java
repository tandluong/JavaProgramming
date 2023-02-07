public class Exercise6_11 {
    public static void main(String[] args) {
        // Call printTable to display Result
        printTable();
    }

    public static double computeCommission(double salesAmount) {
        int commission = 0;
        double commissionRate = 0.08;
        if (salesAmount >= 10000) {
            commission += 5000 * commissionRate;
            commission += 5000 * (commissionRate + 0.02);
            salesAmount -= 10000;
        }

        // The remaining sale value after the next sales will have a constant 0.12 commission rate
        commission += salesAmount * (commissionRate + 0.04);

        return commission;
    }

    public static void printTable() {
        System.out.printf("%-15s %-15s\n", "Sales Amount", "Commission");
        System.out.println("----------------------------------");

        // Print table body
        printTableBody();
    }

    public static void printTableBody() {
        int salesAmount = 10000;
        while (salesAmount <= 100000) {
            System.out.printf("%-10d %13.1f\n", salesAmount, computeCommission(salesAmount));
            salesAmount += 5000;
        }
    }
}
