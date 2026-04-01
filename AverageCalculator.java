import java.util.Scanner;


class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int sum = 0;

        try {
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter number " + i + ": ");
                int num = sc.nextInt();

                if (num < 0) {
                    throw new NegativeNumberException("Negative number entered: " + num);
                }

                sum += num;
            }

            double average = (double) sum / n;
            System.out.println("Average: " + average);

        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
          
        }

        sc.close();
    }
}
