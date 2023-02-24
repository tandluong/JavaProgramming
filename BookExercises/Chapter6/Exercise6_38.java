public class Exercise6_38 {
    public static void main(String[] args) {
        // Display result
        printCharacter();
    }

    public static void printCharacter() {
        int uppercase = 0;
        int digits = 0;

        while (uppercase < 100 || digits < 100) {
            char randomUpper = RandomCharacter.getRandomUpperCaseLetter();
            char randomDigit = RandomCharacter.getRandomDigit();

            if (uppercase < 100) {
                uppercase++;
                System.out.print(randomUpper + " ");
            }

            if ((uppercase + digits) % 10 == 0)
                System.out.println();

            if (uppercase >= 100) {
                digits++;
                System.out.print(randomDigit + " ");
            }
        }
    }
}
