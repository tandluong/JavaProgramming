import java.util.Scanner;

public class Exercise7_27 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();

        // Invoke method to get result
        boolean equals = equals(list1, list2);

        if (equals)
            System.out.println("Two lists are identical");
        else
            System.out.println("Two lists are not identical");
    }

    public static boolean equals(int[] list1, int[] list2) {
        // How would we do this?
        // This problem is similar to the previous one, but there is one difference
        // The previous problem was to see if all content matched each other's position
        // This problem wants to find if the total content are identical

        // How would we do this?
        // For an integer array, we can sum up all the contents inside the array
        // If the sum of both lists are not the same, then the list are not identical

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < list1.length && i < list2.length; i++) {
            sum1 += list1[i];
            sum2 += list2[i];
        }

        return sum1 == sum2;
    }
}
