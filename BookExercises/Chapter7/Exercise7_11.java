import java.util.Scanner;

public class Exercise7_11 {
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
        System.out.println("The mean is " + (int)(mean(numbers) * 100) / 100.0);
        System.out.println("The standard deviation is " +
                (int)(deviation(numbers) * 100000) / 100000.0);
    }

    public static double deviation(double[] x) {
        double mean = mean(x);
        // Find the difference between each number in x - mean squared
        double sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += Math.pow(x[i] - mean, 2);

        // Once we have the sum of the differences squared, we can calculate the deviation
        return Math.sqrt(sum / (x.length - 1));
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += x[i];

        return sum / x.length;
    }
}
