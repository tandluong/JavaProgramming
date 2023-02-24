import java.util.Scanner;

public class Exercise7_33 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Create array of strings to store the animal names
        String[] animals = {"monkey", "rooster", "dog", "pig",
                "rat", "ox", "tiger", "rabbit",
                "dragon", "snake", "horse", "sheep"};

        // Prompt user for input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        switch (year % 12) {
            case 0 -> System.out.println(animals[0]);
            case 1 -> System.out.println(animals[1]);
            case 2 -> System.out.println(animals[2]);
            case 3 -> System.out.println(animals[3]);
            case 4 -> System.out.println(animals[4]);
            case 5 -> System.out.println(animals[5]);
            case 6 -> System.out.println(animals[6]);
            case 7 -> System.out.println(animals[7]);
            case 8 -> System.out.println(animals[8]);
            case 9 -> System.out.println(animals[9]);
            case 10 -> System.out.println(animals[10]);
            case 11 -> System.out.println(animals[11]);
        }
    }
}
