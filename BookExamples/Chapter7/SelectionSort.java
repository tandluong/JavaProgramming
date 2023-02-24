public class SelectionSort {
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Initialize the current value at list[i]
            double currentMin = list[i];
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
