import java.util.*;
interface BillCalculator {
    double calculate(int quantity, double unitPrice);
}
class Product implements BillCalculator {
    int productId;
    String productName;
    int quantity;
    double unitPrice;
    double total;

  
    Product(int productId, String productName, int quantity, double unitPrice) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.total = calculate(quantity, unitPrice);
    }


    public double calculate(int quantity, double unitPrice) {
        return quantity * unitPrice;
    }
}


public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order No: ");
        int orderNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Date: ");
        String date = sc.nextLine();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

      
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));

            System.out.print("Product ID: ");
            int pid = sc.nextInt();
            sc.nextLine();

            System.out.print("Product Name: ");
            String pname = sc.nextLine();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Unit Price: ");
            double price = sc.nextDouble();

            products[i] = new Product(pid, pname, qty, price);
        }

      
        double grandTotal = 0;

        System.out.println("\n================== BILL ==================");
        System.out.println("Order No : " + orderNo);
        System.out.println("Date     : " + date);
        System.out.println("==========================================");

        // Table Header
        System.out.printf("%-10s %-15s %-10s %-12s %-10s\n",
                "Prod ID", "Name", "Quantity", "Unit Price", "Total");

        System.out.println("----------------------------------------------------------");

        // Table Rows
        for (Product p : products) {
            System.out.printf("%-10d %-15s %-10d %-12.2f %-10.2f\n",
                    p.productId, p.productName, p.quantity, p.unitPrice, p.total);

            grandTotal += p.total;
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("%-49s %-10.2f\n", "Grand Total:", grandTotal);
        System.out.println("==========================================================");

        sc.close();
    }
}
