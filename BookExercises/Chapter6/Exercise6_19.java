import java.util.Scanner;

public class Exercise6_19 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the three sides for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Call displayResult to display result
        displayResult(side1, side2, side3);
    }

    public static boolean isValid(double side1, double side2, double side3) {
        boolean checkSide1 = side2 + side3 > side1;
        boolean checkSide2 = side1 + side3 > side2;
        boolean checkSide3 = side1 + side2 > side3;

        // If all three conditions are met, then the triangle is valid
        return checkSide1 && checkSide2 && checkSide3;
    }

    public static double area(double side1, double side2, double side3) {
        double semiPerimeter = (side1 + side2 + side3) / 2;

        // Calculate the triangle area
        double triangleArea = Math.sqrt(semiPerimeter * (semiPerimeter - side1) *
                (semiPerimeter - side2) * (semiPerimeter - side3));

        return isValid(side1, side2, side3) ? triangleArea : 0;
    }

    public static void displayResult(double side1, double side2, double side3) {
        double area = area(side1, side2, side3);
        if (area != 0)
            System.out.println("The area of the triangle with sides " + side1 + " " +
                    side2 + " " + side3 + " is " + (int)(area * 100) / 100.0);
        else
            System.out.println("Invalid input");

    }
}
