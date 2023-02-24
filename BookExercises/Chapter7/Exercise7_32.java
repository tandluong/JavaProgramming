import java.util.Scanner;

public class Exercise7_32 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter list: ");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        // Invoke method
        int[] pivot = partition(list);

        // Display result
        System.out.print("After the partition, the list is ");
        for (int l : pivot)
            System.out.print(l + " ");
    }

    public static int[] partition(int[] list) {
        // Find the pivot value from list
        int pivot = list[0];
        // First we have to find how many int
        // in the list is less than or equal to the pivot
        // and how many are above the pivot;
        int countLow = 0;
        int countHigh = 0;
        for (int i : list) {
            if (i <= pivot)
                countLow++;
            else
                countHigh++;
        }
        // Initialize 2 list base on the counts;
        // Less than pivot
        int[] list1 = new int[countLow];
        // equal to or greater than pivot
        int[] list2 = new int[countHigh];

        // initialize 2 int for placements of list1 and list2
        int l1 = 0;
        int l2 = 0;
        // Iterate through the list and add the values corresponding to each list
        // We will let list1 be all values less than or equal to the pivot
        // We will let list2 be all values greater than the pivot
        while (l1 + l2 < list.length) {
            if (list[l1 + l2] <= pivot)
                list1[l1] = list[l2 + l1++];
            else
                list2[l2] = list[l1 + l2++];
        }
        // Swap the index of the pivot with the last element in the smallest list
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] == pivot) {
                int temp = list1[i];
                list1[i] = list1[list1.length - 1];
                list1[list1.length - 1] = temp;
                break;
            }
        }

        // Now we will combine list1 and list2 and replace/overwrite the original list
        for (int i = 0; i < list.length; i++) {
            if (i < list1.length)
                list[i] = list1[i];
            else
                list[i] = list2[i - list1.length];
        }

        return list;
    }
}
