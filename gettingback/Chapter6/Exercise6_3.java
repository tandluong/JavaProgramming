import java.util.Scanner;
public class Exercise6_3 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Display Result
        System.out.printf("Is %d a palindrome? %b", number, isPalindrome(number));
    }

    public static int reverse(int number) {
        // We want to reverse the number that is called
        // How would we approach this?
        // 456 -> 654
        // We will make a count = 0; and for every digit we extract increase it by 1
        // We will not increase count for the last digit (last digit is smaller than 10)
        int count = 0;
        int temp = number;
        while (temp > 0) {
            if (temp > 9)
                count++;
            temp /= 10;
        }
        // Then, for every count; we will multiply with 10^count, then count - 1
        // I.e., 456 extract 6, count = 1; extract 5, count = 2; extract 4, count = 2;
        // 6 * 10 * 10 = 600; 5 * 10 = 50; 4 -> 600 + 50 + 4 = 654
        int reverse = 0;
        for (int i = 10; count >= 0; count--) {
            reverse += (number % 10) * Math.pow(i, count);
            // 456 % 10 = 6 * Math.pow(10, 2) = 600, ...
            number /= 10;
            // 456 = 45.6, ...
        }

        return reverse;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
