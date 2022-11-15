public class Cylinder {
    private final Circle circle;
    private final double height;
    public Cylinder(Circle c, double height) {
        this.circle = c;
        this.height = height;
    }
    public double getArea() { return 2*this.circle.getArea()+this.height*this.circle.getPerimeter(); }
    public double getVolume() { return this.circle.getArea()*this.height;
    }
}
