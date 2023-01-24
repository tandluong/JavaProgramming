public class Exercise5_23 {
    public static void main(String[] args) {
        final int VARIABLE_N = 50000;

        // start counter at 1
        int counter = 1;
        double leftToRight = 0;
        while (counter <= VARIABLE_N) {
            leftToRight += 1.0 / counter;
            counter++;
        }

        // reset counter to n
        counter = VARIABLE_N;
        double rightToLeft = 0;
        while (counter > 0) {
            rightToLeft += 1.0 / counter;
            counter--;
        }

        // Display result
        System.out.printf("""
                Adding from left to right yields: %.25f
                Adding from right to left yields: %.25f
                """,
                leftToRight, rightToLeft);
    }
}
