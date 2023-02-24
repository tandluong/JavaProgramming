public class Exercise5_6 {
    public static void main(String[] args) {
        // Define initial values
        final double MILES_TO_KM = 1.609;

        // Create Table Header
        System.out.println("Miles       Kilometers  |   Kilometers      Miles");

        // initialize know values
        int miles = 1;
        int km = 20;
        while (miles <= 10 && km <= 65) {
            System.out.printf("%-11d %-9.3f   |   %-15d %.3f\n",
                    miles, miles * MILES_TO_KM, km, km / MILES_TO_KM);

            miles++;
            km += 5;
        }
    }
}
