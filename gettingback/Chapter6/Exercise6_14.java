public class Exercise6_14 {
    public static void main(String[] args) {
        // Call printTable to display result
        printTable();
    }

    public static double evaluatePI(double i) {
        return 4 * Math.pow(-1, i + 1) / (2 * i - 1);
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
        for (int i = 1; i <= 901; i++) {
            sum += evaluatePI(i);
            if (i % 100 == 1)
                System.out.printf("%-10d %.4f\n", i, sum);
        }
    }
}
