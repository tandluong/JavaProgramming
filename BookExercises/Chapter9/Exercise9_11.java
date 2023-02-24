import java.util.Scanner;

public class Exercise9_11 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a, b, c, d, e, f: ");
        double[] numbers = new double[6];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        LinearEquation solution = new LinearEquation(numbers[0], numbers[1], numbers[2],
                numbers[3], numbers[4], numbers[5]);

        if (solution.isSolvable())
            System.out.println("x is " + solution.getX() + " and y is " + solution.getY());
        else
            System.out.println("The equation has no solution");
    }
}
