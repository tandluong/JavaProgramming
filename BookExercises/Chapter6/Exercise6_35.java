import java.util.Scanner;

public class Exercise6_35 {
    public static void main(String[] args) {
        // Display result
        displayResult();
    }

    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }

    public static void displayResult() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Display result
        System.out.println("The area of the pentagon is " + area(side));
    }
}
