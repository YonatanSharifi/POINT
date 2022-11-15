public class Circle {
    private final Point point;
    private double radius;
    public void setRadius(double radius) { this.radius = radius; }
    public Circle( Point c,double radius ) {
        this.point = c;
        this.radius = radius;
    }
    public double getArea() { return Math.PI*Math.pow(this.radius, 2); }
    public double getPerimeter() { return Math.PI*2*this.radius; }
}
