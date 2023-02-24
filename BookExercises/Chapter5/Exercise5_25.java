public class Exercise5_25 {
    public static void main(String[] args) {
        int i1 = 10000;
        int i2 = 20000;
        int i3 = 100000;

        // Compute PI
        // Formula is 4 * ((-1)^i+1 / (2i - 1))
        // double PI = 4 * (Math.pow(-1, i + 1) / (2 * i - 1));
        double PI = 0;
        int counter = 1;
        while (counter <= i1) {
            PI += (Math.pow(-1, counter + 1) / (2 * counter - 1));
            counter++;
        }
        // Display the first PI result
        System.out.printf("When i = %d, PI is %.15f", i1, PI * 4);

        // reset all values
        counter = 1;
        PI = 0;
        while (counter <= i2) {
            PI += (Math.pow(-1, counter + 1) / (2 * counter - 1));
            counter++;
        }
        // Display the first PI result
        System.out.printf("\nWhen i = %d, PI is %.15f", i2, PI * 4);

        // reset all values
        counter = 1;
        PI = 0;
        while (counter <= i3) {
            PI += Math.pow(-1, counter + 1) / (2 * counter - 1);
            counter++;
        }
        // Display the first PI result
        System.out.printf("\nWhen i = %d, PI is %.15f", i3, PI * 4);
    }
}
