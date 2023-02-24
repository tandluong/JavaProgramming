public class Exercise6_13 {
    public static void main(String[] args) {
        // Call printTable to display result
        printTable();
    }

    public static double sumSeries(double i) {
        return i / (i + 1);
    }

    public static void printTable() {
        // Create Table Header
        System.out.printf("%-10s %s\n", "i", "m(i)");
        System.out.println("-------------------");

        // Create Table Body
        printTableBody();
    }

    public static void printTableBody() {
        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += sumSeries(i);
            System.out.printf("%-10d %.4f\n", i, sum);
        }
    }
}
