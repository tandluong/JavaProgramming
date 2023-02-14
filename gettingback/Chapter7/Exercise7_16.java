import java.util.Arrays;

public class Exercise7_16 {
    public static void main(String[] args) {
        // Generate an array of 100,000 random integers
        // In this scenario, Linear search is much faster than binary search
        // Because Binary search has to sort the array first before it can be executed
        // Sorting the array is costing Binary search a lot of time
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = 1 + (int) (Math.random() * 100000);

        // Generate a random key
        int key = 1 + (int) (Math.random() * 100000);

        // Display execution times
        System.out.println("The execution time for linear search is: " +
                linearSearchExecutionTime(numbers, key) + " ms");
        System.out.println("The execution time for binary search is: " +
                binarySearchExecutionTime(numbers, key) + " ms");
    }

    public static long linearSearchExecutionTime(int[] numbers, int key) {
        long startTime = System.currentTimeMillis();
        LinearSearch.linearSearch(numbers, key);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long binarySearchExecutionTime(int[] numbers, int key) {
        // We have to make sure that the list is sorted before we do binary search
        long startTime = System.currentTimeMillis();
        Arrays.sort(numbers);
        BinarySearch.binarySearch(numbers, key);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
