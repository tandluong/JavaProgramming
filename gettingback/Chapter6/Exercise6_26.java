public class Exercise6_26 {
    public static void main(String[] args) {
        // Display result
        printPalindromicPrime();
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }

    public static boolean isPalindrome(int number) {
        // Parse the integer to String for easier manipulation
        String num = "" + number;
        // beginning of the string
        int start = 0;
        // end of the string
        int end = num.length() - 1;
        // Assume palindrome is true at first
        boolean palindrome = true;
        while (start < end) {
            if (num.charAt(start) != num.charAt(end)) {
                palindrome = false;
                break;
            }
            // increment to the next char
            start++;
            // decrement to the previous last char
            end--;
        }

        return palindrome; // Number is palindrome
    }

    public static void printPalindromicPrime() {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < 100) {
            if (isPrime(number) && isPalindrome(number)) {
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
