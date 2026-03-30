package arithmetic;

public class Divide implements DivideI {
    public double calculate(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a / b;
    }
}
