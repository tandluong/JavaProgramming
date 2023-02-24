public class Exercise3_16 {
    public static void main(String[] args) {
        // Generate 2 random numbers
        int width = -50 + (int)(Math.random() * 100);
        int height = -100 + (int)(Math.random() * 200);

        // Display Result
        System.out.println("The random rectangle coordinate is (" + width + "," + height + ")");
    }
}
