package graphics;
public class Circle implements CircleInterface {
    double radius;

    public Circle(double r) {
        radius = r;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
