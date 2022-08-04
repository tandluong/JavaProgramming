import java.util.*;
public class Exercise2_11 {
    public static void main(String[] args) {
        // create Scanner Object
        Scanner input = new Scanner(System.in);
        // prompt user for input
        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        // initial population
        double population = 312032486;
        // how many days are in a year
        double oneYear = 365.0;
        // how many hours are in a day
        double oneDay = 24.0;
        // how many seconds are in an hour
        double oneHour = 3600.0;
        // calculate how many seconds are in a year
        double secondsInOneYear = oneHour * oneDay * oneYear;
        // given rates
        double birthPerSecond = 7.0;
        double deathPerSecond = 13.0;
        double immigrantPerSecond = 45.0;
        // calculate each variable by dividing the amount of seconds in one year by each given rate
        double numberOfBirthPerYear = secondsInOneYear / birthPerSecond;
        double numberOfDeathPerYear = secondsInOneYear / deathPerSecond;
        double numberOfImmigrantPerYear = secondsInOneYear / immigrantPerSecond;

        // calculate the projection of the population based on how many years
        double projectedPopulation = population + (Math.round((numberOfBirthPerYear + numberOfImmigrantPerYear - numberOfDeathPerYear) * numberOfYears));

        // print result
        System.out.println("The population in " + numberOfYears + " is " + (int)projectedPopulation);
    }
}
