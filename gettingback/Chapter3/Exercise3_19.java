import java.util.*;
public class Exercise3_19 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the three edges for a triangle, i.e., 2 3 4: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        // Compare the edges to make sure the input is valid
        boolean valid = false;
        double perimeter = 0;
        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
            valid = true;
            perimeter = edge1 + edge2 + edge3;
        }

        // Compute the perimeter
        if (valid) {
            System.out.println("The perimeter of the triangle is " + perimeter);
        }
        else {
            System.out.println("The input is invalid");
        }
    }
}
