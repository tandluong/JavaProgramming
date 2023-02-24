public class TestChapter9 {
    public static void main(String[] args) {
        // CircleWithPrivateDataFields is defined
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        printCircle(myCircle);
    }

    public static void printCircle(CircleWithPrivateDataFields c) {
        System.out.println("The area of the circle is of radius " +
                c.getRadius() + " is " + c.getArea());
    }
}
