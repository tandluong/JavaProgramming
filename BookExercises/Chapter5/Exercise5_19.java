public class Exercise5_19 {
    public static void main(String[] args) {
        // initialize iteration time
        int n = 8;
        // initialize loop
        for (int i = 0; i < n; i++) {
            // Triangle 1
            // Create the first triangle that spaces out the next triangle
            for (int j = i; j < n; j++) {
                System.out.print("    ");
            }

            // Triangle 2
            // Create the second triangle that will do 2^k
            for (int k = 0; k < i; k++) {
                System.out.printf("%4d", (int)Math.pow(2, k));
            }

            // Triangle 3
            // Create the third triangle that will do 2^(i - l)
            for (int l = 0; l <= i; l++) {
                System.out.printf("%4d", (int)Math.pow(2, i - l));
            }

            System.out.println();
        }
    }
}
