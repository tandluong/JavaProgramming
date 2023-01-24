public class Exercise5_4 {
    public static void main(String[] args) {
        // Define initial values
        final double MILES_TO_KM = 1.609;
        final int NUMBER_OF_MILES = 10;

        // Create table header
        System.out.println("Miles       Kilometers");

        for (int miles = 1; miles <= NUMBER_OF_MILES; miles++) {
            System.out.printf("%-11d %.3f\n", miles, miles * MILES_TO_KM);
        }
    }
}
