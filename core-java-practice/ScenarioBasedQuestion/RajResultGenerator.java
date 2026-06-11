import java.util.Scanner;

public class RajResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks for 5 subjects:");

        // Input using for loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / 5.0;

        System.out.println("\nAverage Marks: " + average);

        // Grade using switch
        int gradeCategory = (int) average / 10;

        switch (gradeCategory) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;

            case 8:
                System.out.println("Grade: B");
                break;

            case 7:
                System.out.println("Grade: C");
                break;

            case 6:
                System.out.println("Grade: D");
                break;

            default:
                System.out.println("Grade: F");
        }

        sc.close();
    }
}