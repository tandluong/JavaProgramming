import java.util.Scanner;

public class Exercise8_15 {
    public static void main(String[] args) {
        displayResult();
    }

    public static void displayResult() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize a 5-by-2 matrix
        double[][] points = new double[5][2];

        // Prompt user for input
        System.out.print("Enter five points: ");
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();

        if (sameLine(points))
            System.out.println("The five points are on the same line");
        else
            System.out.println("The five points are not on the same line");
    }

    public static boolean sameLine(double[][] points) {
        // We are taking in 5 points using a 2 dimensional array
        // That means every point contains x and y
        // i.e., points[0][0] = point 0's X and points[0][1] = point 0's Y
        // How would we find the point equation?
        // We will assume that all points are the same and derive the equation that way
        // y[4][1] - y[3][1] / (x[4][0] - x[3][0]) == y[3][1] - y[2][1] / (x[3][0] - x[2][0]) == ...
        // Keep doing this until we reach y[0][0] and x[0][0]
        // We cross multiply them to get the equation

        double determinant = ((points[1][0] - points[0][0]) * (points[2][1] - points[1][1])) +
                ((points[4][0] - points[3][0]) * (points[3][1] - points[2][1])) -
                ((points[2][0] - points[1][0]) * (points[1][1] - points[0][1])) -
                ((points[3][0] - points[2][0]) * (points[4][1] - points[3][1]));

        return determinant == 0;
    }
}
