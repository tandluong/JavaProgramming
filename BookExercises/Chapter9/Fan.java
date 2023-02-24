public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";

    public Fan() {
    }

    public String toString() {
        String isOn = "The fan speed is " + speed + ", color is " + color + ", radius is " + radius;
        String isOff = "The fan color is " + color + ", radius is " + radius + ", fan is off";
        return on ? isOn : isOff;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        if (newSpeed > 3)
            newSpeed = FAST;
        if (newSpeed < 0)
            newSpeed = SLOW;
        this.speed = newSpeed;
    }

    public boolean getPowerStatus() {
        return on;
    }

    public void setPowerStatus(boolean status) {
        this.on = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }
}
