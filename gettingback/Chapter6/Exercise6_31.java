import java.util.Scanner;

public class Exercise6_31 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        // Display result
        if (isValid(sumOfEvenAndOddPlace(number)))
            System.out.printf("%d is valid", number);
        else
            System.out.printf("%d is invalid", number);
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        return number % 10 == 0;
    }

    public static int sumOfEvenAndOddPlace(long number) {
        return sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        // By using number % 10, we are getting the last digit
        // However, we only want the even places
        // Therefore, the counter will determine when we will add to sum
        int count = 1;
        while (number > 0) {
            count++;
            if (count % 2 == 1)
                sum += getDigit((int) ((number % 10) * 2));

            number /= 10;
        }

        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number) {
        // We know number is a single digit, if it is between 0 and 9
        if (number < 10 && number >= 0) {
            return number;
        }
        else {
            int digit2 = number % 10;
            int digit1 = number / 10;
            return digit1 + digit2;
        }
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        // We are finding the sum of the original numbers right to left
        // We can divide number by 100 to find its odd places
        while (number > 0) {
            sum += number % 10;
            number /= 100;
        }

        return sum;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        // We will parse both numbers into string
        String numberString = "" + number;
        String dString = "" + d;
        String prefixNumber = "";
        for (int i = 0; i < dString.length() && i < numberString.length() - 1; i++) {
            // Extract number from base on the length of d
            prefixNumber += numberString.charAt(i);
        }

        return Integer.parseInt(prefixNumber) == d;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        // Concat d to a string and get its length
        return (""+d).length();
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        // Parse number into a string
        String oldNumber = "" + number;
        // Create a new string to get the new number
        String newNumber = "";
        if (oldNumber.length() < k) {
            return number;
        }
        else {
            for (int i = 0; i < k; i++) {
                newNumber += oldNumber.charAt(i);
            }
        }

        return Long.parseLong(newNumber);
    }
}
