public class LinearEquation {
    private double a, b, c, d, e, f, g, h;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public LinearEquation(double a, double b, double c,
          double d, double e, double f, double g, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

    public boolean isIntersecting() {
        double a = this.b - this.d;
        double b = this.a - this.c;
        double c = this.f - this.h;
        double d = this.e - this.g;

        return a * d - b * c != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    // Solve the Linear equation
    public double[] getIntersection() {
        /* ax + by = e
           cx + dy = f
           x = e * d - b * f / a * d - b * c
           y = a * f - e * c / a * d - b * c */
        // Let points a, b = x1, y1
        // Let points c, d = x2, y2
        // Let points e, f = x3, y3
        // Let points g, h = x4, y4
        // Let a = (b - d), b = (a - c), e = a * x1 - b * y1
        // Let c = (f - h), d = (e - g), f = c * x3 - d * y3
        double a = this.b - this.d;
        double b = this.a - this.c;
        double e = a * this.a - b * this.b;
        double c = this.f - this.h;
        double d = this.e - this.g;
        double f = c * this.e - d * this.f;

        double determinant = a * d - b * c;

        double x = (e * d - b * f) / determinant;
        double y = (a * f - e * c) / determinant;

        return new double[] {x, y};
    }
}
