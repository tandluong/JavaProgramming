import java.util.Scanner;

public class Exercise7_8 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // initialize double array
        double[] numbers = new double[10];

        // Prompt user for input
        System.out.print("Enter ten double values: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        // Display result
        System.out.println("The average is " + average(numbers));
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i : array)
            sum += i;

        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double i : array)
            sum += i;

        return sum / array.length;
    }
}
