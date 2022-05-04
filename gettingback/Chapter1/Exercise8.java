public class Exercise8 {
    public static void main(String[] args) {
        double radius = 5.5;
        double pi = 4.0 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) +
                (1.0/13) - (1.0/15) + (1.0/17) - (1.0/19) + (1.0/21) - (1.0/23) + (1.0/25));
        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;

        System.out.println(pi);
        System.out.println(perimeter);
        System.out.println(area);
    }
}
