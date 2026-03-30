package graphics;
public class Rectangle implements RectangleInterface {
    double length, breadth;

    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    public double area() {
        return length * breadth;
    }
}
