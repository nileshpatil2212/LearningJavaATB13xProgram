package Exercises_Task;

import java.util.Scanner;

public class NetSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter Basic Pay: ₹");
        double basic = scanner.nextDouble();

        // Validation
        if (basic <= 0) {
            System.out.println("Invalid Basic Pay. Must be a positive number.");
            return;
        }

        // Salary Component Calculations
        double hra = 0.20 * basic; // 20% HRA
        double da = 0.10 * basic;  // 10% DA
        double gross = basic + hra + da;

        // Tax Calculation
        double tax;
        if (gross <= 30000) {
            tax = 0;
        } else if (gross <= 50000) {
            tax = 0.10 * gross;
        } else if (gross <= 100000) {
            tax = 0.20 * gross;
        } else {
            tax = 0.30 * gross;
        }

        // Net Salary
        double netSalary = gross - tax;

        // Output
        System.out.println("\n----- Salary Breakdown -----");
        System.out.printf("Basic Pay        : ₹%.2f\n", basic);
        System.out.printf("HRA (20%%)        : ₹%.2f\n", hra);
        System.out.printf("DA (10%%)         : ₹%.2f\n", da);
        System.out.printf("Gross Salary     : ₹%.2f\n", gross);
        System.out.printf("Tax Deducted     : ₹%.2f\n", tax);
        System.out.printf("Net Salary       : ₹%.2f\n", netSalary);
    }
}
