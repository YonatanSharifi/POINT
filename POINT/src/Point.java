public class Point {
    private double x,y;
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public String toString() {

        return "(" + x + ", " + y +")";
    }
    public boolean isEquals(Point p) {
        return p.x==this.x && p.y==this.y;
    }
    public double getDistance(Point p) {
        return Math.sqrt((p.x-this.x)*(p.x-this.x) + (p.y-this.y)*(p.y-this.y)); }
}
