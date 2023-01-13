public class Exercise4_25 {
    public static void main(String[] args) {
        // We want to generate 3 random uppercase letters and 4 random digits
        // We know that uppercase letters are 65-90 in Char
        // Numbers we don't have to use char, but we can if we want to
        // Generate 3 random numbers between 65-90
        char letter1 = (char)(65 + (int)(Math.random() * 26));
        char letter2 = (char)(65 + (int)(Math.random() * 26));
        char letter3 = (char)(65 + (int)(Math.random() * 26));
        // Generate 4 random individually or 1000-9999 to make it simpler
        int digits = 1000 + (int)(Math.random() * 9000);

        // Combine the all the letters and digits to form a license plate
        String plateNumber = "" + letter1 + letter2 + letter3 + digits;

        // Display Result
        System.out.printf("The vehicle plate number is %s", plateNumber);
    }
}
