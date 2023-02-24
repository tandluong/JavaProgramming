public class Exercise9_6 {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();

        // Generate 100,000 random numbers and sort them with selection sort
        int[] numbers = new int[100000];
        java.util.Random random = new java.util.Random(1000);
        for (int i = 0; i < numbers.length; i++) {
            // Random numbers between 0 and 100,000
            numbers[i] = random.nextInt(100000);
        }

        // Sort the array with selection sort
        // Reset the time by starting it
        long startTime = time.start();
        selectionSort(numbers);
        // Get the current time when sorting is complete
        long endTime = time.stop();

        // Get the elapsed time
        long elapsedTime = endTime - startTime;
        System.out.println("The time it took to sort 100,000 numbers using selection sort is " +
                elapsedTime + " milliseconds or " + elapsedTime / 1000.0 + " seconds");
    }

    // Can be found in Book Examples Chapter 7
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Initialize the current value at list[i]
            int currentMin = list[i];
            int currentMinIndex = i;

            // Find the lowest value from i + 1 in the list
            // and find its value and location
            for (int j = i + 1; j < list.length - 1; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // If the initial low and next low are not at the same location, swap them
            // else the swapping is skipped; no action needed
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
