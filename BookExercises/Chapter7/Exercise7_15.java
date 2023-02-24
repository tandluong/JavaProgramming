import java.util.Scanner;

public class Exercise7_15 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // initialize integer array
        int[] numbers = new int[10];

        // Prompt user for input
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        // Display result
        System.out.print("The distinct numbers are: ");
        for (int n : eliminateDuplicates(numbers))
            System.out.print(n + " ");
    }

    public static int[] eliminateDuplicates(int[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            int selectIndex = i;
            for (int j = i + 1; j < list.length; j++)
                if (list[i] == list[j]) {
                    selectIndex = j;
                    list[selectIndex] = 0;
                }

            if (list[i] > 0)
                count++;
        }

        int[] distinctList = new int[count];
        for (int i = 0, j = 0; i < list.length; i++) {
            if (list[i] > 0) {
                distinctList[j] = list[i];
                j++;
            }
        }

        return distinctList;
    }
}
