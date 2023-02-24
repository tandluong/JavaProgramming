public class Exercise7_7 {
    public static void main(String[] args) {
        // Initialize integer array with size 10
        int[] number = new int[10];

        // Generate 100 random integers
        for (int i = 0; i < 100; i++) {
            int random = randomInteger();
            number[random]++;
        }

        // Display result
        for (int i = 0; i < number.length; i++) {
            System.out.println(i + " has " + number[i] + " counts");
        }
    }

    // Generate random numbers between 0 and 9
    public static int randomInteger() {
        return (int) (Math.random() * 10);
    }
}
