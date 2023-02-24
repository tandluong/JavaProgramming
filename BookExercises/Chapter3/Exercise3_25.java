import java.util.*;
public class Exercise3_25 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Calculate the intersecting point of the two lines
        double valueX1 = y1 - y2;
        double valueY1 = - (x1 - x2);
        double result1 = ((y1 - y2) * x1) - ((x1 - x2) * y1);
        double valueX2 = y3 - y4;
        double valueY2 = - (x3 - x4);
        double result2 = ((y3 - y4) * x3) - ((x3 - x4) * y3);

        // find the determinant
        double validSolution = (valueX1 * valueY2) - (valueY1 * valueX2);

        // Find the value of the point of intersection
        double resultX = ((result1 * valueY2) - (valueY1 * result2)) / validSolution;
        double resultY = ((valueX1 * result2) - (result1 * valueX2)) / validSolution;

        if (validSolution != 0)
            System.out.println("The intersecting point is at (" + (Math.round(resultX * 100000.0) / 100000.0) +
                    ", " + Math.round(resultY * 100000.0) / 100000.0 + ")");
        else
            System.out.println("The two lines are parallel");
    }
}
