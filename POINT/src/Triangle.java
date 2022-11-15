public class Triangle {
    private Point a, b, c;
    public Triangle (Point a, Point b, Point c ) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String getType() {
        if (this.c.getDistance(this.a) == this.a.getDistance(this.b)) {
            if (this.c.getDistance(this.a) == this.b.getDistance(this.c)) {
                return "equilateral";
            } else {
                return "isosceles";
            }
        }
        return "scalene";
    }
}
