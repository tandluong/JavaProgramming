import java.util.*;
public class Exercise3_29 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double c1x = input.nextDouble();
        double c1y = input.nextDouble();
        double c1r = input.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double c2x = input.nextDouble();
        double c2y = input.nextDouble();
        double c2r = input.nextDouble();

        // Find the distance of between the two circle's center
        double distance = Math.pow(Math.pow((c2x - c1x), 2) + Math.pow((c2y - c1y), 2), 0.5);

        // Determine if circle2 is inside circle1 or overlaps circle1
        //  circle2 is inside circle1 if the distance between the two centers <= |r1 - r2|
        //  and circle2 overlaps circle1 if the distance between the two centers <= r1 + r2
        boolean insideCircle1 = distance <= Math.abs(c1r - c2r);
        boolean overlapsCircle1 = distance <= c1r + c2r;

        // Display result
        if (insideCircle1)
            System.out.println("circle2 is inside circle1");
        else if (overlapsCircle1)
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");
    }
}
