public class Exercise5_40 {
    public static void main(String[] args) {
        final int NUMBER_OF_FLIPS = 1000000;

        int heads = 0;
        int tails = 0;
        for (int i = 1; i <= NUMBER_OF_FLIPS; i++) {
            // Generate a random number between 0 and 1 to simulate heads or tails
            // Let 0 = heads and 1 = tails
            int random = (int) (Math.random() * 2);
            // Increment heads or tails if random number flips into it
            switch (random) {
                case 0 -> heads++;
                case 1 -> tails++;
            }
        }

        // Display result
        System.out.printf("The number of heads is %d", heads);
        System.out.printf("\nThe number of tails is %d", tails);
    }
}
