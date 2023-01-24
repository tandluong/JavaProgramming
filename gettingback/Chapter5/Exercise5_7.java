public class Exercise5_7 {
    public static void main(String[] args) {
        // Define the initial value
        final double TUITION_INCREASE = 0.05;
        final int YEARS = 10;

        double sum = 0;
        // Start at year 0
        double futureTuition = 10000;
        for (int i = 0; i < YEARS; i++) {
            // find how much the tuition increased
            double increase = futureTuition * TUITION_INCREASE;
            // Add that to the future tuition
            futureTuition = futureTuition + increase;

            if (i > YEARS - i) {
                sum += futureTuition;
            }
        }

        // Display Result
        System.out.printf("The total cost of four years' worth of tuition after 10 years is %.2f", sum);
    }
}
