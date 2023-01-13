public class Exercise4_16 {
    public static void main(String[] args) {
        // Generate a random uppercase letter using Math.random()
        // We know that capital letters are 65-90
        int randomNum = 65 + (int)(Math.random() * 26);

        // Convert the random number to char
        char randomLetter = (char)randomNum;

        // Display Result
        System.out.printf("The random uppercase letter is %c", randomLetter);
    }
}
