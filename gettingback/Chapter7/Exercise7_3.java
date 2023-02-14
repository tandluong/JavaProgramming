import java.util.Scanner;

public class Exercise7_3 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize integer array
        int[] integers = new int[100];

        // Prompt user for input
        System.out.print("Enter the integers between 1 and 100: ");
        int number = input.nextInt();

        // What are we doing here?
        // We are asking the user to input integers between 1-100
        // That means if the user input a number, e.g., 5
        // We will go to index 5-1 (4) and increment the occurrence value there
        // Since the created integer array initializes all 100 positions at 0
        while (number != 0) {
            if (number > 0)
                integers[number - 1]++;

            number = input.nextInt();
        }

        // Print result
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > 0) {
                // We have to remember that array starts at 0, therefore 1 = 2;
                // Thus i + 1 will give us the correct number we're looking for
                System.out.printf("%d occurs %d time", i + 1, integers[i]);
                if (integers[i] > 1)
                    System.out.print("s\n");
                else
                    System.out.println();
            }
        }
    }
}
