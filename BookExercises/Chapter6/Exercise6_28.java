public class Exercise6_28 {
    public static void main(String[] args) {
        // Display result
        displayResult();
    }

    public static boolean mersennePrime(int number) {
        return Exercise6_26.isPrime((int) (Math.pow(2, number) - 1));
    }

    public static void printMersennePrime() {
        int p = 2;
        while (p <= 31) {
            if (Exercise6_26.isPrime(p) && mersennePrime(p))
                System.out.printf("%-15d %.0f\n", p, Math.pow(2, p) - 1);

            p++;
        }
    }

    public static void displayResult() {
        // Print table header
        System.out.printf("%-15s 2^p-1\n", "p");
        System.out.println("----------------------");

        printMersennePrime();
    }
}
