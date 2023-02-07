public class Exercise6_27 {
    public static void main(String[] args) {
        // Display result
        printEmirp();
    }

    public static boolean normalPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }

    public static boolean reversePrime(int number) {
        // Parse number into string for easier manipulation
        String num = "" + number;
        String finalNumber = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            finalNumber = finalNumber + num.charAt(i);
        }

        return normalPrime(Integer.parseInt(finalNumber));
    }

    public static void printEmirp() {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < 100) {
            if (normalPrime(number) && reversePrime(number) && !Exercise6_26.isPalindrome(number)) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }

            number++;
        }
    }
}
