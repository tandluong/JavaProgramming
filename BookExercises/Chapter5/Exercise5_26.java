public class Exercise5_26 {
    public static void main(String[] args) {
        int i1 = 10000;
        int i2 = 20000;
        int i3 = 100000;

        // Approximate e

        // initialize variables
        // counter or i should start at 2, because at 1, it will return 0 which cannot be used to divide
        int counter = 2;
        double item = 1;
        double e = 1;
        while (counter <= i1) {
            item /= counter - 1;
            e += item;

            counter++;
        }
        // Display result for i1
        System.out.printf("When i = %d, e is approximately %.16f", i1, e);


        // reset variables
        counter = 2;
        item = 1;
        e = 1;
        while (counter <= i2) {
            item /= counter - 1;
            e += item;

            counter++;
        }
        // Display result for i2
        System.out.printf("\nWhen i = %d, e is approximately %.16f", i2, e);

        // reset variables
        counter = 2;
        item = 1;
        e = 1;
        while (counter <= i3) {
            item /= counter - 1;
            e += item;

            counter++;
        }
        // Display result for i2
        System.out.printf("\nWhen i = %d, e is approximately %.16f", i3, e);
    }
}
