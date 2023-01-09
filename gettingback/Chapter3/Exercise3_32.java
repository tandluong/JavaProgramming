import java.util.*;
public class Exercise3_32 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter three points for p0, p1, and p2: ");
        double p01 = input.nextDouble();
        double p02 = input.nextDouble();
        double p11 = input.nextDouble();
        double p12 = input.nextDouble();
        double p21 = input.nextDouble();
        double p22 = input.nextDouble();

        // Determine whether p2 is on the left side, the same, or the right side of the line
        double determinant = (p11 - p01) * (p22 - p02) - (p21 - p01) * (p12 - p02);
        boolean leftSide = determinant > 0;
        boolean sameLine = determinant == 0;
        boolean rightSide = determinant < 0;

        // Display result base on booleans
        if (leftSide)
            System.out.println("(" + p21 + ", " + p22 + ") is on the left side of the line from (" + p01 + ", " + p02 + ") to (" + p11 + ", " + p12 + ")");
        if (sameLine)
            System.out.println("(" + p21 + ", " + p22 + ") is on the same line from (" + p01 + ", " + p02 + ") to (" + p11 + ", " + p12 + ")");
        if (rightSide)
            System.out.println("(" + p21 + ", " + p22 + ") is on the right side of the line from (" + p01 + ", " + p02 + ") to (" + p11 + ", " + p12 + ")");
    }
}
