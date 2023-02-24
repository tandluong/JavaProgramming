public class Exercise9_1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.printf("%-15s%-10s%-10s%-10s%-10s\n",
                "Rectangle", "width", "height", "area", "perimeter");
        System.out.printf("%-15s%-10.3f%-10.3f%-10.3f%-10.3f\n",
                "r1", r1.getWidth(), r1.getHeight(), r1.getArea(), r1.getPerimeter());
        System.out.printf("%-15s%-10.3f%-10.3f%-10.3f%-10.3f\n",
                "r2", r2.getWidth(), r2.getHeight(), r2.getArea(), r2.getPerimeter());
    }
}
