public class PrimeNumber {
    public static void main(String[] args) {
        // Number of primes to display
        final int NUMBER_OF_PRIMES = 50;
        // Display 10 per line
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        // Count the number of prime numbers
        int count = 0;
        // A number to be tested for primeness
        int number = 2;

        System.out.println("The first 50 prime numbers are");

        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) {
            // Assume the number is prime
            boolean isPrime = true;

            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                // If true, number is not prime
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Display the prime number and increase the count
            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Display the number and advance to the new line
                    System.out.println(number);
                } else
                    System.out.print(number + " ");
            }

            // Check if the next number is prime
            number++;
        }
    }
}
