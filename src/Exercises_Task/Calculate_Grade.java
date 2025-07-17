package Exercises_Task;

import java.util.Scanner;

public class Calculate_Grade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a marks :");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100){
            System.out.println("Enter marks (0 to 100)");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("Grade : A+");
        }else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade : A");
        }else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade : B");
        }else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade : C");
        }else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade : D");
        }else if (marks >= 40 && marks <= 49) {
            System.out.println("Grade : E");
        }else {
            System.out.println("Fail");
        }
        scanner.close();
    }
}
