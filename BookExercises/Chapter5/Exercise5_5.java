public class Exercise5_5 {
    public static void main(String[] args) {
        // Define initial values
        final double KG_TO_LBS = 2.2;

        // Create Table header
        System.out.println("Kilograms   Pounds      |       Pounds      Kilograms");

        // initialize given values
        int kg = 1;
        int lbs = 20;

        while (kg < 200 && lbs < 515) {
            // We don't need to check any if conditions since we already know that
            // kg is constantly incrementing by 2 and lbs by 5
            // just set the stop condition when kg < 200 and lbs < 515
            System.out.printf("%-10d %7.1f      |       %-12d %8.2f\n",
                    kg, kg * KG_TO_LBS, lbs, lbs / KG_TO_LBS);

            kg += 2;
            lbs += 5;
        }
    }
}
