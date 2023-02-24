public class Exercise7_24 {
    public static void main(String[] args) {
        // We need to track the suits
        // How are we approaching this?

        // We initialized the suits array to correspond integers to each suit
        // suits[0] -> Spades, suit[1] -> Hearts, suit[2] -> Diamonds, suit[3] -> Clubs

        // We will pick a random card by generating two random numbers for rank and suit
        // We will then use the random number for suit and divide it by 13 to find the
        // corresponding suit, i.e., (int) 30 / 13 = 2 - > Diamonds
        // We will then go into suit[2] and increment it by 1

        // We have to make sure that all suits can only equal to 1
        // If it is greater than 1, we will have to start over

        // We are also making sure to save the 4 unique cards drawn as well
        // Thus the String cards array is also needed

        // We want to get all 4 suits
        int[] suits = new int[4];
        String[] cards = new String[4];
        // Count will help count our total cards drawn
        int count = 0;
        // Count Card will help us save the distinct cards into the array
        int countCard = 0;

        do {
            // If countCard goes over our array's length,
            // then we have to reset all variables and try again
            if (countCard == 4) {
                // reset variables
                countCard = 0;
                suits = new int[4];
                cards = new String[4];
            }
            // Pick a random card
            int randomRank = random52();
            int randomSuit = random52();
            String rank = randomRank(randomRank);
            String suit = randomSuit(randomSuit);
            // Find the corresponding suit and increment it
            suits[randomSuit / 13]++;
            // Save the picked card
            cards[countCard] = rank + " of " + suit;
            // Increase the pick count
            count++;
            countCard++;
            // All suits are unique, leave the loop and print result
        } while (suits[0] != 1 || suits[1] != 1 || suits[2] != 1 || suits[3] != 1);


        // Print the number of picks
        for (String s : cards)
            System.out.println(s);
        System.out.println("Number of picks: " + count);
    }

    public static int random52() {
        return (int) (Math.random() * 52);
    }

    public static String randomRank(int random) {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King"};

        return ranks[random % 13];
    }

    public static String randomSuit(int random) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        return suits[random / 13];
    }
}
