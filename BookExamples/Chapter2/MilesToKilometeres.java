public class MilesToKilometeres {
    public static void main(String[] args) {
        // Declare a double variable miles with initial value 100
        double miles = 100;
        // Declare a double constant with value 1.609
        final double KILOMETERS_PER_MILES = 1.609;
        // Declare a double variable kilometers multiplying miles with kilometers_per_miles
        double kilometers = miles * KILOMETERS_PER_MILES;
        // Display the result
        System.out.println(miles + " miles is equivalent to " + kilometers + " kilometers");
    }
}
