import java.util.Scanner;

public class Exercise9_10 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter values for a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation findRoot = new QuadraticEquation(a, b, c);

        if (findRoot.getDiscriminant() > 0)
            System.out.println("The equation has two roots " +
                    (int)(findRoot.getRoot1() * 1000000) / 1000000.0 +
                    " and " + (int)(findRoot.getRoot2() * 1000000) / 1000000.0);
        else if (findRoot.getDiscriminant() == 0)
            System.out.println("The equation has one root " +
                    (int)(findRoot.getRoot1() * 1000000) / 1000000.0);
        else
            System.out.println("The equation has no roots");
    }
}
