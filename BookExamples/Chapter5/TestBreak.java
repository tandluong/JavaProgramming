public class TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            if(sum >= 100)
                break;
        }

        System.out.printf("The number is %d", number);
        System.out.printf("\nThe sum is %d", sum);
    }
}
