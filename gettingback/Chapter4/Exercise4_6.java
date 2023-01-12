public class Exercise4_6 {
    public static void main(String[] args) {
        final int RADIUS_OF_CIRCLE = 40;

        // Generate a random angle between 0 and 2PI (0 and 360)
        int angle = (int)(Math.random() * 361);
        double angleInRadian = Math.toRadians(angle);

        // Generate 3 random points
        // let this point be point A
        double point1x = RADIUS_OF_CIRCLE * Math.cos(angleInRadian);
        // generate another random angle
        angle = (int)(Math.random() * 361);
        angleInRadian = Math.toRadians(angle);
        double point1y = RADIUS_OF_CIRCLE * Math.sin(angleInRadian);

        // generate another random angle
        angle = (int)(Math.random() * 361);
        angleInRadian = Math.toRadians(angle);
        // let this point be point B
        double point2x = RADIUS_OF_CIRCLE * Math.cos(angleInRadian);
        // generate another random angle
        angle = (int)(Math.random() * 361);
        angleInRadian = Math.toRadians(angle);
        double point2y = RADIUS_OF_CIRCLE * Math.sin(angleInRadian);

        // generate another random angle
        angle = (int)(Math.random() * 361);
        angleInRadian = Math.toRadians(angle);
        // let this point be point C
        double point3x = RADIUS_OF_CIRCLE * Math.cos(angleInRadian);
        // generate another random angle
        angle = (int)(Math.random() * 361);
        angleInRadian = Math.toRadians(angle);
        double point3y = RADIUS_OF_CIRCLE * Math.sin(angleInRadian);

        // Distance to each point is sqrt((x2 - x1)^2 + (y2 - y1)^2)
        // Find distance from point A to point B (Point A)
        double distanceAToB = Math.sqrt(Math.pow(point2x - point1x, 2) + Math.pow(point2y - point1y, 2));
        // Find distance from point A to point C (Point B)
        double distanceAToC = Math.sqrt(Math.pow(point3x - point1x, 2) + Math.pow(point3y - point1y, 2));
        // Find distance from point B to point C (Point C)
        double distanceBToC = Math.sqrt(Math.pow(point3x - point2x, 2) + Math.pow(point3y - point2y, 2));

        // Apply the Law of Cosines
        // A^2 = B^2 + C^2 - 2*B*C*cos(A)
        // B^2 = A^2 + C^2 - 2*A*C*cos(B)
        // C^2 = A^2 + B^2 - 2*A*B*cos(C)
        double cosA = (Math.pow(distanceAToC, 2) + Math.pow(distanceBToC, 2) - Math.pow(distanceAToB, 2))
                / (2 * distanceAToC * distanceBToC);
        double cosB = (Math.pow(distanceAToB, 2) + Math.pow(distanceBToC, 2) - Math.pow(distanceAToC, 2))
                / (2 * distanceAToB * distanceBToC);
        double cosC = (Math.pow(distanceAToB, 2) + Math.pow(distanceAToC, 2) - Math.pow(distanceBToC, 2))
                / (2 * distanceAToB * distanceAToC);

        // Get the angle at each point
        // Make sure to convert it to degrees
        double angleA = Math.toDegrees(Math.acos(cosA));
        double angleB = Math.toDegrees(Math.acos(cosB));
        double angleC = Math.toDegrees(Math.acos(cosC));

        // Display Result
        System.out.printf("The three angles formed by these three points" +
                " (%.0f, %.0f), (%.0f, %.0f) (%.0f, %.0f) are %.2f, %.2f, %.2f",
                point1x, point1y, point2x, point2y, point3x, point3y, angleA, angleB, angleC);
    }
}
