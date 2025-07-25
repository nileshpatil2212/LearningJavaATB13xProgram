package Exercises_Task;

import java.util.Scanner;

public class TravelEligibility {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take age input
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        // Take visa status input
        System.out.print("Enter Visa Status (valid/invalid): ");
        String visaStatus = scanner.nextLine().toLowerCase();

        // Validate age
        if (age < 0) {
            System.out.println("Invalid age. Age must be non-negative.");
        }
        // Validate visa status
        else if (!visaStatus.equals("valid") && !visaStatus.equals("invalid")) {
            System.out.println("Invalid visa status. Must be 'valid' or 'invalid'.");
        }
        // Check travel eligibility
        else if (age >= 18 && visaStatus.equals("valid")) {
            System.out.println("Person is eligible to travel.");
        } else {
            System.out.println("Person is NOT eligible to travel.");
        }
    }
}
