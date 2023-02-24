public class Exercise5_3 {
    public static void main(String[] args) {
        // Define the weight translation amount
        final double KG_TO_LBS = 2.2;

        // Create table header
        System.out.printf("Kilograms        Pounds\n");

        for (int i = 1; i < 200; i++) {
            // if i is an odd number, then output
            if (i % 2 != 0) {
                System.out.printf("%-15d %7.1f\n", i, i * KG_TO_LBS);
            }
        }
    }
}
