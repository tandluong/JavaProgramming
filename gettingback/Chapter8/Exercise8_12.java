import java.util.Scanner;

public class Exercise8_12 {
    public static void main(String[] args) {
        displayResult();
    }

    public static void displayResult() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.println("(0-single filer, 1-married jointly or qualifying widow(er), " +
                "2-married separately, 3-head of household)");
        System.out.print("Enter the filing status: ");
        int status = input.nextInt();
        if (status >= 0 && status < 3) {
            System.out.print("Enter the taxable income: ");
            double income = input.nextDouble();
            double tax = tax(status, income);
            System.out.println("Tax is " + (int)(tax * 100) / 100.0);
        }
        else {
            System.out.println("Invalid status");
            System.exit(1);
        }
    }

    public static double tax(int status, double income) {
        // We know the tax rates
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        // Tax rates to be applied based on specific incomes
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475},  // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        if (income <= brackets[status][0])
            return brackets[status][0] * rates[0];
        else if (income <= brackets[status][1])
            return brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1];
        else if (income <= brackets[status][2])
            return brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2];
        else if (income <= brackets[status][3])
            return brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (brackets[status][3] - brackets[status][2]) * rates[3];
        else if (income <= brackets[status][4])
            return brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (brackets[status][3] - brackets[status][2]) * rates[3] +
                    (brackets[status][4] - brackets[status][3]) * rates[4];
        else
            return brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (brackets[status][3] - brackets[status][2]) * rates[3] +
                    (brackets[status][4] - brackets[status][3]) * rates[4] +
                    (income - brackets[status][4]) * rates[5];
    }
}
