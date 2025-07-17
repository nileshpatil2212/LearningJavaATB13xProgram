package Exercises_Task;

import java.util.Scanner;

public class Age_Check {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scanner.nextInt();

        if (age < 0){
            System.out.println("Invalid Age ,Enter positive number");
        } else if (age >=18) {
            System.out.println("Eligible to Vote");
        }else {
            System.out.println("Not Eligible to Vote");
        }
        scanner.close();
    }
}
