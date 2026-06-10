import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input client's details
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        System.out.printf("BMI = %.2f%n", bmi);

        // Determine BMI category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

        sc.close();
    }
}