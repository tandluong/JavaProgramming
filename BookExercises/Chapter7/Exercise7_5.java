import java.util.Scanner;

public class Exercise7_5 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize integer array with length 10
        int[] numbers = new int[10];

        // Prompt user for input
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            int number = input.nextInt();
            boolean exist = false;

            // Check if the number is already in the array
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == number) {
                    exist = true;
                    break;
                }
            }

            if (!exist)
                numbers[i] = number;
        }

        // Display result
        int count = 0;
        for (int number : numbers) {
            if (number > 0)
                count++;
        }
        System.out.println("The number of distinct number is " + count);
        System.out.print("The distinct numbers are: ");
        for (int number : numbers) {
            if (number > 0)
                System.out.print(number + " ");
        }
    }
}
