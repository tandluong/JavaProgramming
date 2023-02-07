import java.util.Scanner;

public class Exercise6_36 {
    public static void main(String[] args) {
        // Display result
        displayResult();
    }

    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    public static void displayResult() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of sides: ");
        int sides = input.nextInt();
        System.out.print("Enter the side length: ");
        double sideLength = input.nextDouble();

        // Display area
        System.out.print("The area of the polygon is " + area(sides, sideLength));
    }
}
