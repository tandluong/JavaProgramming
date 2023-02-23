import java.util.Scanner;

public class Exercise8_21 {
    public static void main(String[] args) {
        double[][] cities = cities();
        centralCity(cities);
    }

    public static void centralCity(double[][] cities) {
        // How would we know what is the central city?
        // Central city has the shortest total distance to all other cities
        // That means we have to find the distance of all other cities to each city
        // The city with the lowest distance will be the central city
        double[] shortestDistance = new double[cities.length];

        // Sum the total distance to every other city from a certain city
        for (int i = 0; i < cities.length; i++)
            for (int j = 0; j < cities.length; j++)
                    shortestDistance[i] += distance(cities[i][0], cities[i][1],
                        cities[j][0], cities[j][1]); // sum total distance

        // Find the shortest distance from the total distance
        int central = 0;
        double shortest = shortestDistance[central];
        for (int i = 1; i < shortestDistance.length; i++)
                if (shortest > shortestDistance[i]) {
                    central = i;
                    shortest = shortestDistance[central];
                }

        // Display result
        System.out.println("The central city is at (" + cities[central][0] +
                ", " + cities[central][1] + ")");

        System.out.println("The total distance to all other cities is " +
                (int)(shortestDistance[central] * 100) / 100.0);
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static double[][] cities() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();

        // Initialize array to store city's coordinates
        double[][] cities = new double[numberOfCities][2];

        // Prompt user for input of city coordinates
        System.out.println("Enter the coordinates of the cities: ");
        for (int i = 0; i < cities.length; i++)
            for (int j = 0; j < cities[i].length; j++)
                cities[i][j] = input.nextDouble();

        return cities;
    }
}
