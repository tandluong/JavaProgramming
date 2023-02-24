import java.util.Scanner;

public class Exercise6_37 {
    public static void main(String[] args) {
        // Display result
        displayResult();
    }

    public static String format(int number, int width) {
        // Get the number length, so we know how much we need to format
        int numberLength = ("" + number).length();
        // Once we know the length of number, then we can pad width to number
        String formattedNumber = "";
        for (int i = 0; i < width - numberLength; i++) {
            formattedNumber += "0";
        }

        return formattedNumber + number;
    }

    public static void displayResult() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter the number's width: ");
        int width = input.nextInt();

        // Display formatted result
        System.out.printf("The number %d with width %d is %s", number, width, format(number, width));
    }
}
