public class Exercise3_24 {
    public static void main(String[] args) {
        // Generate 2 random numbers; one between 1-13 and one between 1-4
        int randomRank = 1 + (int)(Math.random() * 13);
        int randomSuit = 1 + (int)(Math.random() * 4);

        // Create a switch statement to determine the rank and suit
        String cardRank = switch (randomRank) {
            case 1: yield "Ace";
            case 2: yield "2";
            case 3: yield "3";
            case 4: yield "4";
            case 5: yield "5";
            case 6: yield "6";
            case 7: yield "7";
            case 8: yield "8";
            case 9: yield "9";
            case 10: yield "10";
            case 11: yield "Jack";
            case 12: yield "Queen";
            case 13: yield "King";
            default: throw new IllegalArgumentException(randomRank + " is not within range");
        };

        String cardSuit = switch (randomSuit) {
            case 1: yield "Clubs";
            case 2: yield "Diamonds";
            case 3: yield "Hearts";
            case 4: yield "Spades";
            default: throw new IllegalArgumentException(randomSuit + " is not within range");
        };

        // Display result
        System.out.println("The card you picked is " + cardRank + " of " + cardSuit);
    }
}
