import java.util.Scanner;

public class Exercise7_21 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the numbers of balls to drop: ");
        int numberOfBalls = input.nextInt();
        System.out.print("Enter the numbers of slots in the bean machine: ");
        int[] slots = new int[input.nextInt()];

        // Display result
        String[] movement = new String[numberOfBalls];
        for (int i = 0; i < numberOfBalls; i++) {
            movement[i] = findMovement(slots);
            int position = findPosition(movement[i]);
            slots[position]++;
        }

        System.out.println();
        for (String s : movement)
            System.out.println(s);

        for(int n : slots)
            System.out.print(n + " ");

        System.out.println();
        for (int i = 0; i < slots.length; i++) {
            for (int j = 0; j < slots.length; j++) {
                if (slots[j] + i < slots.length) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("O ");
                    slots[j]--;
                }
            }
            System.out.println();
        }

        int[] position = new int[slots.length];
        for (int i = 0; i < position.length; i++) {
            position[i] = (i + 1);
            System.out.print(position[i] + " ");
        }
    }

    public static int findPosition(String movement) {
        int position = 0;

        // We want to find the position of where the ball dropped
        // How would we approach this?
        // We know that the ball has a maximum of n - 1 bounces before it drops
        // For every Right (R) bounce; the position will increase by 1
        for (int i = 0; i < movement.length(); i++)
            if (movement.charAt(i) == 'R')
                position++;

        return position;
    }

    public static String findMovement(int[] slots) {
        String bounces = "";
        for (int i = 0; i < slots.length - 1; i++) {
            // We will generate random number between 1 and 100
            // Let 1-50 be Left (L) and 50-100 be Right (R)
            int random = 1 + (int) (Math.random() * 100);
            if (random <= 50)
                bounces += "L";
            else
                bounces += "R";
        }

        return bounces;
    }
}
