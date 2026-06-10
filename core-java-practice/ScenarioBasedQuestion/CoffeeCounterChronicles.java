import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double GST_RATE = 0.18; // 18% GST

        while (true) {
            System.out.print("\nEnter coffee type (Espresso/Latte/Cappuccino) or 'exit' to quit: ");
            String coffeeType = sc.next();

            if (coffeeType.equalsIgnoreCase("exit")) {
                break;
            }

            double price = 0;

            // Determine coffee price
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;

                case "latte":
                    price = 150;
                    break;

                case "cappuccino":
                    price = 180;
                    break;

                default:
                    System.out.println("Invalid coffee type.");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double bill = price * quantity;
            double gst = bill * GST_RATE;
            double totalBill = bill + gst;

            System.out.println("Bill Amount = ₹" + bill);
            System.out.println("GST = ₹" + gst);
            System.out.println("Total Bill = ₹" + totalBill);
        }

        System.out.println("Cafe closed.");
        sc.close();
    }
}