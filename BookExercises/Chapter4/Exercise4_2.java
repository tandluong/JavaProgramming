import java.util.*;
public class Exercise4_2 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        // using regular double input
//        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
//        double p1x = input.nextDouble();
//        double p1y = input.nextDouble();
//        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
//        double p2x = input.nextDouble();
//        double p2y = input.nextDouble();

        // using String input
        System.out.print("Enter point 1 (latitude and longitude) in degrees: (-100, 100) ");
        String latLong1 = input.nextLine();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: (-100, 100) ");
        String latLong2 = input.nextLine();

        // Extract user input and convert to double from String
        int k = latLong1.indexOf(',');
        String getLat1 = latLong1.substring(0, k);
        String getLong1 = latLong1.substring(k + 1);
        double p1x = Double.parseDouble(getLat1);
        double p1y = Double.parseDouble(getLong1);

        k = latLong2.indexOf(',');
        String getLat2 = latLong2.substring(0, k);
        String getLong2 = latLong2.substring(k + 1);
        double p2x = Double.parseDouble(getLat2);
        double p2y = Double.parseDouble(getLong2);

        // Final the Earth's radius
        final double RADIUS_OF_EARTH = 6371.01;

        // Convert the given degrees into radians
        double p1xRadian = Math.toRadians(p1x);
        double p1yRadian = Math.toRadians(p1y);
        double p2xRadian = Math.toRadians(p2x);
        double p2yRadian = Math.toRadians(p2y);

        // Calculate the great circle distance between the two points
        double distance = RADIUS_OF_EARTH * Math.acos(Math.sin(p1xRadian) * Math.sin(p2xRadian) +
                (Math.cos(p1xRadian) * Math.cos(p2xRadian) * Math.cos(p1yRadian - p2yRadian)));

        // Display result
        System.out.printf("The distance between the two points is %.11f km", distance);
    }
}
