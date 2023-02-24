public class Exercise9_3 {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();

        int zeros = 4;
        while (zeros < 12) {
            long timeElapsed = (long) Math.pow(10, zeros);
            date.setTime(timeElapsed);
            System.out.println("The date with elapsed time set to " +
                    timeElapsed + " is " + date.toString());
            zeros++;
        }
    }
}
