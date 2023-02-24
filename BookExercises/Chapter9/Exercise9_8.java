public class Exercise9_8 {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();
        f1.setSpeed(f1.FAST);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setPowerStatus(true);

        f2.setSpeed(f1.MEDIUM);
        f2.setRadius(5);
        f2.setColor("blue");
        f2.setPowerStatus(false);

        System.out.println("The first fan object is: " + f1.toString());
        System.out.println("The second fan object is: " + f2.toString());
    }
}
