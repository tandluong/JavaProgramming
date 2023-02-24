public class Exercise6_8 {
    public static void main(String[] args) {
        // Call the temperatureTable to display result
        temperatureTable();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void temperatureTable() {
        // Create Table Header
        System.out.printf("%-15s %-15s %-10s %-15s %-15s\n",
                "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
        System.out.println("--------------------------------------------------------------------");

        // Create Temperature conversion Table
        temperatureConversionTable();
    }

    public static void temperatureConversionTable() {
            double startingCelsius = 40.0;
            double startingFahrenheit = 120.0;
            for (int i = 0; i < 10; i ++) {
                System.out.printf("%-15.1f %-15.1f %-10s %-15.1f %-15.2f\n",
                        startingCelsius, celsiusToFahrenheit(startingCelsius), "|",
                        startingFahrenheit, fahrenheitToCelsius(startingFahrenheit));
                startingCelsius--;
                startingFahrenheit -= 10;
            }
    }
}
