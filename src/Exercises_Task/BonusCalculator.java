package Exercises_Task;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of experience: ");
        int experience = scanner.nextInt();

        double bonus = 0;

        if (salary <= 0) {
            System.out.println("Invalid salary. Must be a positive number.");
        } else if (experience < 0) {
            System.out.println("Invalid experience. Must be non-negative.");
        } else if (experience < 1) {
            bonus = 0;
        } else if (experience <= 3) {
            bonus = 0.05 * salary;
        } else if (experience <= 6) {
            bonus = 0.10 * salary;
        } else {
            bonus = 0.15 * salary;
        }

        System.out.println("Bonus Amount: ₹" + bonus);
    }

    }

