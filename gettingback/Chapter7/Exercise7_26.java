import java.util.Scanner;

public class Exercise7_26 {
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
            System.out.println("The two lists are strictly identical");
        else
            System.out.println("The lists are not strictly identical");
    }

    public static boolean equals(int[] list1, int[] list2) {
        // How would we do this?
        // We will loop through both loops and compare their values
        // If everything matches, then it is true
        // Else, if we find one mismatch, then return false
        for (int i = 0; i < list1.length && i < list2.length; i++)
            if (list1[i] != list2[i])
                return false;

        return true;
    }
}
