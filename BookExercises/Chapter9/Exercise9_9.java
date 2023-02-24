public class Exercise9_9 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("%-10s%-10s%-10s\n", "Name", "Perimeter", "Area");
        System.out.printf("%-10s%-10.3f%-10.3f\n", "Polygon1", polygon1.getPerimeter(), polygon1.getArea());
        System.out.printf("%-10s%-10.3f%-10.3f\n", "Polygon2", polygon2.getPerimeter(), polygon2.getArea());
        System.out.printf("%-10s%-10.3f%-10.3f\n", "Polygon2", polygon3.getPerimeter(), polygon3.getArea());
    }
}
