import java.util.Scanner;

public class Exercise6_4 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Call the reverse method to display result
        reverse(number);

        // Use method from Exercise6_3
        System.out.printf("\nThe reverse of %d is %d", number, Exercise6_3.reverse(number));
    }

    public static void reverse(int number) {
        // We can use the same method we created in Exercise6_3, but
        // We will use a different approach for this one
        // We will parse the Integer to a String and gets its length to get the count
        // We will do -1 because we don't want to count the last digit (i.e., less than 10)
        int length = (""+number).length() - 1;
        // With the length, we will know how large the number is
        int reverse = 0;
        int temp = number;
        for (int i = length; i >= 0; i--) {
            reverse += (temp % 10) * Math.pow(10, i);
            temp /= 10;
        }

        System.out.printf("The reverse of %d is %d", number, reverse);
    }
}
