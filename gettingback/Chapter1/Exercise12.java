public class Exercise12 {
    public static void main(String[] args) {
        double distanceInMiles = 24.0;
        double timeInSeconds = (100.0 * 60) + 35;
        double oneHour = 3600;
        double distanceInKM = distanceInMiles * 1.6;
        double runSpeed = distanceInKM / (timeInSeconds / oneHour);

        System.out.println("Speed in kmph: " + runSpeed);
    }
}
