import java.util.Scanner;

public class Exercise7_13 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // initialize int array
        int[] numbers = new int[10];

        // Prompt user for input
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        // Display result
        System.out.print("The random number is: " + getRandom(numbers));
    }

    public static int getRandom(int... numbers) {
        // Generate a random number between 1 and 54
        int random = 1 + (int)(Math.random() * 54);
        // Once we have the random number; we will compare them
        // to the numbers passed in the argument
        for (int i = 0; i < numbers.length; i++) {
            // If the random is false, then generate a new random
            for (int j = 0; j < numbers.length; j++)
                if (numbers[j] == random)
                    random = 1 + (int) (Math.random() * 54);
        }

        return random;
    }
}
