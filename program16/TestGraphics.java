import java.util.Scanner;
import graphics.*;
public class TestGraphics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Circle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();

                    Rectangle r = new Rectangle(l, b);
                    System.out.println("Area of Rectangle: " + r.area());
                    break;

                case 2:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();

                    Triangle t = new Triangle(base, h);
                    System.out.println("Area of Triangle: " + t.area());
                    break;

                case 3:
                    System.out.print("Enter side: ");
                    double s = sc.nextDouble();

                    Square sq = new Square(s);
                    System.out.println("Area of Square: " + sq.area());
                    break;

                case 4:
                    System.out.print("Enter radius: ");
                    double rad = sc.nextDouble();

                    Circle c = new Circle(rad);
                    System.out.println("Area of Circle: " + c.area());
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 5);
        sc.close();
    }
}
