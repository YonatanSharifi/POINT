import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a point: ");
        double  x = scan.nextDouble(),
                y = scan.nextDouble();
        System.out.println("Please enter a 2nd point: ");
        double  x1 = scan.nextDouble(),
                y1 = scan.nextDouble();

        var p1 = new Point();
        p1.setX(x);
        p1.setY(y);
        System.out.println(p1);

        var p2 = new Point();
        p2.setX(x1);
        p2.setY(y1);
        System.out.println(p2);

        System.out.println("The distance is: " + p1.getDistance(p2));

        if (p2.isEquals(p1)) System.out.println("The points are equals");

        System.out.println("Please enter a point and radius");
        double radius = scan.nextDouble(),
                x2 = scan.nextDouble(),
                y2 = scan.nextDouble();

        var p3 = new Point();
        p2.setX(x2);
        p2.setY(y2);

        var point = new Circle(p3, radius);
        point.setRadius(radius);
        System.out.println("The Area of the circle is: " + point.getArea());
        System.out.println("The Perimeter of the circle is: " + point.getPerimeter());

        System.out.println("Enter height for cylinder: ");
        double height = scan.nextDouble();
        var cylinder = new Cylinder(point , height);
        System.out.println("The cylinder area: " + cylinder.getArea());
        System.out.println("The cylinder volume: " + cylinder.getVolume());

        var triangle = new Triangle(p1, p2, p3);
        System.out.println("The points that you entered made triangle by the type of: " + triangle.getType());

        System.out.println("Enter a date: ");
        int day = scan.nextInt(),
                month = scan.nextInt(),
                year = scan.nextInt();

        System.out.println("Enter 2nd date: ");
        int day2 = scan.nextInt(),
                month2 = scan.nextInt(),
                year2 = scan.nextInt();

        var date1 = new Date(day, month, year);
        var date2 = new Date(day2, month2, year2);

        if (date1.isEquals(date2)) System.out.println("The dates are equals");

        }
    }