import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial smart card balance: ₹");
        double balance = sc.nextDouble();

        while (balance > 0) {
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance traveled in km (-1 to quit): ");
            int distance = sc.nextInt();

            if (distance == -1) {
                System.out.println("Thank you for using Delhi Metro!");
                break;
            }

            // Fare using ternary operator
            double fare = (distance <= 5) ? 10 :
                          (distance <= 15) ? 20 :
                          (distance <= 25) ? 30 : 40;

            if (fare > balance) {
                System.out.println("Insufficient balance.");
                break;
            }

            balance -= fare;

            System.out.println("Fare Deducted: ₹" + fare);
            System.out.println("Remaining Balance: ₹" + balance);
        }

        if (balance <= 0) {
            System.out.println("Smart card balance exhausted.");
        }

        sc.close();
    }
}