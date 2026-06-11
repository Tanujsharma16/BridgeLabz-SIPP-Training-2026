import java.util.Scanner;

public class ParkingLotSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int CAPACITY = 10;
        int occupied = 0;

        while (true) {

            if (occupied == CAPACITY) {
                System.out.println("\nParking Lot Full!");
            }

            System.out.println("\n===== Parking Menu =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Quit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (occupied < CAPACITY) {
                        occupied++;
                        System.out.println("Vehicle parked successfully.");
                    } else {
                        System.out.println("No space available.");
                    }
                    break;

                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Parking lot is empty.");
                    }
                    break;

                case 3:
                    System.out.println("Occupied Slots: " + occupied);
                    System.out.println("Available Slots: " + (CAPACITY - occupied));
                    break;

                case 4:
                    System.out.println("Exiting Parking System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}