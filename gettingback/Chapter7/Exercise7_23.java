public class Exercise7_23 {
    public static void main(String[] args) {
        // Initialize the boolean array
        boolean[] lockers = new boolean[100];

        // Create a nested for loop for 100 students and 100 lockers
        for (int i = 1; i <= 100; i++) {
            for (int j = 0; j < lockers.length; j++) {
                student(lockers, i, j);
            }
        }

        // Display lockers result
        int count = 0;
        for (boolean l : lockers) {
            count++;
            if (count % 10 == 0)
                System.out.println(l);
            else
                System.out.printf("%-7b", l);
        }
    }

    public static boolean student(boolean[] lockers, int student, int locker) {
        if ((locker + 1) % student == 0)
            return lockers[locker] = !lockers[locker];

        return lockers[locker];
    }
}
