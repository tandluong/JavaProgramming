public class Location {
    public static int row;
    public static int column;
    public static double maxValue;

    public static Location locateLargest(double[][] a) {
        // Assume max value is the first value in the array
        maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        return new Location();
    }
}
