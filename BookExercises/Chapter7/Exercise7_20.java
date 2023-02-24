import java.util.Scanner;

public class Exercise7_20 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // initialize double array
        double[] numbers = new double[10];

        // Prompt user for input
        System.out.print("Enter ten double numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        System.out.print("Before sort: ");
        for (double n : numbers)
            System.out.print(n + " ");

        // Display the result of the sort
        selectionSort(numbers);
        System.out.println();
        System.out.print("After sort: ");
        for (double n : numbers)
            System.out.print(n + " ");
    }

    public static void selectionSort(double[] list) {
        // We are doing the reverse, therefore we have to start at the end of array
        // rather than at the beginning; which the book did
        for (int i = list.length - 1; i >= 0; i--) {
            // Initialize the current value at list[i]
            double currentMax = list[i];
            int currentMaxIndex = i;

            // Find the lowest value from array.length - 1 - 1 in the list
            // and find its value and location
            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            // If the initial low and next low are not at the same location, swap them
            // else the swapping is skipped; no action needed
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
