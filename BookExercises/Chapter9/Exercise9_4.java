public class Exercise9_4 {
    public static void main(String[] args) {
        // Seed 1000
        java.util.Random randomInt = new java.util.Random(1000);

        // Generate 50 random integers between 0 and 10
        for (int i = 1; i <= 50; i++)
            if (i % 10 == 0)
                System.out.println();
            else
                // Generates a random integer between 0 and 100 (exclusive of 100)
                System.out.printf("%2d ", randomInt.nextInt(100));
    }
}
