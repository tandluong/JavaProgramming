public class Exercise6_29 {
    public static void main(String[] args) {
        // Display result
        displayResult();
    }

    public static boolean twinPrime(int num1, int num2) {
        return num2 - num1 == 2;
    }

    public static void findTwinPrime() {
        int num1 = 2;
        int num2 = 4;

        while (num1 < 1000) {
            if(Exercise6_26.isPrime(num1) && Exercise6_26.isPrime(num2) && twinPrime(num1, num2))
                System.out.printf("(%d, %d)\n", num1, num2);

            num1++;
            num2++;
        }
    }

    public static void displayResult() {
        System.out.println("The following are twin primes: ");
        findTwinPrime();
    }
}
