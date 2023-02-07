import java.util.Scanner;

public class Exercise6_5 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        // Call the displaySortedNumbers method
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // Compare the three numbers in order to sort them
        double smallest = min(num1, num2, num3);
        double largest = max(num1, num2, num3);
        double middle = mid(num1, num2, num3);
        // Another way to find the middle without have to create another method
//        double middle = num1 + num2 + num3 - smallest - largest;

        System.out.println(num1 + ", " + num2 + ", " + num3 + ", sorted is " +
                smallest + ", " + middle + ", " + largest);
    }

    public static double min(double num1, double num2) {
        if (num1 < num2)
            return num1;
        else
            return num2;
    }

    public static double min(double num1, double num2, double num3) {
        return min(min(num1, num2), num3);
    }

    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }

    public static double mid(double num1, double num2, double num3) {
        // This method technically sorts all 3 numbers
        double mid;
        if (num1 > num2) {
            mid = num2;
            num2 = num1;
            num1 = mid;
            // num1 is less than num2
        }
        if (num2 > num3) {
            mid = num3;
            num3 = num2;
            num2 = mid;
            // num2 is less than num3
        }
        if (num1 > num2) {
            mid = num2;
            num2 = num1;
            num1 = mid;
            // num1 is less than num2
        }

        // num1 < num2 < num3
        return num2;
    }
}
