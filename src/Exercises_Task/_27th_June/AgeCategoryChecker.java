package Exercises_Task._27th_June;

import java.util.Scanner;

public class AgeCategoryChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = scanner.nextInt();

        if (age < 0){
            System.out.println("Invalid age. Must be a non-negative number.");
        } else if (age <= 12) {
            System.out.println("Category : child ");
        } else if (age <= 19) {
            System.out.println("Category : Teenager ");
        } else if (age <= 64) {
            System.out.println("Category : Adult ");
        } else {
            System.out.println("Category: Senior Citizen");
        }

    }
}
