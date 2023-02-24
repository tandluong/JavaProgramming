import java.util.*;
public class Exercise3_28 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double r1x = input.nextDouble();
        double r1y = input.nextDouble();
        double r1w = input.nextDouble();
        double r1h = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2x = input.nextDouble();
        double r2y = input.nextDouble();
        double r2w = input.nextDouble();
        double r2h = input.nextDouble();

        // Determine if the second rectangle is inside the first or overlaps
        // We know r2 is inside r1 if the x and y of r2 is within r1 and r2 width and height
        boolean insideR1 = r2x + r2w < r1w && r2y + r2h < r1h;
        // Determine if r2 overlaps r1, the width of r2 must extend over r1
        boolean overlapR1 = r2w > r1w && r2x - r1x < r2w;
        // Determine if r2 does not overlap by comparing the difference of r1 and r2's x, y, width, and height
        //boolean doesNotOverLapR1 = r2x - r1x >= r2w + r1w && r2y - r1y >= r2h + r1h;

        // Display Result
        if (insideR1)
            System.out.println("r2 is inside r1");
        else if (overlapR1)
            System.out.println("r2 overlaps r1");
        else
            System.out.println("r2 does not overlap r1");
    }
}
