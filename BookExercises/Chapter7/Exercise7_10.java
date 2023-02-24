import java.util.Scanner;
public class Exercise7_10 {
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
        System.out.print("The index of the minimum number is: " + indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array) {
        if (array.length >= 1) {
            int indexOfMin = 0;
            double min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    indexOfMin = i;
                }
            }

            return indexOfMin;
        }
        else
            return -1;
    }
}
