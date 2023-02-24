public class Exercise6_9 {
    public static void main(String[] args) {
        // Call printTable to display result
        printTable();
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void printTable() {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n",
                "Feet", "Meters", "|", "Meters", "Feet");
        System.out.println("-------------------------------------------------------");

        // Create the table body
        tableBody();
    }

    public static void tableBody() {
        double startingFeet = 1.0;
        double startingMeters = 20.0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.1f %-10.3f %-10s %-10.1f %-10.3f\n",
                    startingFeet, footToMeter(startingFeet), "|",
                    startingMeters, meterToFoot(startingMeters));
            startingFeet++;
            startingMeters += 5;
        }
    }
}
