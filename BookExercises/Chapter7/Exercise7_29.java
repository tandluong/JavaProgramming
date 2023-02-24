public class Exercise7_29 {
    public static void main(String[] args) {
        // We want to randomly pick 4 cards that will give us the sum of 24
        // Ace, King, Queen, and Jack represent 1, 13, 12, and 11, respectively

        // There is nothing special we have to do here
        // We can just generate a random number between 1 and 13

        // Display result
        System.out.println("The number of picks that yield the sum 24 is: " + pick());
    }

    public static int pick() {
        // Sum the 4 random numbers until sum is 24
        int sum = 0;
        int count = 0;
        while (sum != 24) {
            for (int i = 0; i < 4; i++) {
                // Draw 4 random cards 1-13 and sum them
                sum += randomNumber();
                count++;
            }
            if (sum != 24) {
                sum = 0;
            }
        }

        return count;
    }

    public static int randomNumber() {
        return 1 + (int) (Math.random() * 13);
    }
}
