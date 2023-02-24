public class Exercise5_18 {
    public static void main(String[] args) {
        // Create Header
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Pattern A", "Pattern B", "Pattern C", "Pattern D");

        // initialize the outer loop
        int n = 6;
        for (int i = 1; i <= n; i++) {
            // Create Pattern A
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-2d", j);
            }

            // Pad the distance between each Pattern
            switch (i) {
                case 1 -> System.out.printf("%19s", "");
                case 2 -> System.out.printf("%17s", "");
                case 3 -> System.out.printf("%15s", "");
                case 4 -> System.out.printf("%13s", "");
                case 5 -> System.out.printf("%11s", "");
                case 6 -> System.out.printf("%9s", "");
            }

            // Create Pattern B
            // We use (n - i) + 1 because i start at 1
            for (int k = 1; k <= (n - i) + 1; k++) {
                System.out.printf("%-2d", k);
            }

            // Pad the distance between each Pattern
            switch (i) {
                case 1 -> System.out.printf("%7s", "");
                case 2 -> System.out.printf("%9s", "");
                case 3 -> System.out.printf("%11s", "");
                case 4 -> System.out.printf("%13s", "");
                case 5 -> System.out.printf("%15s", "");
                case 6 -> System.out.printf("%17s", "");
            }

            // Create Pattern C
            // This loop creates a triangle that pushes from top to bottom
            // At i = 1, push n times; at i = 2, push n - i times
            for (int l = i; l <= n; l++) {
                System.out.print("  ");
            }
            // Without the first loop, the result is the same as pattern A
            for (int m = 0; m <= i - 1 ; m++) {
                System.out.printf("%-2d", i - m);
            }

            // Pad the distance between each Pattern
            switch (i) {
                case 1 -> System.out.printf("%8s", "");
                case 2 -> System.out.printf("%9s", "");
                case 3 -> System.out.printf("%10s", "");
                case 4 -> System.out.printf("%11s", "");
                case 5 -> System.out.printf("%12s", "");
                case 6 -> System.out.printf("%13s", "");
            }

            // Create Pattern D
            // This loop creates a triangle that pushes from top to bottom
            // At i = 1, there is 1 push; at i = 2, there are 2 pushes, ...
            for (int o = 1; o <= i; o++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= (n - i) + 1; p++) {
                System.out.printf("%-2d", p);
            }

            // Create a new line after each loop iteration
            System.out.println();
        }
    }
}
