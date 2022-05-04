public class Exercise10 {
    public static void main(String[] args) {
        double distance = 14.0;
        double timeSeconds = (45 * 60) + 30;
        double oneHour = 3600;
        double oneMileFromKm = 1.6;
        double distanceInMiles = distance / oneMileFromKm;

        System.out.println("Speed in kmph: " + distance / (timeSeconds / oneHour));
        System.out.println("Speed in mph: " + distanceInMiles / (timeSeconds / oneHour));
    }
}
