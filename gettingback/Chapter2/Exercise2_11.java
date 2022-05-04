import java.util.*;

public class Exercise2_11 {
    double population = 312032486;
    double oneYear = 365.0;
    double oneDay = 24.0;
    double oneHour = 3600.0;
    double secondsInOneYear = oneHour * oneDay * oneYear;
    double birthPerSecond = 7.0;
    double deathtPerSecond = 13.0;
    double immigrantPerSecond = 45.0;
    double numberOfBirthPerYear = secondsInOneYear / birthPerSecond;
    double numberOfDeathPerYear = secondsInOneYear / deathtPerSecond;
    double numberOfImmigrantPerYear = secondsInOneYear / immigrantPerSecond;


}
