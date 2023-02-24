import java.util.Scanner;

public class Exercise7_19 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt use for input
        System.out.print("Enter list: ");
        int[] numbers = new int[input.nextInt()];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        // Verify if list is sorted
        if (isSorted(numbers))
            System.out.print("The list is already sorted");
        else
            System.out.print("The list is not sorted");
    }

    public static boolean isSorted(int[] list) {
        // How would we verify this?
        // We would have to sort the list first and compare the two lists
        // Create a new list and copy all the content from the old list
        int[] compare = new int[list.length];
        for (int i = 0; i < list.length; i++)
            compare[i] = list[i];

        // Sort the compare list with any type of sorting method
        // Let's use SelectionSort from the listing
        // Create an overload method in the class to allow int[] array
        SelectionSort.selectionSort(compare);

        // Now we will compare the old list with the new list
        // If 1 mismatch is found, we can return false
        for (int i = 0; i < list.length; i++) {
            if (list[i] == compare[i]) {
                // do nothing
            }
            else
                return false;
        }


        // Assume true
        return true;
    }
}
