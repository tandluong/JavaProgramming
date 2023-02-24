import java.util.Scanner;

public class Exercise7_2 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize array of integers with 10 length
        int[] numbers = new int[10];

        // Prompt user for input
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        // Display the array in reverse order
        System.out.println("The ten numbers reversed are: ");
        for (int j = numbers.length - 1; j >= 0; j--)
            System.out.print(numbers[j] + " ");
    }
}
