public class FutureTuition {
    public static void main(String[] args) {
        // Initial value
        double tuition = 10000;
        int year = 0;
        while (tuition < 20000) {
            tuition *= 1.07;
            year++;
        }

        System.out.printf("The tuition will be doubled in %d years", year);
        System.out.printf("\nTuition will be $%.2f in %1d years", tuition, year);
    }
}
