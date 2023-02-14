import java.util.Scanner;

public class Exercise7_12 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // initialize double array
        double[] numbers = new double[10];

        // Prompt user for input
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        // Display result
        reverse(numbers);
        System.out.print("The reverse of the numbers are: ");
        for (double i : numbers)
            System.out.print(i + " ");
    }

    public static double[] reverse(double[] x) {
        for (int i = 0; i < x.length / 2; i++) {
            double current = x[i];
            x[i] = x[x.length - 1 - i];
            x[x.length - 1 - i] = current;
        }
        return x;
    }
}
