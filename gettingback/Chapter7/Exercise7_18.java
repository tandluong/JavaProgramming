import java.util.Scanner;

public class Exercise7_18 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // initialize double array
        double[] numbers = new double[10];

        // Prompt user for input
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        // Display numbers before sorting
        System.out.print("Before sort: ");
        for (double n : numbers)
            System.out.print(n + " ");

        System.out.println();
        // Invoke bubble sort
        // Display numbers after sorting
        System.out.print("After sort: ");
        for (double n : bubbleSort(numbers))
            System.out.print(n + " ");

    }

    public static double[] bubbleSort(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static int[] bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
