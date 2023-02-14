import java.util.Scanner;

public class Exercise7_30 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of values: ");
        int number = input.nextInt();

        // initialize int array
        int[] values = new int[number];

        // Prompt user for input
        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++)
            values[i] = input.nextInt();

        // Display result
        if (isConsecutiveFour(values))
            System.out.print("The list has consecutive fours");
        else
            System.out.print("The list has no consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values) {
        // We want to find if there are 4 consecutive numbers in the list
        // How would we approach this?

        // We will use a nested loop
        // The outer loop will be the number to find; initialize count to be 1
        // The inner loop will check the next number,
        // if the number is the same, then increase count by 1
        // else we can break out of the loop and reset the variables
        // if count == 4, then we can return true
        // else it will default to false

        for (int i = 0; i < values.length; i++) {
            int currentNum = values[i];
            int count = 1;
            for (int j = i + 1; j < values.length; j++) {
                if (currentNum == values[j])
                    count++;
                else
                    break;

                if (count == 4)
                    return true;
            }
        }

        return false;
    }
}
