public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
    }

    public RegularPolygon(int sides, double sideLength) {
        this.n = sides;
        this.side = sideLength;
    }

    public RegularPolygon(int sides, double sideLength, double x, double y) {
        this.n = sides;
        this.side = sideLength;
        this.x = x;
        this.y = y;
    }

    public int getSides() {
        return n;
    }

    public void setSides(int newSidesAmount) {
        this.n = newSidesAmount;
    }

    public double getSideLength() {
        return side;
    }

    public void setSideLength(int newSideLength) {
        this.side = newSideLength;
    }

    public double getX() {
        return x;
    }

    public void setX(double newX) {
        this.x = newX;
    }

    public double getY() {
        return y;
    }

    public void setY(double newY) {
        this.y = newY;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
