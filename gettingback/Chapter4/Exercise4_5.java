import java.util.*;
public class Exercise4_5 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the length of the side: ");
        double sideLength = input.nextDouble();

        // Calculate the area of the polygon
        double area = (numberOfSides * sideLength * sideLength) /
                (4 * Math.tan(Math.PI / numberOfSides));

        // Display Result
        System.out.printf("The area of the polygon is %.14f", area);
    }
}
