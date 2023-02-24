public class Exercise7_6 {
    public static void main(String[] args) {
        // Number of primes to display
        final int NUMBER_OF_PRIMES = 50;
        // initialize prime array
        int[] primes = new int[NUMBER_OF_PRIMES];
        // Display 10 per line
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        // Count the number of prime numbers
        int count = 0;
        // A number to be tested for primeness
        int number = 2;

        System.out.println("The first 50 prime numbers are");

        // According to the book, we first have to use an array to store the prime numbers
        // We will use the method given to use from Listing 5.15, PrimeNumber.java
        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) {
            // Assume the number is prime
            boolean isPrime = true;

            // Test whether number is prime
            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                // If true, number is not prime
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Save the prime number and increase the count
            if (isPrime) {
                primes[count] = number;
                count++;
            }

            // Check if the next number is prime
            number++;
        }

        // Once we have the array of prime numbers, we then have to use them to check
        // whether they are possible divisors for n

        // reset count and number
        count = 0;
        number = 2;
        // initialize a new array to get the verified primes
        int[] verifyPrimes = new int[NUMBER_OF_PRIMES];
        while (count < NUMBER_OF_PRIMES) {
            // Assume the number is prime
            boolean isPrime = true;

            // The condition for the number to be a prime is that
            // the prime numbers less than or equal to sqrt(n) cannot divide n evenly
            for (int i = 0; i < primes.length; i++) {
                if (primes[i] <= Math.sqrt(number) && number % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                verifyPrimes[count] = number;
                count++;
            }

            number++;
        }

        // Display result
        count = 0;
        for (int i : verifyPrimes) {
            count++;
            if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
                System.out.println(i);
            else {
                System.out.print(i + " ");
            }
        }
    }
}
