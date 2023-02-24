import java.util.Scanner;

public class Exercise7_31 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter list1: ");
        int[] list1 = input(input);
        System.out.print("Enter list2: ");
        int[] list2 = input(input);

        // Merge list 1 and list 2
        int[] list3 = merge(list1, list2);

        // Display result
        for (int l : list3)
            System.out.print(l + " ");
    }

    public static int[] input(Scanner input) {
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();

        return list;
    }

    public static int[] merge(int[] list1, int[] list2) {
        int length = list1.length + list2.length;
        // initialize new array with combined length
        int[] list3 = new int[length];

        // How would we approach this?
        // We first initialize 2 integers as placements for the previous list positions
        int l1 = 0;
        int l2 = 0;
        // Then we compare the two list's contents
        // This will stop when either one of the int reaches their list's length
        while (l1 < list1.length && l2 < list2.length) {
            // If list1[0] is less than list2[0]
            if (list1[l1] < list2[l2])
                // Then list3[0 + 0] = list1[l1++ = 0++]; l1 -> 1 after the assignment
                list3[l1 + l2] = list1[l1++];
            else
                // Else list3[0 + 0] = list2[l2++ = 0++]; l2 -> 1 after the assignment
                list3[l1 + l2] = list2[l2++];
        }
        // Now we have to finish the remainder of either list
        // If list1 wasn't complete, then add the remaining contents of list1
        while (l1 < list1.length)
            list3[l1 + l2] = list1[l1++];
        // If list2 wasn't complete, then add the remaining contents of list2
        while (l2 < list2.length)
            list3[l1 + l2] = list2[l2++];

        // Return the new merged list
        return list3;
    }
}
