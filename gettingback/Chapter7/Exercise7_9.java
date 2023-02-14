import java.util.Scanner;

public class Exercise7_9 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize double array
        double[] numbers = new double[10];

        // Prompt user for input
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        // Display result
        System.out.print("The minimum number is: " + min(numbers));
    }

    public static double min(double[] array) {
        double min = array[0];
        for (double i : array)
            if (i < min)
                min = i;

        return min;
    }
}
