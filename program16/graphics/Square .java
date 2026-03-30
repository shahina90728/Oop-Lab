package graphics;
public class Square implements SquareInterface {
    double side;

    public Square(double s) {
        side = s;
    }
    public double area() {
        return side * side;
    }
}
