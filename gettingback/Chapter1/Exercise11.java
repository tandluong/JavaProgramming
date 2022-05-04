public class Exercise11 {
    public static void main(String[] args) {
        double population = 312032486;
        double oneYear = 365.0;
        double oneDay = 24.0;
        double oneHour = 3600.0;
        double secondsInOneYear = oneHour * oneDay * oneYear;
        double birthPerSecond = 7.0;
        double deathPerSecond = 13.0;
        double immigrantPerSecond = 45.0;
        double numberOfBirthPerYear = secondsInOneYear / birthPerSecond;
        double numberOfDeathPerYear = secondsInOneYear / deathPerSecond;
        double numberOfImmigrantPerYear = secondsInOneYear / immigrantPerSecond;
        System.out.println("Population at year 0: " + (int)population);

        population = population + numberOfBirthPerYear - numberOfDeathPerYear + numberOfImmigrantPerYear;
        System.out.println("Population at year 1: " + (int)population);

        population = population + numberOfBirthPerYear - numberOfDeathPerYear + numberOfImmigrantPerYear;
        System.out.println("Population at year 2: " + (int)population);

        population = population + numberOfBirthPerYear - numberOfDeathPerYear + numberOfImmigrantPerYear;
        System.out.println("Population at year 3: " + (int)population);

        population = population + numberOfBirthPerYear - numberOfDeathPerYear + numberOfImmigrantPerYear;
        System.out.println("Population at year 4: " + (int)population);

        population = population + numberOfBirthPerYear - numberOfDeathPerYear + numberOfImmigrantPerYear;
        System.out.println("Population at year 5: " + (int)population);
    }
}
