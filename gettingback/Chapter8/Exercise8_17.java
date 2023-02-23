import java.util.Scanner;

public class Exercise8_17 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Determine how many banks and the safe limit
        int bankCount = input.nextInt();
        int limit = input.nextInt();

        // Initialize arrays based on bankCount
        double[] bankBalances = new double[bankCount];
        double[][] borrowers = new double[bankCount][bankCount];
        boolean[] unsafe = new boolean[bankCount];

        // Get bank balances and borrows from input
        for (int i = 0; i < bankCount; i++) {
            bankBalances[i] = input.nextDouble();
            int borrowerCount = input.nextInt();
            for (int j = 0; j < borrowerCount; j++) {
                int borrowerID = input.nextInt();
                borrowers[i][borrowerID] = input.nextDouble();
            }
        }

        // determine unsafe banks
        boolean hasChange;
        do {
            // assume there has been no changes
            hasChange = false;
            for (int i = 0; i < bankCount; i++) {
                // Get the bank's balance
                double assets = bankBalances[i];
                for (int j = 0; j < bankCount; j++) {
                    // add all the money borrowed from other banks
                    assets += borrowers[i][j];
                }
                // if total asset is less than the limit
                if (assets < limit) {
                    // then the bank is unsafe
                    unsafe[i] = true;
                    for (int j = 0; j < bankCount; j++) {
                        // Go into the loaners' value and set it to 0
                        // because the loaner will not be getting their money back
                        if (borrowers[j][i] != 0) {
                            borrowers[j][i] = 0;
                            // exit the loop
                            hasChange = true;
                        }
                    }
                }
            }
        } while (hasChange);

        // Display result
        System.out.print("Unsafe banks are ");
        for (int i = bankCount - 1; i > 0; i--) {
            if (unsafe[i]) System.out.print(i + " ");
        }
    }
}
