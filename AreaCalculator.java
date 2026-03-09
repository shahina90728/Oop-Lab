import java.util.Scanner;

class AreaCalculator {

    double area(double side) {
        return side * side;
    }

    double area(double length, double width) {
        return length * width;
    }

    double area(float radius) {
        return 3.1416 * radius * radius;
    }

    double area(double base, double height, boolean triangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator obj = new AreaCalculator();
        int choice = 0;

while (choice != 5) {
System.out.println("\n--- Area Calculator ---");
System.out.println("1. Square");
System.out.println("2. Rectangle");
System.out.println("3. Circle");
System.out.println("4. Triangle");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter side of square: ");
                    double side = sc.nextDouble();
                    System.out.println("Area of Square: " + obj.area(side));
                    break;
                case 2:
                    System.out.print("Enter length of rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width of rectangle: ");
                    double width = sc.nextDouble();
                    System.out.println("Area of Rectangle: " + obj.area(length, width));
                    break;
                case 3:
                    System.out.print("Enter radius of circle: ");
                    float radius = sc.nextFloat();
                    System.out.println("Area of Circle: " + obj.area(radius));
                    break;
                case 4:
                    System.out.print("Enter base of triangle: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height of triangle: ");
                    double height = sc.nextDouble();
                    System.out.println("Area of Triangle: " + obj.area(base, height, true));
                    break;
                case 5:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
