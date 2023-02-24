import java.util.Scanner;

public class Exercise6_39 {
    public static void main(String[] args) {
        // Display result
        displayResult();
    }

    /** Return true if point (x2, y2) is on the left side of the
     *  directed line from (x0, y0) to (x1, y1) */
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double determinant = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return determinant > 0;
    }

    /** Return true if point (x2, y2) is on the right side of the
     *  directed line from (x0, y0) to (x1, y1) */
    public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double determinant = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return determinant < 0;
    }

    /** Return true if point (x2, y2) is on the same
     *  line from (x0, y0) to (x1, y1) */
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double determinant = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return determinant == 0;
    }

    /** Return true if point (x2, y2) is on the
     *  line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        double dotProduct01 = (x0 * x1) + (y0 * y1);
        double dotProduct02 = (x0 * x2) + (y0 * y2);
        return 0 < dotProduct02 && dotProduct02 < dotProduct01;
    }

    public static void displayResult() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble(), y0 = input.nextDouble(),
                x1 = input.nextDouble(), y1 = input.nextDouble(),
                x2 = input.nextDouble(), y2 = input.nextDouble();

        // Display line segment result
        if (leftOfTheLine(x0, y0, x1, y1, x2, y2))
            System.out.println("(" + x2 + ", " + y2 + ") is on the left side of the line from " +
                    "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        if (rightOfTheLine(x0, y0, x1, y1, x2, y2))
            System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from " +
                    "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        if (onTheLineSegment(x0, y0, x1, y1, x2, y2))
            System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from " +
                    "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        else if (onTheSameLine(x0, y0, x1, y1, x2, y2))
            System.out.println("(" + x2 + ", " + y2 + ") is on the same line from " +
                    "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
    }
}
