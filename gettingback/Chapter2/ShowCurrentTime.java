public class ShowCurrentTime {
    public static void main(String[] args) {
        // Obtain the milliseconds
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the seconds from milliseconds
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the minute from seconds
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the hour from the minutes
        long totalHour = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHour % 24;

        // Display result
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
